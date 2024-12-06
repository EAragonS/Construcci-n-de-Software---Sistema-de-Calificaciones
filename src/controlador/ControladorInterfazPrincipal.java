package controlador;

import modelo.Alumno;
import modelo.GestionAlumnos;
import vista.InterfazPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Calificacion;
import javax.swing.JOptionPane;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class ControladorInterfazPrincipal {

    private final GestionAlumnos gestionAlumnos;
    private final InterfazPrincipal vista;

    public ControladorInterfazPrincipal(InterfazPrincipal vista) {
        this.gestionAlumnos = new GestionAlumnos();
        this.vista = vista;
        configurarListeners();
    }

    private void configurarListeners() {
        vista.getBotonAgregarAlumno().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarAlumno();
            }
        });

        vista.getBotonCargarArchivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarArchivoAlumnos();
            }
        });

        vista.getBotonGuardarListaAlumnos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarArchivoAlumnos();
            }
        });
        
        vista.getBotonCrearPDF().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearPDF();
            }
        });
    }

    public void agregarAlumno() {
        try {
            String matricula = vista.getCampoMatricula().getText();
            String apellidoPaterno = vista.getCampoApellidoPaterno().getText();
            String apellidoMaterno = vista.getCampoApellidoMaterno().getText();
            String nombre = vista.getCampoNombre().getText();
            String asignatura = (String) vista.getCampoAsignatura().getSelectedItem();
            int calificacion = (int) vista.getCampoCalificacion().getValue();

            Alumno alumno = new Alumno(matricula, apellidoPaterno, apellidoMaterno, nombre);
            alumno.agregarCalificacion(new Calificacion(asignatura, calificacion));
            gestionAlumnos.agregarAlumno(alumno);

            actualizarVistaConAlumnos(gestionAlumnos.getListaAlumnos());

            // Limpia los campos de texto después de agregar el alumno
            vista.getCampoMatricula().setText("");
            vista.getCampoApellidoPaterno().setText("");
            vista.getCampoApellidoMaterno().setText("");
            vista.getCampoNombre().setText("");
            vista.getCampoAsignatura().setSelectedIndex(0);
            vista.getCampoCalificacion().setValue(0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al agregar alumno: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Actualiza la vista con los datos actuales del modelo.
     *
     * @param alumnos Lista de alumnos que se mostrará en la tabla.
     */
    private void actualizarVistaConAlumnos(List<Alumno> alumnos) {
        String[] encabezados = {"Matrícula", "Apellido Paterno", "Apellido Materno", "Nombre", "Asignatura", "Calificación"};
        DefaultTableModel modeloTabla = new DefaultTableModel(encabezados, 0);

        for (Alumno alumno : alumnos) {
            for (Calificacion calificacion : alumno.getCalificaciones()) {
                modeloTabla.addRow(new Object[]{
                    alumno.getMatricula(),
                    alumno.getApellidoPaterno(),
                    alumno.getApellidoMaterno(),
                    alumno.getNombre(),
                    calificacion.getAsignatura(),
                    calificacion.getCalificacion()
                });
            }
        }

        vista.getTablaAlumnos().setModel(modeloTabla);
    }

    /**
     * Carga un archivo con datos de alumnos y actualiza la tabla.
     */
    public void cargarArchivoAlumnos() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV", "csv"));
        int seleccion = fileChooser.showOpenDialog(vista);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            List<Alumno> alumnos = gestionAlumnos.cargarArchivo(archivoSeleccionado.getAbsolutePath());
            actualizarVistaConAlumnos(alumnos);
        }
    }
    
    private void crearPDF() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PDF", "pdf"));

        if (fileChooser.showSaveDialog(vista) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String rutaArchivo = file.getAbsolutePath();
            if (!rutaArchivo.toLowerCase().endsWith(".pdf")) {
                rutaArchivo += ".pdf";
            }

            try {
                Document documento = new Document();
                PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
                documento.open();

                documento.add(new Paragraph("Lista de Alumnos"));
                documento.add(new Paragraph("\n"));

                PdfPTable tabla = new PdfPTable(6); // 6 columnas
                tabla.addCell("Matrícula");
                tabla.addCell("Apellido Paterno");
                tabla.addCell("Apellido Materno");
                tabla.addCell("Nombre");
                tabla.addCell("Asignatura");
                tabla.addCell("Calificación");

                DefaultTableModel modeloTabla = (DefaultTableModel) vista.getTablaAlumnos().getModel();
                for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                    for (int j = 0; j < modeloTabla.getColumnCount(); j++) {
                        tabla.addCell(modeloTabla.getValueAt(i, j).toString());
                    }
                }

                documento.add(tabla);
                documento.close();

                JOptionPane.showMessageDialog(vista, "PDF creado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(vista, "Error al crear el PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Guarda los datos de los alumnos en un archivo.
     */
    public void guardarArchivoAlumnos() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV", "csv"));
        int seleccion = fileChooser.showSaveDialog(vista);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            gestionAlumnos.guardarListaDeAlumnos(archivoSeleccionado.getAbsolutePath());
        }
    }
}
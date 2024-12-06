package vista;

import javax.swing.*;
import java.awt.*;
import controlador.ControladorVistaPrincipal;

/**
 *
 * @author Elias Aragón
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private ControladorVistaPrincipal controlador;

    public VistaPrincipal() {
        initComponents();
        this.controlador = new ControladorVistaPrincipal(this);
    }
    
    public javax.swing.JButton getBotonAgregarAlumno() {
        return botonAgregarAlumno;
    }

    public javax.swing.JButton getBotonCargarArchivo() {
        return botonCargarArchivo;
    }

    public javax.swing.JButton getBotonGuardarListaAlumnos() {
        return botonGuardarListaAlumnos;
    }
    
    public javax.swing.JButton getBotonCrearPDF() {
        return botonCrearPDF;
    }
    
    public JButton getBotonEliminarAlumno() {
        return botonEliminarAlumno;
    }

    public javax.swing.JTextField getCampoApellidoMaterno() {
        return campoApellidoMaterno;
    }

    public javax.swing.JTextField getCampoApellidoPaterno() {
        return campoApellidoPaterno;
    }

    public javax.swing.JComboBox<String> getCampoAsignatura() {
        return campoAsignatura;
    }

    public javax.swing.JSpinner getCampoCalificacion() {
        return campoCalificacion;
    }

    public javax.swing.JTextField getCampoMatricula() {
        return campoMatricula;
    }

    public javax.swing.JTextField getCampoNombre() {
        return campoNombre;
    }

    public javax.swing.JTable getTablaAlumnos() {
        return tablaAlumnos;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaMatricula = new javax.swing.JLabel();
        etiquetaApellidoPaterno = new javax.swing.JLabel();
        etiquetaApellidoMaterno = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        campoApellidoPaterno = new javax.swing.JTextField();
        campoApellidoMaterno = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        botonAgregarAlumno = new javax.swing.JButton();
        botonCargarArchivo = new javax.swing.JButton();
        botonGuardarListaAlumnos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        etiquetaAsignatura = new javax.swing.JLabel();
        etiquetaCalificacion = new javax.swing.JLabel();
        botonCrearPDF = new javax.swing.JButton();
        campoAsignatura = new javax.swing.JComboBox<>();
        campoCalificacion = new javax.swing.JSpinner();
        botonEliminarAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaMatricula.setText("Matricula:");

        etiquetaApellidoPaterno.setText("Apellido Paterno:");

        etiquetaApellidoMaterno.setText("Apellido Materno:");

        etiquetaNombre.setText("Nombre:");

        botonAgregarAlumno.setText("Agregar Alumno");

        botonCargarArchivo.setText("Cargar Archivo");

        botonGuardarListaAlumnos.setText("Guardar Lista de Alumnos");

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Apellido Paterno", "Apellido Materno", "Nombre", "Asignatura", "Calificacion"
            }
        ));
        jScrollPane1.setViewportView(tablaAlumnos);

        etiquetaAsignatura.setText("Asignatura:");

        etiquetaCalificacion.setText("Calificacion:");

        botonCrearPDF.setText("Crear PDF");

        campoAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diseño de Software", "Aseguramiento de la Calidad", "Construcción de Software", "Diseño de Bases de Datos", "Arquitectura de Computadoras", "Diseño Gráfico" }));

        campoCalificacion.setModel(new javax.swing.SpinnerNumberModel(70, 0, 100, 1));

        botonEliminarAlumno.setText("Eliminar Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(etiquetaAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCargarArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardarListaAlumnos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCrearPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(botonAgregarAlumno)
                .addGap(50, 50, 50)
                .addComponent(botonEliminarAlumno)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaMatricula)
                    .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaApellidoPaterno)
                            .addComponent(campoApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCargarArchivo)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApellidoMaterno)
                    .addComponent(campoApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaNombre))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaAsignatura)
                            .addComponent(campoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCrearPDF))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCalificacion)
                            .addComponent(campoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregarAlumno)
                            .addComponent(botonEliminarAlumno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botonGuardarListaAlumnos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarAlumno;
    private javax.swing.JButton botonCargarArchivo;
    private javax.swing.JButton botonCrearPDF;
    private javax.swing.JButton botonEliminarAlumno;
    private javax.swing.JButton botonGuardarListaAlumnos;
    private javax.swing.JTextField campoApellidoMaterno;
    private javax.swing.JTextField campoApellidoPaterno;
    private javax.swing.JComboBox<String> campoAsignatura;
    private javax.swing.JSpinner campoCalificacion;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaApellidoMaterno;
    private javax.swing.JLabel etiquetaApellidoPaterno;
    private javax.swing.JLabel etiquetaAsignatura;
    private javax.swing.JLabel etiquetaCalificacion;
    private javax.swing.JLabel etiquetaMatricula;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables


}

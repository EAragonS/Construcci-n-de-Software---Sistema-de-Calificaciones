package modelo;

import java.io.File;
import java.util.List;
import modelo.dao.AlumnoDAO;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 * Clase para gestionar la lógica de negocio relacionada con alumnos.
 */
public class GestionAlumnos {
    public AlumnoDAO alumnoDAO;

    /**
     * Constructor principal que inicializa el DAO.
     */
    public GestionAlumnos() {
        this.alumnoDAO = new AlumnoDAO();
    }

    /**
     * Carga un archivo con datos de alumnos.
     *
     * @param rutaArchivo Ruta del archivo CSV.
     * @return Lista de alumnos cargada desde el archivo.
     */
    public List<Alumno> cargarArchivo(String rutaArchivo) {
        return alumnoDAO.cargarAlumnos(rutaArchivo);
    }

    /**
     * Guarda la lista de alumnos en un archivo CSV.
     *
     * @param rutaArchivo Ruta donde se guardará el archivo CSV.
     */
    public void guardarListaDeAlumnos(String rutaArchivo) {
        alumnoDAO.exportarAlumnos(rutaArchivo);
    }

    /**
     * Agrega un nuevo alumno a la lista.
     *
     * @param alumno Alumno a agregar.
     */
    public void agregarAlumno(Alumno alumno) {
        alumnoDAO.getListaAlumnos().add(alumno);
    }

    /**
     * Obtiene la lista de alumnos.
     *
     * @return Lista de alumnos.
     */
    public List<Alumno> getListaAlumnos() {
        return alumnoDAO.getListaAlumnos();
    }
}

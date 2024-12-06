package controlador;

import modelo.dao.UsuarioDAO;
import vista.InterfazInicioSesion;
import vista.InterfazPrincipal;
import modelo.Usuario;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ControladorInicioSesion {
    private InterfazInicioSesion vista;
    private UsuarioDAO modeloUsuario;
    private static final String RUTA_ARCHIVO_CSV = "/Users/ellysxd/NetBeansProjects/RefactorizacionSistemaCalificaciones/datos/usuarios.csv"; // Placeholder para la ruta del archivo CSV

    public ControladorInicioSesion(InterfazInicioSesion vista) {
        this.vista = vista;
        this.modeloUsuario = new UsuarioDAO();
        this.modeloUsuario.cargarUsuarios(RUTA_ARCHIVO_CSV);
        this.vista.escucaharIniciarSesion(this::manejarBotonIniciarSesion);
    }

    private void manejarBotonIniciarSesion(ActionEvent e) {
        String nombreUsuario = vista.obtenerNombreUsuario();
        String contrasena = vista.obtenerContrasena();

        if (autenticarUsuario(nombreUsuario, contrasena)) {
            JOptionPane.showMessageDialog(vista, "Inicio de sesión exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            vista.setVisible(false);
            vista.dispose();

            InterfazPrincipal nuevaVista = new InterfazPrincipal();
            nuevaVista.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(vista, "Nombre de usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean autenticarUsuario(String nombreUsuario, String contrasena) {
        return modeloUsuario.validarContrasena(nombreUsuario, contrasena);
    }
}
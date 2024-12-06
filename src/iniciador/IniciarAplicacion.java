package iniciador;

import javax.swing.SwingUtilities;
import vista.VistaInicioSesion;
import controlador.ControladorInicioSesion;

public class IniciarAplicacion {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear la vista de inicio de sesión
            VistaInicioSesion vistaInicio = new VistaInicioSesion();

            // Crear el controlador de inicio de sesión, que gestionará las transiciones
            new ControladorInicioSesion(vistaInicio);

            // Mostrar la ventana de inicio de sesión
            vistaInicio.setVisible(true);
        });
    }
}

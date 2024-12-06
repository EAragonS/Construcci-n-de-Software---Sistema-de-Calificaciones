package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaInicioSesion extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private JButton botonIniciarSesion;
    private JButton botonCancelar;

    public VistaInicioSesion() {
        setTitle("Iniciar Sesión");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.insets = new Insets(10, 10, 10, 10);

        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        panel.add(etiquetaUsuario, restricciones);

        campoUsuario = new JTextField(20);
        campoUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        panel.add(campoUsuario, restricciones);
        campoUsuario.setPreferredSize(new Dimension(250, 30));

        JLabel etiquetaContrasena = new JLabel("Contraseña:");
        etiquetaContrasena.setFont(new Font("Arial", Font.BOLD, 14));
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        panel.add(etiquetaContrasena, restricciones);

        campoContrasena = new JPasswordField(20);
        campoContrasena.setFont(new Font("Arial", Font.PLAIN, 14));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        panel.add(campoContrasena, restricciones);
        campoContrasena.setPreferredSize(new Dimension(250, 30));

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));

        botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.setFont(new Font("Arial", Font.BOLD, 14));
        botonIniciarSesion.setPreferredSize(new Dimension(150, 40));
        panelBotones.add(botonIniciarSesion);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setFont(new Font("Arial", Font.BOLD, 14));
        botonCancelar.setPreferredSize(new Dimension(150, 40));
        panelBotones.add(botonCancelar);

        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 2;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.CENTER;
        panel.add(panelBotones, restricciones);

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(panel);
    }

    public void escucaharIniciarSesion(ActionListener listener) {
        botonIniciarSesion.addActionListener(listener);
    }

    public String obtenerNombreUsuario() {
        return campoUsuario.getText();
    }

    public String obtenerContrasena() {
        return new String(campoContrasena.getPassword());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VistaInicioSesion interfaz = new VistaInicioSesion();
                interfaz.setVisible(true);
            }
        });
    }
}
package Login;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

public class Contrasena extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Contrasena frame = new Contrasena();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Contrasena() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(10, 63, 77, 14);
        contentPane.add(lblUsuario);

        JLabel lblContrasena = new JLabel("Contraseña");
        lblContrasena.setBounds(10, 90, 77, 14);
        contentPane.add(lblContrasena);

        JFormattedTextField txtUsuario = new JFormattedTextField();
        txtUsuario.setBounds(85, 60, 120, 20);
        contentPane.add(txtUsuario);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setBounds(85, 87, 120, 20);
        contentPane.add(txtContrasena);

        JLabel lblResultado = new JLabel(" ");
        lblResultado.setBounds(10, 180, 300, 20);
        contentPane.add(lblResultado);

        JButton btnComprobar = new JButton("Comprobar");
        btnComprobar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = new String(txtContrasena.getPassword());

       
                if (usuario.equals("admin") && contrasena.equals("1234")) {
                    lblResultado.setText("Es correcto");
                } else {
                    lblResultado.setText("Usuario o contraseña incorrectos");
                }
            }
        });
        btnComprobar.setBounds(85, 115, 120, 23);
        contentPane.add(btnComprobar);
    }
}


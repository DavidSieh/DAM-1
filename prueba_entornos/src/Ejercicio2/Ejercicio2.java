package Ejercicio2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private JFormattedTextField txtNombre;
    private JComboBox<String> comboProvincia;
    private JCheckBox chkJava, chkCC;
    private JRadioButton rdbEstudiante, rdbTrabajador;
    private JSlider sliderNivel;

   
    private JLabel lblNombreOut, lblProvinciaOut, lblEstadoOut, lblConOut, lblNivelOut;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Ejercicio2 frame = new Ejercicio2();
            frame.setVisible(true);
        });
    }

    public Ejercicio2() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 52, 68, 14);
        contentPane.add(lblNombre);

        txtNombre = new JFormattedTextField();
        txtNombre.setBounds(80, 49, 100, 20);
        contentPane.add(txtNombre);

        lblNombreOut = new JLabel("");
        lblNombreOut.setForeground(Color.RED);
        lblNombreOut.setBounds(220, 52, 200, 14);
        contentPane.add(lblNombreOut);

        JLabel lblProvincia = new JLabel("Provincia:");
        lblProvincia.setBounds(10, 77, 59, 14);
        contentPane.add(lblProvincia);

        comboProvincia = new JComboBox<>();
        comboProvincia.setModel(new DefaultComboBoxModel<>(new String[]{"", "Ávila", "Aviles", "León"}));
        comboProvincia.setBounds(80, 73, 100, 22);
        contentPane.add(comboProvincia);

        lblProvinciaOut = new JLabel("");
        lblProvinciaOut.setForeground(Color.RED);
        lblProvinciaOut.setBounds(220, 77, 200, 14);
        contentPane.add(lblProvinciaOut);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(10, 102, 68, 14);
        contentPane.add(lblEstado);

        rdbEstudiante = new JRadioButton("Estudiante");
        rdbEstudiante.setBounds(80, 98, 109, 23);
        contentPane.add(rdbEstudiante);

        rdbTrabajador = new JRadioButton("Trabajador");
        rdbTrabajador.setBounds(80, 122, 109, 23);
        contentPane.add(rdbTrabajador);

        ButtonGroup grupoEstado = new ButtonGroup();
        grupoEstado.add(rdbEstudiante);
        grupoEstado.add(rdbTrabajador);

        lblEstadoOut = new JLabel("");
        lblEstadoOut.setForeground(Color.RED);
        lblEstadoOut.setBounds(220, 115, 200, 20);
        contentPane.add(lblEstadoOut);

        JLabel lblCon = new JLabel("Conocimientos:");
        lblCon.setBounds(10, 160, 120, 14);
        contentPane.add(lblCon);

        chkJava = new JCheckBox("Java");
        chkJava.setBounds(130, 155, 83, 23);
        contentPane.add(chkJava);

        chkCC = new JCheckBox("C/C++");
        chkCC.setBounds(130, 180, 83, 23);
        contentPane.add(chkCC);

        lblConOut = new JLabel("");
        lblConOut.setForeground(Color.RED);
        lblConOut.setBounds(220, 162, 250, 20);
        contentPane.add(lblConOut);

        JLabel lblNivelIngles = new JLabel("Nivel Inglés:");
        lblNivelIngles.setBounds(10, 210, 100, 14);
        contentPane.add(lblNivelIngles);

        sliderNivel = new JSlider(1,10,5);
        sliderNivel.setPaintTicks(true);
        sliderNivel.setPaintLabels(true);
        sliderNivel.setMajorTickSpacing(1);
        sliderNivel.setBounds(100, 205, 200, 50);
        contentPane.add(sliderNivel);

        lblNivelOut = new JLabel("");
        lblNivelOut.setForeground(Color.RED);
        lblNivelOut.setBounds(320, 210, 100, 20);
        contentPane.add(lblNivelOut);

        JButton btnMostrarDatos = new JButton("Mostrar Datos");
        btnMostrarDatos.setBounds(200, 270, 130, 25);
        contentPane.add(btnMostrarDatos);

      
        btnMostrarDatos.addActionListener(e -> mostrarDatos());
    }

    private void mostrarDatos() {

        lblNombreOut.setText(txtNombre.getText());
        lblProvinciaOut.setText(comboProvincia.getSelectedItem().toString());

        if (rdbEstudiante.isSelected()) {
            lblEstadoOut.setText("Estudiante");
        } else if (rdbTrabajador.isSelected()) {
            lblEstadoOut.setText("Trabajador");
        } else {
            lblEstadoOut.setText("Sin definir");
        }

        String conocimientos = "";
        if (chkJava.isSelected()) conocimientos += " Java ";
        if (chkCC.isSelected()) conocimientos += " C/C++ ";

        lblConOut.setText(conocimientos.isEmpty() ? "Ninguno" : conocimientos);

        lblNivelOut.setText(String.valueOf(sliderNivel.getValue()));
    }
}


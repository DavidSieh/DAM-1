package Prueba01;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Prueba01_ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private int Num;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba01_ejercicio2 frame = new Prueba01_ejercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba01_ejercicio2() {
		 Num = (int)(Math.random()*100)+1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("He pensado un número entre 1 y 100");
		lblNewLabel_4.setBounds(35, 46, 252, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(35, 76, 86, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setBounds(35, 115, 200, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JButton Comprobar = new JButton("Comprobar");
		Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double nota1 = Double.parseDouble(textField.getText());
				
					
					if (Num == nota1) {
						lblNewLabel_4_1.setText("¡Correcto! Ese era el número.");
					}else{
						lblNewLabel_4_1.setText("Demasiado bajo.Intenta de nuevo");
						
					}
					
			}
			
		});
		Comprobar.setBounds(146, 75, 103, 23);
		getContentPane().add(Comprobar);
		
		JButton btnNuevoNmero = new JButton("Nuevo número");
		btnNuevoNmero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Nuevo = Double.parseDouble(textField.getText());
				
					
					if (Num == Nuevo) {
						lblNewLabel_4_1.setText("Nuevo Número,¡Correcto! Ese era el número.");
					}else{
						lblNewLabel_4_1.setText("Nuevo Número,¡Demasiado bajo.Intenta de nuevo");
						
					}
					
			}
		
	});
	btnNuevoNmero.setBounds(83, 140, 122, 23);
	contentPane.add(btnNuevoNmero);
		
		
	
	}
}

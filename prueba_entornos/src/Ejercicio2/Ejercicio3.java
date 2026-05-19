package Ejercicio2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prueba_entornos.prueba_2;

public class Ejercicio3 extends JFrame {
	public Ejercicio3() {
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba_2 frame = new prueba_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void prueba_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 616);
		getContentPane().setLayout(null);
		
		JLabel lblCalculo = new JLabel("Peso");
		lblCalculo.setBounds(32, 90, 68, 14);
		getContentPane().add(lblCalculo);
		
		JLabel lblaltura = new JLabel("Altura");
		lblaltura.setBounds(30, 129, 46, 14);
		getContentPane().add(lblaltura);
		
		JFormattedTextField peso1 = new JFormattedTextField();
		peso1.setBounds(69, 87, 86, 20);
		getContentPane().add(peso1);
		
		JFormattedTextField altura1 = new JFormattedTextField();
		altura1.setBounds(69, 126, 86, 20);
		getContentPane().add(altura1);
		
		JLabel lblImc = new JLabel("imc");
		lblImc.setBounds(32, 167, 222, 14);
		getContentPane().add(lblImc);
		
		JButton btnNewButton = new JButton("Calculo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double peso = Double.parseDouble(peso1.getText());
					double altura = Double.parseDouble(altura1.getText());
					double imc = peso / (altura*altura);
					lblImc.setText(Double.toString(imc));
			}
			
		});
		btnNewButton.setBounds(66, 205, 89, 23);
		getContentPane().add(btnNewButton);
		
		

	}
}

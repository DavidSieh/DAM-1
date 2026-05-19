import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Prueba01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField promoRepite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba01 frame = new Prueba01();
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
	public Prueba01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(85, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 62, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 93, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(85, 124, 86, 20);
		contentPane.add(textField_3);
		
		JLabel Nota1 = new JLabel("Nota 1:");
		Nota1.setBounds(8, 28, 46, 14);
		contentPane.add(Nota1);
		
		JLabel Nota2 = new JLabel("Nota 2:");
		Nota2.setBounds(8, 65, 46, 14);
		contentPane.add(Nota2);
		
		JLabel Nota3 = new JLabel("Nota 3:");
		Nota3.setBounds(8, 96, 46, 14);
		contentPane.add(Nota3);
		
		JLabel Promedio = new JLabel("Promedio:");
		Promedio.setBounds(8, 127, 67, 14);
		contentPane.add(Promedio);
		
		JButton Calculo = new JButton("Calcular");
		Calculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double nota1 = Double.parseDouble(textField.getText());
					double nota2 = Double.parseDouble(textField_1.getText());
					double nota3 = Double.parseDouble(textField_2.getText());
					double media = (nota1+nota2+nota3)/3;
					textField_3.setText(Double.toString(media));
					
					if (media>=5) {
						promoRepite.setText("Promociona");
					}else {
						promoRepite.setText("Repite Curso");
					}
					
			}
			
		});
		Calculo.setBounds(216, 81, 89, 23);
		getContentPane().add(Calculo);
		
		lblNewLabel_4 = new JLabel("El alumno se encuentra:");
		lblNewLabel_4.setBounds(8, 223, 150, 14);
		contentPane.add(lblNewLabel_4);
		
		promoRepite = new JTextField();
		promoRepite.setColumns(10);
		promoRepite.setBounds(156, 220, 86, 20);
		contentPane.add(promoRepite);
		
		

	}
}

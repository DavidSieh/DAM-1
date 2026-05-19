package fraydiegotadeo.Examen_practica;

import java.time.LocalDate;
import java.util.Random;

public class Tarjeta_identificacion {
	
	protected String nombre;
	protected String raza;
	protected String sexo;
	protected int edad;
	protected char [][] QR;
	protected LocalDate Fecha;
	protected double Gasto;
	
	
	public Tarjeta_identificacion(String nombre, String raza, String sexo, int edad, char[][] QR, LocalDate fecha,double Gasto) {
	
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.QR = generarCodigoQR();
		this.Fecha=  LocalDate.now(); 
		this.Gasto=Gasto;
	}


	protected char[][] generarCodigoQR() {
		char[][] qr = new char[5][5]; 
		Random r = new Random(); 
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5; j++) { 
				qr[i][j] = r.nextBoolean() ? '#' : ' '; } 
			} return qr;
	}
	
	public String imprimirQR() {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < QR.length; i++) {
	        for (int j = 0; j < QR[i].length; j++) {
	            sb.append(QR[i][j]);
	        }
	        sb.append("\n");
	    }
	    return sb.toString();
	}



	public double getGasto() {
		return Gasto;
	}


	public void setGasto(double Gasto) {
		this.Gasto = Gasto;
	}


	public LocalDate getFecha() {
		return Fecha;
	}


	public void setFecha(LocalDate Fecha) {
		
		this.Fecha = Fecha;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String isSexo() {
		
		return sexo;
	}


	public void setSexo(String sexo) {
		
		this.sexo = sexo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char[][] getQR() {
		return QR;
	}


	public void setQR(char[][] QR) {
		this.QR = QR;
	}
	
	
}

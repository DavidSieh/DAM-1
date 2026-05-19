package FrayDiegoTadeo.Examen02;

import java.util.Random;

public class TarjetaId {
	
	//Atributos
	private final int TAMQR = 5; // tamaño código QR
	//private static int id = 0;
	private String nombreDuenio;
	private String raza;
	private boolean macho; // true si es macho
	private int edad;
	private char [][] qrCodigo;
	
	//Constructor principal de la tarjeta 
	public TarjetaId(String nombreDuenio, String raza, boolean macho, int edad, char[][] qrCodigo) {
		this.nombreDuenio = nombreDuenio;
		this.raza = raza;
		this.macho = macho;
		this.edad = edad;
		this.qrCodigo = generarCodigoQR();
	}

		
	private char[][] generarCodigoQR() {
		char[][] qr = new char[5][5]; 
		Random r = new Random(); 
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5; j++) { 
				qr[i][j] = r.nextBoolean() ? '#' : ' '; } 
			} return qr;
	}

	public String imprimirQR() {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < qrCodigo.length; i++) {
	        for (int j = 0; j < qrCodigo[i].length; j++) {
	            sb.append(qrCodigo[i][j]);
	        }
	        sb.append("\n");
	    }
	    return sb.toString();
	}

	// Mostrar la tarjeta de identificación
		@Override
		public String toString() {
			return "\nDueño: " + nombreDuenio + 
					"\nRaza: " + raza + " - " 
					+ (macho ? "Macho" : "Hembra") + 
					" - " + edad + " años" 
					+ imprimirQR();
		}
	
	//setters y getters
	
	
	public String getNombreDuenio() {
		return nombreDuenio;
	}


	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public boolean isMacho() {
		return macho;
	}


	public void setMacho(boolean macho) {
		this.macho = macho;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char[][] getQrCodigo() {
		return qrCodigo;
	}


	public void setQrCodigo(char[][] qrCodigo) {
		this.qrCodigo = qrCodigo;
	}


	public int getTAMQR() {
		return TAMQR;
	}
	
}

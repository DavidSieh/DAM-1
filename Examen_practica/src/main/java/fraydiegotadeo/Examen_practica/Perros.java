package fraydiegotadeo.Examen_practica;

import java.time.LocalDate;

public class Perros extends Tarjeta_identificacion {

	private String velocidad;
	private boolean rastrea;
	private boolean adoptado;
	
	public Perros(String nombre, String raza, String sexo, int edad, char[][] QR,LocalDate Fecha,double Gasto, String velocidad,boolean rastrea,boolean adoptado) {
		super(nombre, raza, sexo, edad, QR, Fecha, Gasto);
	
		this.velocidad=velocidad;
		this.rastrea=rastrea;
		this.adoptado=adoptado;
	}
	
	private double calculoGastoP() {
		if (rastrea == false) {
			return 36;
		}if (rastrea == true);{
			return 24;
		}
		
	}
	
	public boolean getAdoptados() {
		return adoptado;
		
	}
	
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	
	public boolean getRastrea() {
		return rastrea;
	}

	public void setRastrea(boolean rastrea) {
		this.rastrea = rastrea;
	}

	


	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return "Identificación de adopción:" + 
				"\nNombre: " + nombre + 
				"\nRaza: " + raza + 
				"\nEdad del animal: " + edad +
				"\nSexo del animal: " + sexo +
				"\nFecha de adopción: " + Fecha +
				"\n¿El animal rastrea?: " + rastrea + calculoGastoP()+
				"\nVelocidad del animal: " + velocidad+
				"\nQR del animal:\n " + imprimirQR();

}

	public boolean isAdoptado() {
		// TODO Auto-generated method stub
		return false;
	}

}

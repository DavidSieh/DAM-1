package fraydiegotadeo.Examen_practica;

import java.time.LocalDate;

public class Tortuga extends Tarjeta_identificacion{

	private double peso;
	private boolean adoptado;
	
	public Tortuga(String nombre, String raza, String sexo, int edad, char[][] QR,LocalDate Fecha,double Gasto, double peso, boolean adoptado) {
		super(nombre, raza, sexo, edad, QR, Fecha,Gasto );
		
		this.peso=peso;
		this.adoptado=adoptado;
	}
	
	private double calculoGastoT() {
		double consumo = ((peso/edad) * 0.35)*30;
		
		if(Fecha.equals(LocalDate.now())){
			return 0;
		}else if(Fecha.equals(LocalDate.now().plusMonths(1))) {
			return consumo;
		}
		return 0;
		
	}
	
	public boolean getAdoptados() {
		return adoptado;
		
	}
	
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}


	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Identificación de adopción:" + 
				"\nNombre: " + nombre + 
				"\nRaza: " + raza + 
				"\nSexo del animal: " + sexo +
				"\nFecha de adopción: " + Fecha +
				"\nFecha de adopción: " + calculoGastoT() +
				"\nPeso del animal: " + peso +
				"\nQR del animal:\n " + imprimirQR();

}

	public boolean isAdoptado() {
		// TODO Auto-generated method stub
		return false;
	}
}

package fraydiegotadeo.Examen_practica;

import java.time.LocalDate;

public class Gatos extends Tarjeta_identificacion  {

	private int camadas;
	private boolean adoptado;
	
	public Gatos(String nombre, String raza, String sexo, int edad, char[][] QR,LocalDate Fecha,double Gasto, int camadas,boolean adoptado) {
		super(nombre, raza, sexo, edad, QR, Fecha, Gasto);
		
		this.camadas=(int)(Math.random() * 4);
		this.adoptado=adoptado;
		
	}
	
	public boolean getAdoptados() {
		
		return adoptado;
	}
	
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}


	public int getCamadas() {
		
		return camadas;
	}

	public void setCamadas(int camadas) {
		
		this.camadas = camadas;
	}
	
	private double calculoGastoG() {
		if (Fecha.equals(LocalDate.now())) {
			return 0;
		}else if(Fecha.equals(LocalDate.now().plusMonths(1))){
			return 19.99;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Identificación de adopción:" + 
				"\nNombre: " + nombre + 
				"\nRaza: " + raza + 
				"\nEdad del animal: " + edad +
				"\nSexo del animal: " + sexo +
				"\nFecha de adopción: " + Fecha +
				"\nMantenimiento del Animal: $" + calculoGastoG() +
				"\nNúmero de camadas: " + camadas +
				"\nQR del animal:\n " + imprimirQR();

}

	public boolean isAdoptado() {
		if (adoptado == true)
			System.out.print("Lucía ha adoptado un gatito llamado: "); 
			
			if (adoptado == false) {
				System.out.print("no se ha adoptado animales");
			}
			return adoptado;
	}

}

package Herencia_Ejercicio2;

public class Patinete extends vehiculoSinMotor {

	protected int ruedas;
	
	public Patinete(String color, String modelo, double precio, String marca, String material,int ruedas) {
		super(color, modelo, precio, marca, material);
		
		this.ruedas = ruedas;
		
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	@Override
	public String toString() {
		return "\n-------Patinete---------"
				+ "\nColor de Patinete: " + color +
				"\nModelo de Patinete: " + modelo + 
				"\nPrecio de Patinete: " + precio + 
				"\nMarca de Patinete: " + marca + 
				"\nMaterial de Patinete: " + material +
				"\nRuedas del Patinete: " + ruedas;
	}

}

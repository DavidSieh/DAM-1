package Herencia_Ejercicio2;

public class Coche extends vehiculoConMotor{
	
	public int puertas;
	
	public Coche(String color, String modelo, double precio, String marca, int cilindrada, String combustible,int puertas) {
		super(color, modelo, precio, marca, cilindrada, combustible);
		
		this.puertas = puertas;
		
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "\n-------Coche---------"
				+ "\nColor del coche: " + color +
				"\nModelo del coche: " + modelo + 
				"\nPrecio el coche: " + precio + 
				"\nMarca del coche: " + marca + 
				"\nCilindrada del coche: " + cilindrada +
				"\nTipo de combustible: " + combustible;
	}
	
	

	
	
	

}

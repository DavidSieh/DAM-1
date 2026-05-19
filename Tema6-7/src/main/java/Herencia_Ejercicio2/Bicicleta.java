package Herencia_Ejercicio2;

public class Bicicleta extends vehiculoSinMotor {

	
	protected int marchas;
	
	public Bicicleta(String color, String modelo, double precio, String marca, String material,int marchas) {
		super(color, modelo, precio, marca, material);
		
		this.marchas = marchas;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	@Override
	public String toString() {
		return "-------Bicileta---------"
				+ "\nColor de la bici: " + color +
				"\nModelo de la bici: " + modelo + 
				"\nPrecio de la bici: " + precio + 
				"\nMarca de la bici: " + marca + 
				"\nMaterial de la bici: " + material +
				"\nMarchas: " + marchas;
	}
	
	
	

}

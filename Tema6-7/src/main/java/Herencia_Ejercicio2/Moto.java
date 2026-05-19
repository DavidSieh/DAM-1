package Herencia_Ejercicio2;

public class Moto extends vehiculoConMotor{

	
	protected String tipos;
	
	public Moto(String color, String modelo, double precio, String marca, int cilindrada, String combustible,String tipos) {
		super(color, modelo, precio, marca, cilindrada, combustible);
		
		this.tipos = tipos;
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
	
	@Override
	public String toString() {
		return "\n-------Moto---------"
				+ "\nColor de la Moto: " + color +
				"\nModelo de la Moto: " + modelo + 
				"\nPrecio de la Moto: " + precio + 
				"\nMarca de la Moto: " + marca + 
				"\nCilindrada de la Moto: " + cilindrada +
				"\nTipo de combustible: " + combustible + 
				"\nTipo de la Moto; "+ tipos;
	}

	
}

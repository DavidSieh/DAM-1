package Herencia_Ejercicio2;

public class vehiculoConMotor extends Vehiculo {
	
	protected int cilindrada;
	protected String combustible;
	
	
	public vehiculoConMotor(String color, String modelo, double precio, String marca,int cilindrada,String combustible) {
		super(color, modelo, precio, marca);
		
		this.combustible = combustible;
		this.cilindrada = cilindrada;
	}


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	

}

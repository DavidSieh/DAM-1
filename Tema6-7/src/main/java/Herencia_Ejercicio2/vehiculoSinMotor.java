package Herencia_Ejercicio2;

public class vehiculoSinMotor extends Vehiculo {

	
	protected String material;
	
	public vehiculoSinMotor(String color, String modelo, double precio, String marca,String material) {
		super(color, modelo, precio, marca);
		
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

}

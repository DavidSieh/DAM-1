package Herencia4;

public class Platos {

	protected String nombre;
	protected double precio;
	/**
	 * @param nombre
	 * @param precio
	 */
	public Platos(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}

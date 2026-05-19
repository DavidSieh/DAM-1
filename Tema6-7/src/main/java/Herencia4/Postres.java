package Herencia4;

public class Postres extends Platos {

	private boolean diabeticos;
	
	public Postres(String nombre, double precio,boolean diabeticos) {
		super(nombre, precio);
		this.diabeticos=diabeticos;
	}

	public boolean isDiabeticos() {
		return diabeticos;
	}

	public void setDiabeticos(boolean diabeticos) {
		this.diabeticos = diabeticos;
	}
	
	@Override
	public String toString() {
		return "Postres" +
				"Nombre del plato: " + nombre +
				"Precio del plato: " + precio + 
				"¿Es para diabeticos? : " + diabeticos;
	}

	
}

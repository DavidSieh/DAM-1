package Herencia4;

public class Pescados extends Platos {

	//No tiene más info
	public Pescados(String nombre, double precio) {
		super(nombre, precio);
		
	}
	
	@Override
	public String toString() {
		return "Pescados" +
				"Nombre del plato: " + nombre +
				"Precio del plato: " + precio;
	}

}

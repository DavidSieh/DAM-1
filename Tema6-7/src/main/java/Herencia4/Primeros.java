package Herencia4;

public class Primeros extends Platos {

	private boolean compartir;
	
	public Primeros(String nombre, double precio,boolean compartir) {
		super(nombre, precio);
		this.compartir=compartir;
		
	}

	public boolean isCompartir() {
		return compartir;
	}

	public void setCompartir(boolean compartir) {
		this.compartir = compartir;
	}

	@Override
	public String toString() {
		return "Primeros" +
				"Nombre del plato: " + nombre +
				"Precio del plato: " + precio + 
				"Es para compartir: " + compartir;
	}
}

package repaso;

public class Terrestre extends Animal {

	
	
	private boolean mamifero;
	
	public Terrestre(String nombre, String fechaNacimiento, boolean mamifero) {
		super(nombre, fechaNacimiento);
		this.mamifero=mamifero;
	}
	
	public boolean setMamifero() {
		return mamifero;
	}

	public void getMamifero(boolean mamifero) {
		this.mamifero=mamifero;
	}
}

package repaso;

public class reptil extends Animal {

	private double km;
	
	public reptil(String nombre, String fechaNacimiento, double km) {
		super(nombre, fechaNacimiento);
		this.km=km;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	

}

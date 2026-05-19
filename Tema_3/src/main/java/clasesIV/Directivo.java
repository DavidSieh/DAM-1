package clasesIV;

public class Directivo extends Empleado {
	
	private double bonus;

	public Directivo(String nombre, String dNI, int edad, int sueldo, double bonus) {
		super(nombre, dNI, edad, sueldo);
		
		this.bonus= bonus*sueldo;
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Creando Directivo....: " + "\n" +
	               "Nombre:" + getNombre() + "\n" +
	               "DNI:" + getDNI() + "\n" +
	               "Edad:" + getEdad() + "\n" +
	               "Sueldo:" + getSueldo() + "\n" +
	               "Bonus:" + bonus + "\n" +
	               "---------------------------------";
	}
	
}

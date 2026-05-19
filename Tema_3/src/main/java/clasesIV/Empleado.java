package clasesIV;

public class Empleado {
	
	protected String nombre;
	protected String DNI;
	protected int Edad;
	protected int Sueldo;
	
	
	public Empleado(String nombre, String dNI, int edad, int sueldo) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		Edad = edad;
		Sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}


	public int getSueldo() {
		return Sueldo;
	}


	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}
	
	

}

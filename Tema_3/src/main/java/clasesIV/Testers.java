package clasesIV;

public class Testers extends Empleado {

	private int proyectos;
	
	public Testers(String nombre, String dNI, int edad, int sueldo, int proyectos) {
		super(nombre, dNI, edad, sueldo);
		this.proyectos=proyectos;
	}

	public int getProyectos() {
		return proyectos;
	}

	public void setProyectos(int proyectos) {
		this.proyectos = proyectos;
	}
	
	@Override
	public String toString() {
		return "Creando Tester....: " + "\n" +
	               "Nombre:" + getNombre() + "\n" +
	               "DNI:" + getDNI() + "\n" +
	               "Edad:" + getEdad() + "\n" +
	               "Sueldo:" + getSueldo() + "\n" +
	               "Proyectos por testear:" + getProyectos() + "\n" +
	               "----------------------------------------------";
	}
	

}

package clasesIV;

public class Desarrollador extends Empleado {
	
	private boolean Java;
	private boolean JS;
	private boolean NET;

	
	public Desarrollador(String nombre, String dNI, int edad, int sueldo, boolean Java,boolean JS, boolean NET) {
		super(nombre, dNI, edad, sueldo);
		
		this.Java=Java;
		this.JS=JS;
		this.NET=NET;
		
	}


	public boolean isJava() {
			
		return Java;
	}


	public void setJava(boolean java) {
		Java = java;
	}


	public boolean isJS() {
		
		
		return JS;
	}


	public void setJS(boolean jS) {
		JS = jS;
	}


	public boolean isNET() {
		
		
		return NET;
	}


	public void setNET(boolean NET) {
		this.NET = NET;
	}
	
	@Override
	public String toString() {
		String lenguajes = "";

	    if (isJava()) {
	        lenguajes += "Java ";
	    }
	    if (isNET()) {
	        lenguajes += ".NET ";
	    }
	    if (isJS()) {
	        lenguajes += "JavaScript ";
	    }

	    if (lenguajes.isEmpty()) {
	        lenguajes = "Ningún lenguaje";
	    }
		
		
		return "Creando Desarrollador....: " + "\n" +
	               "Nombre:" + getNombre() + "\n" +
	               "DNI:" + getDNI() + "\n" +
	               "Edad:" + getEdad() + "\n" +
	               "Sueldo:" + getSueldo() + "\n" +
	               "Controla:" + lenguajes + "\n" +
	                "---------------------------------";
		
	}
	
	
}

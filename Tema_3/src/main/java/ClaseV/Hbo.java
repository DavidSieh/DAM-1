package ClaseV;



public class Hbo extends Servicios{

	//Atributos especificos solicitados por HBO
	
	protected boolean Migrado;
	
	//Constructor de HBO con el extender.
	
	public Hbo(double Coste, String Nombre, String Apodo, boolean Titularidad, String IBAN, boolean Migrado, String Cuenta) {
		super(Coste, Nombre, Apodo, Titularidad, IBAN, Cuenta);
		
		this.Migrado=Migrado;
		
	}
	
	//Setter y getters.

	public boolean isMigrado() {
		return Migrado;
	}

	public void setMigrado(boolean migrado) {
		Migrado = migrado;
	}
	
	public String mostrarMigrado() {
       
		if (Migrado) {
            return "Sí.";
        } else {
            return "No.";
        }
	}
	
	@Override
	public String toString() {
		return "Servicio de HBO" + 
				"\nCoste del servicio " + Coste + 
				"\nDado de Alta: " + Fecha + 
				"\nCuenta migrada de Hbo: " + mostrarMigrado() +
				"\nCon las siguientes cuentas:" + 
				"\nCuenta de " + Cuenta +
				"\nUsuario: " + Apodo + 
				"\nNúmero de Cuenta: " + IBAN +
				"\n" + mostrarTitularidad();
	}

	

}

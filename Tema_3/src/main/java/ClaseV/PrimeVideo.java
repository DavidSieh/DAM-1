package ClaseV;



public class PrimeVideo extends Servicios {

	//Atributos especificos de Prime.
	
	protected String Mail;
	
	//Constructor con el extender
	
	public PrimeVideo(double Coste, String Nombre, String Apodo, boolean Titularidad, String IBAN,String Mail,String Cuenta) {
		super(Coste, Nombre, Apodo, Titularidad, IBAN, Cuenta);
		
		this.Mail=Mail;
	}
	
	//Setter y getters.

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}
	
	@Override
	public String toString() {
		return "Servicio de Prime" + 
				"\nCoste del servicio " + Coste + 
				"\nDado de Alta: " + Fecha + 
				"\nCuenta asociada a Amazon: " + Mail +
				"\nCon las siguientes cuentas:" + 
				"\nCuenta de " + Cuenta +
				"\nUsuario: " + Apodo + 
				"\nNúmero de Cuenta: " + IBAN +
				"\n" + mostrarTitularidad();
	}

}

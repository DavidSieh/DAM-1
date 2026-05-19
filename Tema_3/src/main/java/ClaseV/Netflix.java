package ClaseV;

public class Netflix extends Servicios{
	
	//atributo especifico de las cuentas de netflix.
	protected String País;

	//Constructor de netflix con el extender y super.
	
	public Netflix(double Coste, String Nombre, String Apodo, boolean Titularidad, String IBAN,String Cuenta, String País) {
		super(Coste, Nombre, Apodo, Titularidad, IBAN,Cuenta);
		
		this.País=País;
	}

	//setter y getters.
	
	public String getPaís() {
		return País;
	}

	public void setPaís(String país) {
		País = país;
	}

	@Override
	public String toString() {
		return "Servicio de Netflix" + 
				"\nCoste del servicio " + Coste + 
				"\nDado de Alta: " + Fecha + 
				"\nConteidos Validos para " + País +
				"\nCon las siguientes cuentas:" + 
				"\nCuenta de " + Cuenta +
				"\nUsuario: " + Apodo + 
				"\nNúmero de Cuenta: " + IBAN +
				"\n" + mostrarTitularidad();
	}

}

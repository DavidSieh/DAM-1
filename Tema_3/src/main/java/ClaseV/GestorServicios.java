package ClaseV;

public class GestorServicios extends Servicios {

	protected String Información;
	
	public GestorServicios(double Coste, String Nombre, String Apodo, boolean Titularidad, String IBAN, String Cuenta,String Información) {
		super(Coste, Nombre, Apodo, Titularidad, IBAN, Cuenta);
		
		this.Información=Información;
	}
	
	
	public String getInformación() {
		return Información;
	}


	public void setInformación(String información) {
		Información = información;
	}

	@Override
	public String toString() {
		
		return "SERVICIOS DISPONIBLES EN SU SMART TV"
				+ "\nNetflix"
				+ "\nHbo"
				+ "\nPrime\n"
				+ "\nCOSTES DE LOS SERVICIOS POR PERSONA:"
				+ "\nNetflix: 7.995$/ mes por cuenta"
				+ "\nHbo Max: 8.995$/ mes por cuenta"
				+ "\nPrime Video: 3.0$/ mes por cuenta";
	}
	

}

package Examen_Tren;

public class Abonado extends Pasajero{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipo;
	
	
	public Abonado(String nombre, int edad, String correo, double billete,String tipo) {
		super(nombre, edad, correo, billete);
		
		this.tipo=tipo;
	}

	
	
	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	


	@Override
	void calcularPrecioBillete() {

	    if (edad >= 65) {
	        billete = billete * 0.5;     
	    } else if (edad >= 30) {
	        billete = billete * 0.75;    
	    } else if (edad >= 11) {
	        billete = billete * 0.60;    
	    } else {
	        billete = 0;                
	    }
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Abonado [tipo=");
		builder.append(tipo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", correo=");
		builder.append(correo);
		builder.append(", billete=");
		builder.append(billete);
		builder.append("]");
		return builder.toString();
	}

}

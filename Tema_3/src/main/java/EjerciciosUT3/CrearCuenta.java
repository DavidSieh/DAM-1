package EjerciciosUT3;

public class CrearCuenta {
	
	//atributos
	private String titular;
	private Float cantidad;
	
	public CrearCuenta (String titular, Float cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
		
		
	}public String gettitular() {
		return titular;
	}public void settitular(String titular) {
		this.titular=titular;
	}public Float getcantidad() {
		return cantidad;
	}public void setcantidad(Float cantidad) {
		this.cantidad=cantidad;
	}
	

}

package Cuenta;

public class Cuenta {

	//atributos
	private String titular;
	private Long cantidad;
	
	//métodos
	public Cuenta (String titular,Long cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
		
		//setters y getters
	}public String getTitular() {
		return titular;
		
	}public void setTitular(String titular) {
		this.titular=titular;
	}public Long getCantidad() {
		return cantidad;
	}public void setCantidad(long cantidad) {
		this.cantidad=cantidad;
	}
	
}

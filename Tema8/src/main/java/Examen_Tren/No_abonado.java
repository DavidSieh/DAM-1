package Examen_Tren;

import java.io.Serializable;

public class No_abonado extends Pasajero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean codigo;
	
	public No_abonado(String nombre, int edad, String correo, double billete,boolean codigo) {
		super(nombre, edad, correo, billete);
		
		this.codigo = codigo;
	}

	
	
	
	public boolean isCodigo() {
		return codigo;
	}




	public void setCodigo(boolean codigo) {
		this.codigo = codigo;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("No_abonado [codigo=").append(codigo).append(", getNombre()=").append(getNombre())
				.append(", getEdad()=").append(getEdad()).append(", getCorreo()=").append(getCorreo())
				.append(", getBillete()=").append(getBillete()).append(", hashCode()=").append(hashCode())
				.append(", getClass()=").append(getClass()).append(", toString()=").append(super.toString())
				.append("]");
		return builder.toString();
	}




	@Override
	void calcularPrecioBillete() {
		
		if (codigo == true) {
			billete = billete * 0.9;
		
		
	}

	}
}

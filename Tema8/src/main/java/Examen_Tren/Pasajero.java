package Examen_Tren;

import java.io.Serializable;
import java.util.Objects;

public abstract class Pasajero implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String nombre;
	protected int edad;
	protected String correo;
	protected double billete;
	/**
	 * @param nombre
	 * @param edad
	 * @param correo
	 * @param billete
	 */
	public Pasajero(String nombre, int edad, String correo, double billete) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.billete = billete;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public double getBillete() {
		return billete;
	}
	
	public void setBillete(double billete) {
		this.billete = billete;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(billete, correo, edad, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		return Double.doubleToLongBits(billete) == Double.doubleToLongBits(other.billete)
				&& Objects.equals(correo, other.correo) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pasajero [nombre=").append(nombre).append(", edad=").append(edad).append(", correo=")
				.append(correo).append(", billete=").append(billete).append(", getNombre()=").append(getNombre())
				.append(", getEdad()=").append(getEdad()).append(", getCorreo()=").append(getCorreo())
				.append(", getBillete()=").append(getBillete()).append(", hashCode()=").append(hashCode()).append("]");
		return builder.toString();
	}

	//clase abstracta para que hereden los abonados y no abonados.
	abstract void calcularPrecioBillete();
	

}

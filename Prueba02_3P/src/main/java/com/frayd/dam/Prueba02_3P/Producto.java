package com.frayd.dam.Prueba02_3P;

import java.io.Serializable;
import java.util.Objects;

public abstract class Producto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String nombre;
	protected int codigo;
	protected double precio;
	protected String seccion;
	/**
	 * @param nombre
	 * @param codigo
	 * @param precio
	 * @param seccion
	 */
	public Producto(String nombre, int codigo, double precio, String seccion) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.seccion = seccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	protected abstract void calcularPrecioFinal();
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", seccion=");
		builder.append(seccion);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre, precio, seccion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(seccion, other.seccion);
	}
	
	

}

package Herencia_Ejercicio2;

import java.util.Objects;

public class Vehiculo {
	
	protected String color;
	protected String modelo;
	protected double precio;
	protected String marca;
	
	
	public Vehiculo(String color, String modelo, double precio, String marca) {
		
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
		
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, marca, modelo, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(color, other.color) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}


	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", modelo=" + modelo + ", precio=" + precio + ", marca=" + marca + "]";
	}



	

}

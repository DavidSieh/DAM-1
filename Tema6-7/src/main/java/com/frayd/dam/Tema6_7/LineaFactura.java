package com.frayd.dam.Tema6_7;

public class LineaFactura {
	
	// atributos
	private int codigo;
	private int cantidad;
	private float precio;

	// contructor 
	public LineaFactura(int codigo, int cantidad, float precio) {
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	// setters y getters
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

//	// no se pide
//	@Override
//	public String toString() {
//		return "[Cod. " + codigo + " -> cantidad: " + cantidad + ", precio: " + precio + " Euros]";
//	}

}
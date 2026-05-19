package com.frayd.dam.Prueba02_3P;

import java.time.LocalDate;

public class Perecedero extends Producto {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate caducidad;
	private static final LocalDate FECHACADUCIDAD1 = LocalDate.of(2026, 5, 16);
	private static final LocalDate FECHACADUCIDAD2 = LocalDate.of(2026, 5, 20);
	
	
	public Perecedero(String nombre, int codigo, double precio, String seccion,LocalDate caducidad) {
		super(nombre, codigo, precio, seccion);
		
		this.caducidad = LocalDate.now();
	}

	
	
	
	
	public LocalDate getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}


	@Override
	protected void calcularPrecioFinal() {
		
		  if (caducidad == FECHACADUCIDAD1) {
			  precio = precio * 0.5;     
		    } else if (caducidad == FECHACADUCIDAD2) {
		        precio = precio * 0.85;    
		    }
		  
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Perecedero [caducidad=");
		builder.append(caducidad);
		builder.append(", nombre=");
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
	
	
	
}

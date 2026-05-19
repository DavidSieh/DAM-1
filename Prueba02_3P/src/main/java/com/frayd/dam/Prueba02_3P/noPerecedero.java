package com.frayd.dam.Prueba02_3P;

public class noPerecedero extends Producto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean descuento;
	
	
	public noPerecedero(String nombre, int codigo, double precio, String seccion,boolean descuento) {
		super(nombre, codigo, precio, seccion);
		
		this.descuento = descuento;
	}
	
	
	
	

	public boolean getDescuento() {
		return descuento;
	}


	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}



	@Override
	protected void calcularPrecioFinal() {
		
		if (descuento == true) {
			  precio = precio * 0.85;     
		    }
	}





	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("noPerecedero [descuento=");
		builder.append(descuento);
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

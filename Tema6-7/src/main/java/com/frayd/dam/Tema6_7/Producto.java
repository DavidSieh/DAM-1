package com.frayd.dam.Tema6_7;

public class Producto {
	
	  private int codigo;
	  private String descripcion;
	  private float precio;
	  private int cantidad;
	  private int minimo; //minima cantidad de producto que debemos tener en stock
	
	  //constructores
	  public Producto(int codigo,String descripcion){
		  this.codigo=codigo;
		  this.descripcion=descripcion;
		  this.precio=0.0F;
		  this.cantidad=0;
		  this.minimo=0;
	  }
	
	  public Producto(int codigo, String descripcion, float precio, int cantidad, int minimo) {
		  this.codigo = codigo;
		  this.descripcion = descripcion;
		  this.precio = precio;
		  this.cantidad = cantidad;
		  this.minimo = minimo;
	  }
	
	  //getters y setters
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
	
	  public String getDescripcion() {
		  return descripcion;
	  }
	
	  public void setDescripcion(String descripcion) {
		  this.descripcion = descripcion;
	  }
	
	  public int getMinimo() {
		  return minimo;
	  }
	
	  public void setMinimo(int minimo) {
		  this.minimo = minimo;
	  }
	
	  public float getPrecio() {
		  return precio;
	  }
	
	  public void setPrecio(float precio) {
	        this.precio = precio;
	    }
	
	  //otros métodos
	  @Override
	  public String toString() {
		  return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
				  + cantidad + ", minimo=" + minimo + "]";
	  }

}

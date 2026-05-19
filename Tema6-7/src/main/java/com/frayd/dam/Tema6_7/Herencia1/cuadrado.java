package com.frayd.dam.Tema6_7.Herencia1;

public class cuadrado extends Figura {

	protected double lado;
	
	public cuadrado(String color,double lado) {
		super(color);
		
		this.lado = lado;
		
	}
	
	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double calculoArea() {
		
		double area = this.lado * this.lado;
		return area;
		
	}

	@Override
	public double calculoPerimetro() {
		
		double perimetro = this.lado * 4;
		return perimetro;
		
	}
	
	@Override
	public String toString() {
		return "-----Cuadrado-----" +
	            "\nColor: " + color + 
	            "\nCalculo de su area: " + calculoArea()  +
	            "\nCalculo del perimetro: " + calculoPerimetro();
	}

}

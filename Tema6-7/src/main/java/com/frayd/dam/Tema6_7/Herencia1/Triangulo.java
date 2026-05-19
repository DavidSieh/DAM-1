package com.frayd.dam.Tema6_7.Herencia1;

public class Triangulo extends Figura {

	private double altura;
	private double base;
	private double lado;
	
	public Triangulo(String color,double altura,double base,double lado) {
		super(color);
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	
	
	
	public double getAltura() {
		return altura;
	}




	public void setAltura(double altura) {
		this.altura = altura;
	}




	public double getBase() {
		return base;
	}




	public void setBase(double base) {
		this.base = base;
	}




	public double getLado() {
		return lado;
	}




	public void setLado(double lado) {
		this.lado = lado;
	}




	@Override
	public double calculoArea() {
		
		double area = (this.base * this.altura)/2;
		return area;
		
	}
	@Override
	public double calculoPerimetro() {
		
		double perimetro = this.lado +this.lado + this.lado;
		return perimetro;
		
	}


	@Override
	public String toString() {
		return "-----Triangulo-----" +
	            "\nColor: " + color + 
	            "\nCalculo de su area: " + calculoArea()  +
	            "\nCalculo del perimetro: " + calculoPerimetro();
	}
	
}

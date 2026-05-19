package com.frayd.dam.Tema6_7.Herencia1;

public class Rectangulo extends Figura{
	
	private double base;
	private double altura;

	public Rectangulo(String color,double base,double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	

	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public double calculoArea() {
	
		double area;
		
		area = this.base * this.altura;
		return area;
		
	}


	@Override
	public double calculoPerimetro() {
		
		double perimetro = 2* this.base + 2 * this.altura;
		return perimetro;
		
	}
	
	@Override
	public String toString() {
		return "-----Rectangulo-----" +
	            "\nColor: " + color + 
	            "\nCalculo de su area: " + calculoArea()  +
	            "\nCalculo del perimetro: " + calculoPerimetro();
	}

}

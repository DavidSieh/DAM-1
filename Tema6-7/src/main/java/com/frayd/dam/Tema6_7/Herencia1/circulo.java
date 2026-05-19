package com.frayd.dam.Tema6_7.Herencia1;

public class circulo extends Figura{
	
	private double diametro;
	private final static double Pi = 3.1416;

	public circulo(String color,double diametro) {
		super(color);
		this.diametro = diametro;
	}
	
	

	public double getDiametro() {
		return diametro;
	}



	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}



	public static double getPi() {
		return Pi;
	}



	@Override
	public double calculoArea() {
		
		double radio = this.diametro /2;
		return radio;
	}

	@Override
	public double calculoPerimetro() {
		
		double perimetro = Pi * this.diametro;
		return perimetro;
	}
	
	@Override
	public String toString() {
		return "-----Circulo-----" +
	            "\nColor: " + color + 
	            "\nCalculo de su area: " + calculoArea()  +
	            "\nCalculo del perimetro: " + calculoPerimetro();
	}

}

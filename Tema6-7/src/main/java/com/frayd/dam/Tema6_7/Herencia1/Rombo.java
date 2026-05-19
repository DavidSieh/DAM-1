package com.frayd.dam.Tema6_7.Herencia1;

public class Rombo extends Figura {
	
	private double lados;
	private double diagonalM;
	private double diagonalm;

	public Rombo(String color,double lados,double diagonalM,double diagonalm) {
		super(color);
		
		this.lados = lados;
		this.diagonalM = diagonalM;
		this.diagonalm = diagonalm;
		
	}

	
	public double getLados() {
		return lados;
	}



	public void setLados(double lados) {
		this.lados = lados;
	}



	public double getDiagonalM() {
		return diagonalM;
	}



	public void setDiagonalM(double diagonalM) {
		this.diagonalM = diagonalM;
	}



	public double getDiagonalm() {
		return diagonalm;
	}



	public void setDiagonalm(double diagonalm) {
		this.diagonalm = diagonalm;
	}



	@Override
	public double calculoArea() {
		
		double area = (this.diagonalM * this.diagonalm)/2;
		return area;
		
	}

	@Override
	public double calculoPerimetro() {
		
		double perimetro = 4 * this.lados;
		return perimetro;
		
	}
	
	@Override
	public String toString() {
		return "-----Rombo-----" +
	            "\nColor: " + color + 
	            "\nCalculo de su area: " + calculoArea()  +
	            "\nCalculo del perimetro: " + calculoPerimetro();
	}

}

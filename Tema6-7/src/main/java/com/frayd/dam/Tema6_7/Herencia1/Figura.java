package com.frayd.dam.Tema6_7.Herencia1;

public abstract class Figura {

	protected String color;
	
	
	public Figura(String color) {
		this.color = color;
		
	}



	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public abstract double calculoArea();
	
	public abstract double calculoPerimetro();
	
}

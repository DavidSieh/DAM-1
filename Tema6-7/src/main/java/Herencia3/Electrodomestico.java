package Herencia3;

import java.util.Objects;

public class Electrodomestico {
	
	
	//Atributos base de los electrodomesticos 
	protected double precio;
	protected String color;
	protected char consumoElectrico;
	protected double peso;
	
	
	
	//Atributos estandar de los electrodomecticos
	private final double PRECIOBASE = 100 ;
	private final  String COLORBASE = "Blanco" ;
	private final  char CONSUMOBASE = 'F';
	private final  double PESOBASE = 5;
	
	
	//Todos los atributos
	public Electrodomestico(double precio, String color, char consumoElectrico, double peso) {
		
		this.precio = precio;
		this.color = comprobarColor(color);
		this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
		this.peso = peso;
	}

	

	//con color y consumo predefinido
	public Electrodomestico(double precio, double peso) {
	    this.precio = precio;
	    this.consumoElectrico = CONSUMOBASE;
	    this.color = COLORBASE;
	    this.peso = peso;
	}
	
	//Vacio
	public Electrodomestico() {
		
		this.precio = PRECIOBASE;
		this.color = COLORBASE;
		this.consumoElectrico = CONSUMOBASE;
		this.peso = PESOBASE;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public char getConsumoElectrico() {
		return consumoElectrico;
	}



	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	private char comprobarConsumoEnergetico(char letra) {
		if(letra >= 'A' && letra <='F') {
			return letra;
		}
		return CONSUMOBASE;
	}
	
	private String comprobarColor(String color){
		String[] colores = {"blanco","rojo","azul","gris"};
		for (String c : colores) {
			if(c.equalsIgnoreCase(color)) {
				return c;
			}
		}
		return COLORBASE;
	}
	
	
	public double precioFinal() {
		
		
		switch(consumoElectrico) {
		case 'A': precio += 100;break;
		case 'B': precio +=80;
		case 'C': precio +=60;
		case 'D': precio +=50;
		case 'E': precio +=30;
		case 'F': precio +=10;
		}
		if (peso < 20) precio += 10;
		else if (peso <50)precio +=50;
		else if(peso < 80)precio +=80;
		else precio +=100;
		
		return precio;
		
	}



	@Override
	public int hashCode() {
		return Objects.hash(color, consumoElectrico, peso, precio);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electrodomestico other = (Electrodomestico) obj;
		return Objects.equals(color, other.color) && Objects.equals(consumoElectrico, other.consumoElectrico)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
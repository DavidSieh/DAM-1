package Herencia4;

import java.util.Scanner;

public class Carnes extends Platos {

	private String Cocción;
	
	public Carnes(String nombre, double precio,String Cocción) {
		super(nombre, precio);
		this.setCocción(nivelCocción(Cocción));
	}

	public String nivelCocción(String Cocción) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecciona nivel de cocción");
		System.out.println("1. Poco hecho");
		System.out.println("2. Al punto");
		System.out.println("3. Muy hecho");
		System.out.println("4. Carbonizado");
		
		
		int opción =sc.nextInt();
		
		switch(opción) {
		case 1:System.out.println(Cocción="Poco hecho");break;
		case 2:System.out.println(Cocción="Al punto");break;
		case 3:System.out.println(Cocción="Muy hecho");break;
		case 4:System.out.println(Cocción="Carbonizado");break;
		case 5:System.out.println("Salir");
		default:System.out.println("ERROR...");break;
		
		}while(opción !=5) {
			sc.close();
		}
		
		return Cocción;
		
	}

	public String getCocción() {
		return Cocción;
	}

	public void setCocción(String cocción) {
		Cocción = cocción;
	}

	@Override
	public String toString() {
		return "Carnes" +
				"Nombre del plato: " + nombre +
				"Precio del plato: " + precio + 
				"Nivel de cocción: " + nivelCocción(Cocción);
	}
	

}

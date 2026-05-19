package Reto;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce un código de pedido de tiendas: ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^[0-9]{15}";
	    String regex2 = "^[WE][0-9]{8}-[0-9]$";
	
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("Codigo de leroy merlin.");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("codigo de IKEA");
	    }

	    sc.close();
	}
	}
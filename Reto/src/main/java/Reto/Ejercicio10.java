package Reto;

import java.util.Scanner;

public class Ejercicio10 {

public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduceun un código de tienda : ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "  ^MMK-[0-9]{3}-[A-Z]{3}$";
	    String regex2 = "^CRF-[0-9]{3}-[A-Z]{3}$";
	   
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println(" Dirección: Murcia, aprox. 80 tiendas en España.");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("Dirección: Parla (Madrid), aprox. 250 tiendas en España");
	    }
	    sc.close();
	}
	}
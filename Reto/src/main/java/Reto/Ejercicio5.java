package Reto;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce un combo de videojuego: ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^[D]{1}-[DF]{2}-[F]{1}-[P]{1}$";
	    String regex2 = "^[F]{1}-[F]{1}-[P]{1}-[P]{1}$";
	    String regex3 = "^[F]{1}-[K]{1}-[K]{1}-[D]{1}-[K]{1}$";
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("street fighter.");
	    }if (matricula.matches(regex2)){
	    	 System.out.println(" Mortal kombat.");
	    }if (matricula.matches(regex3)){
	   	 System.out.println(" Tekken patadas");
	   }

	    sc.close();
	}
	}
package Reto;

import java.util.Scanner;

public class Ejercicio7 {

public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce un número de serie de consola: ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^(XAW|XKW|XKJ)[0-9]{8}";
	    String regex2 = "^CUH-[0-9]{4}[A-Z]{1}";
	    String regex3 = "^CFI-[0-9]{4}[A-Z]{1}";
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("Nintendo Switch.");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("PlayStation 4");
	    }if (matricula.matches(regex3)){
	   	 System.out.println(" PlayStation 5");
	   }

	    sc.close();
	}
	}
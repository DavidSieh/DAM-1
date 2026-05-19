package Reto;

import java.util.Scanner;

public class Ejercicio15 {
public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("un programa que convierta números entre decimal y binario : ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^[0-9]+$";
	    String regex2 = "^([01]+)$";
	
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("Decimal");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("Binario");
	    }
	    
	    sc.close();
	}
	}
package Reto;

import java.util.Scanner;

public class Ejercicio3 {
	//Ejercicio cristofer 1
	   public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce una DNI o NIF valido: ");
	        String matricula = sc.nextLine();

	        // Expresión regular para validar el dni
	        String regex = "^[0-9]{8}[A-Z]$";
	        String regex2 = "^[A-Z]{1}[0-9]{7}[A-Z]$";

	        
	        //para ver si coincide con los parametros.
	        if (matricula.matches(regex)) {
	            System.out.println("DNI español.");
	        }if (matricula.matches(regex2)){
	        	 System.out.println("NIE valido.");
	        }

	        sc.close();
	    }
	}

package Reto;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce una serie de mando de consola: ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^NES-[0-4]{3}[E]{1}$";
	    String regex2 = "^HAC-[0-4]{3}";
	    String regex3 = "^CUH-ZCT[0-9]{1}";
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("Mando de Nintendo Entertainment System (NES).");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("Mando Pro de Nintendo Switch");
	    }if (matricula.matches(regex3)){
	   	 System.out.println(" Mando inalámbrico DualShock 4 (PS4).");
	   }

	    sc.close();
	}
	}
package Reto;

import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("un número de operación bancaria y muestre por pantalla  qué entidad bancaria española pertenece : ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^ES12BBVA[0-9]{10}$";
	    String regex2 = "^ES34SAN[0-9]{10}$";
	    String regex3 = "^ES56CAIX[0-9]{10}$";
	    String regex4 = "^ES78INGD[0-9]{10}$";
	    String regex5 = "^ES90SAB[0-9]{10}$";
	   
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("BBVA");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("Santander");
	    }  if (matricula.matches(regex3)){
	    	 System.out.println("CaixaBank");
	    }  if (matricula.matches(regex4)){
	    	 System.out.println("ING");
	    }  if (matricula.matches(regex5)){
	    	 System.out.println("Sabadell");
	    }
	    
	    sc.close();
	}
	}
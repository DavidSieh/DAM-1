package Reto;

import java.util.Scanner;

public class Ejercicio13 {

public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("un código ISBN (ISBN-10 o ISBN-13) y muestre por pantalla si es un libro español o internaciona : ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^978-84[- ][0-9]{6}[- ][0-9X]$";
	    String regex2 = "^84[- ][0-9]{6}[- ][0-9X]$";
	 
	   
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("Libro español");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("Libro español (antiguo)");
	    }  
	    
	    sc.close();
	}
	}
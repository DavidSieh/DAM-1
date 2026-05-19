package Reto;

import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.print("introduce un TPV (Terminal Punto de Venta) de un bar : ");
	    String matricula = sc.nextLine();

	    // Expresión regular para validar el dni
	    String regex = "^B[0-3]{3}$";
	    String regex2 = "^C[0-3{3}]$";
	    String regex3= "^TAP[0-3]{3}$";
	   
	    
	    
	    //para ver si coincide con los parametros.
	    if (matricula.matches(regex)) {
	        System.out.println("bebidas alcoholicas");
	    }if (matricula.matches(regex2)){
	    	 System.out.println("refrescos");
	    }if (matricula.matches(regex3)){
	    	 System.out.println("tapas");
	    }   
	    
	    sc.close();
	}
	}
package Reto;

import java.util.Scanner;

public class Ejercicio1 {
		
		//Ejercicio cristofer 1
		   public static void main(String[] args) {
		    	
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Introduce una matrícula: ");
		        String matricula = sc.nextLine();

		        // Expresión regular para validar el formato antiguo
		        String regex = "^[0-9]{4}[A-Z]{3}$";
		        String regex2 = "^[A-Z]{2}-[0-9]{3}-[A-Z]{2}$";
		        String regex3 = "^[A-Z]{3}-[0-9]{3}$";

		        
		        //para ver si coincide con los parametros.
		        if (matricula.matches(regex)) {
		            System.out.println("Matrícula española.");
		        }if(matricula.matches(regex2)) {
		            System.out.println("Matrícula francesa.");
		        }else if(matricula.matches(regex3)){
		        	System.out.println("Matrícula Alemana.");
		        }

		        sc.close();
		    }
		}

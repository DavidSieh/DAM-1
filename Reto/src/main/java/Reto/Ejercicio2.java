package Reto;

import java.util.Scanner;

public class Ejercicio2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un código postal: ");
	        String cp = sc.nextLine();

	        // Expresión regular para validar un código postal español (5 dígitos)
	        String regex = "^[09]{1}[0-9]{3}$";
	        String regex2 = "^[28]{1}[0-9]{3}$";
	        String regex3 = "^[41]{1}[0-9]{3}$";
	        String regex4 = "^[46]{1}[0-9]{3}$";
	        String regex5 = "^[35]{1}[0-9]{3}$";
	        String regex6 = "^[15]{1}[0-9]{3}$";
	        String regex7 = "^[36]{1}[0-9]{3}$";
	        
	       

	      //para ver si coincide con los parametros.
	        if (cp.matches(regex)) {
	            System.out.println("Código Castellano.");
	        } if(cp.matches(regex2))  {
	        	 System.out.println("Código madrileño.");
	        }if(cp.matches(regex3))  {
	        	 System.out.println("Código catalán.");
		        }if(cp.matches(regex4))  {
		        	 System.out.println("Código andaluza.");
		        }if(cp.matches(regex5))  {
		        	 System.out.println("Código valenciano.");
		        }if(cp.matches(regex6))  {
		        	 System.out.println("Código gallego.");
		        }if(cp.matches(regex7))  {
		        	 System.out.println("Código gallego.");
		        }
		        

	        sc.close();
	    }
	}

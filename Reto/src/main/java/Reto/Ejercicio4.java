package Reto;

import java.util.Scanner;

public class Ejercicio4 {

  public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce una distribución de teclado valida: ");
    String matricula = sc.nextLine();

    // Expresión regular para validar el dni
    String regex = "^[E-Y]{6}$";
    String regex2 = "^[E-Z]{6}$";
    String regex3 = "^[A-Z]{6}$";
    
    
    //para ver si coincide con los parametros.
    if (matricula.matches(regex)) {
        System.out.println("USA,UK, OTROS.");
    }if (matricula.matches(regex2)){
    	 System.out.println(" Alemania, Suiza, Europa Central.");
    }if (matricula.matches(regex3)){
   	 System.out.println(" Francia, Bélgica.");
   }

    sc.close();
}
}
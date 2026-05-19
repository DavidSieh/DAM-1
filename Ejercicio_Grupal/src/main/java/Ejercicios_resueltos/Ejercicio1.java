package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio1 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una matrícula: ");
        String matricula = sc.nextLine();

        // Expresión regular para validar el formato antiguo
        String regex = "^[0-9]{4}-[A-Z]{2}$";

        
        //para ver si coincide con los parametros.
        if (matricula.matches(regex)) {
            System.out.println("Matrícula válida.");
        } else {
            System.out.println("Matrícula NO válida.");
        }

        sc.close();
    }
}

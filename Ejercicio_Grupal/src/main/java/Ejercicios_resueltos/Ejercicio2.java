package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();

        // Expresión regular para validar el nombre propio
        String regex = "^[A-Z][a-z]+$";

        
      //para ver si coincide con los parametros.
        if (nombre.matches(regex)) {
            System.out.println("Nombre válido.");
        } else {
            System.out.println("Nombre NO válido.");
        }

        sc.close();
    }
}

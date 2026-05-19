package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        String numero = sc.nextLine();

        // Expresión regular para validar un número decimal con punto
        String regex = "^[0-9]+\\.[0-9]+$";

      //para ver si coincide con los parametros.
        if (numero.matches(regex)) {
            System.out.println("Número decimal válido.");
        } else {
            System.out.println("Número decimal NO válido.");
        }

        sc.close();
    }
}

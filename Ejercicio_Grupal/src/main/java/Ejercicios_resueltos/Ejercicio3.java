package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        String numero = sc.nextLine();

        // Expresión regular para validar un entero positivo sin signos
        String regex = "^[0-9]+$";

      //para ver si coincide con los parametros.
        if (numero.matches(regex)) {
            System.out.println("Número válido.");
        } else {
            System.out.println("Número NO válido.");
        }

        sc.close();
    }
}


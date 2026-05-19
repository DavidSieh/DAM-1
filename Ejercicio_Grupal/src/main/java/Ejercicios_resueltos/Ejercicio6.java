package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un código postal: ");
        String cp = sc.nextLine();

        // Expresión regular para validar un código postal español (5 dígitos)
        String regex = "^[0-9]{5}$";

      //para ver si coincide con los parametros.
        if (cp.matches(regex)) {
            System.out.println("Código postal válido.");
        } else {
            System.out.println("Código postal NO válido.");
        }

        sc.close();
    }
}

package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de teléfono: ");
        String telefono = sc.nextLine();

        // Expresión regular para validar un teléfono español de 9 dígitos
        String regex = "^[6789][0-9]{8}$";

      //para ver si coincide con los parametros.
        if (telefono.matches(regex)) {
            System.out.println("Teléfono válido.");
        } else {
            System.out.println("Teléfono NO válido.");
        }

        sc.close();
    }
}

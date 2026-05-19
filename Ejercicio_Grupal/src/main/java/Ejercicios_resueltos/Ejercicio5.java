package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un correo electrónico: ");
        String correo = sc.nextLine();

        // Expresión regular para validar un correo que termine en .com
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$";

      //para ver si coincide con los parametros.
        if (correo.matches(regex)) {
            System.out.println("Correo válido.");
        } else {
            System.out.println("Correo NO válido.");
        }

        sc.close();
    }
}

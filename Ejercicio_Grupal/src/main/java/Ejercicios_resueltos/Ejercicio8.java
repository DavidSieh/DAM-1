package Ejercicios_resueltos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una fecha (DD/MM/AAAA): ");
        String fecha = sc.nextLine();

        // Expresión regular para validar el formato DD/MM/AAAA
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";

      //para ver si coincide con los parametros.
        if (fecha.matches(regex)) {
            System.out.println("Fecha válida.");
        } else {
            System.out.println("Fecha NO válida.");
        }

        sc.close();
    }
}

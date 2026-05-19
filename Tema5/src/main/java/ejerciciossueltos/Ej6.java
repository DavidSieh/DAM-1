package ejerciciossueltos;

import java.util.*;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new TreeSet<>();

        String nombre;
        do {
            System.out.print("Introduce nombre (fin para terminar): ");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("fin")) {
                nombres.add(nombre);
            }
        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.println("Nombres ordenados: " + nombres);
    }
}

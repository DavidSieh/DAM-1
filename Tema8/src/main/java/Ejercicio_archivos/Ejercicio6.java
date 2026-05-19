package Ejercicio_archivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    private static final String FICHERO = "firmas.txt";

    private static List<String> cargarFirmas() {
        List<String> firmas = new ArrayList<>();
        File f = new File(FICHERO);

        if (!f.exists()) return firmas;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                firmas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo firmas: " + e.getMessage());
        }
        return firmas;
    }

    private static void guardarFirmas(List<String> firmas) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FICHERO))) {
            for (String s : firmas) {
                pw.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error guardando firmas: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> firmas = cargarFirmas();
        int op;

        do {
            System.out.println("1. Mostrar libro de firmas");
            System.out.println("2. Insertar nueva firma");
            System.out.println("3. Cerrar libro de firmas.");
            System.out.print("Opción: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    if (firmas.isEmpty()) {
                        System.out.println("No hay firmas.");
                    } else {
                        System.out.println("Firmas:");
                        for (String s : firmas) {
                            System.out.println("- " + s);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Nombre a firmar: ");
                    String nombre = sc.nextLine().trim();
                    if (firmas.contains(nombre)) {
                        System.out.println("Ese nombre ya ha firmado.");
                    } else {
                        firmas.add(nombre);
                        guardarFirmas(firmas);
                        System.out.println("Firma añadida.");
                    }
                    break;

                case 3:
                    System.out.println("Cerrando libro de firmas...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
 
            System.out.println();

        } while (op != 3);

        sc.close();
    }
}


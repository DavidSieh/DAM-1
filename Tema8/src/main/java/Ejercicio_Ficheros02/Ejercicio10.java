package Ejercicio_Ficheros02;

import java.io.*;
import java.util.Scanner;

//10.- Por motivos puramente estadísticos se desea llevar 
//constancia del número de llamadas recibidas en una oficina. 
//Para ello, al terminar cada jornada laboral se guarda dicho número 
//al final de un archivo binario. Implementar una aplicación con un menú, 
//que nos permita añadir el 
//número correspondiente cada día y ver la lista completa en cualquier momento.


public class Ejercicio10 {

    private static final String FILE = "ficheros/llamadas.bin";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Añadir llamadas del día");
            System.out.println("2. Ver historial");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> add(sc);
                case 2 -> show();
            }
        } while (opcion != 0);
    }

    static void add(Scanner sc) {
        System.out.print("Llamadas hoy: ");
        int n = sc.nextInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE, true))) {
            dos.writeInt(n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void show() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE))) {
            while (true) System.out.println(dis.readInt());
        } catch (EOFException e) {
            System.out.println("Fin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
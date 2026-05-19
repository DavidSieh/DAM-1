package Ejercicio_Ficheros02;

import java.io.*;
import java.util.Scanner;

//3.- Pedir números enteros positivos por consola, 
//y guardarlos en un fichero binario hasta que se introduzca un número negativo. 
//Leer del fichero todos los enteros guardados y mostrarlos por pantalla.

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta = "ficheros/ej3.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta))) {

            int n;
            do {
                System.out.print("Introduce entero positivo (negativo para terminar): ");
                n = sc.nextInt();
                if (n >= 0) dos.writeInt(n);
            } while (n >= 0);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nLeyendo números del fichero:");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
            while (true) {
                System.out.println(dis.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Fin del fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
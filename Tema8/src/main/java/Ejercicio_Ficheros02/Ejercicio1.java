package Ejercicio_Ficheros02;

import java.io.*;
import java.util.Scanner;


//1.- Pedir un double por consola y guardarlo en un archivo binario.

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número double: ");
        double num = sc.nextDouble();

        String ruta = "ficheros/ej1.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta))) {
            dos.writeDouble(num);
            System.out.println("Guardado en: " + new File(ruta).getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

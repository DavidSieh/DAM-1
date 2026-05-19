package Ejercicio_Ficheros02;

import java.io.*;
import java.util.Scanner;

//4.- Pedir un entero "n" por consola. A continuación, pedir n números double, 
//que iremos guardando en una tabla. Guardar la tabla en un archivo binario.

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta = "ficheros/ej4.bin";

        System.out.print("Introduce n: ");
        int n = sc.nextInt();

        double[] tabla = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Double " + (i+1) + ": ");
            tabla[i] = sc.nextDouble();
        }

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta))) {
            dos.writeInt(n);
            for (double d : tabla) dos.writeDouble(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

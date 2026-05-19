package Ejercicio_Ficheros02;

import java.io.*;

//5.- Leer de un fichero binario 
//una tabla de números double. Mostar el contenido de la tabla por consola.

public class Ejercicio5 {
    public static void main(String[] args) {

        String ruta = "ficheros/ej4.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {

            int n = dis.readInt();
            double[] tabla = new double[n];

            for (int i = 0; i < n; i++) {
                tabla[i] = dis.readDouble();
            }

            for (double d : tabla) System.out.println(d);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
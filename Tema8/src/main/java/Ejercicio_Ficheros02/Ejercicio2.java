package Ejercicio_Ficheros02;

import java.io.*;

//2.- Abrir el fichero del ejercicio anterior, leer el double y mostrarlo por pantalla.

public class Ejercicio2 {
	    public static void main(String[] args) {

	        String ruta = "ficheros/ej1.bin";

	        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
	            double num = dis.readDouble();
	            System.out.println("Número leído: " + num);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

package Ejercicio_Ficheros02;

import java.io.*;
import java.util.Scanner;

//8.- Escribir un texto, línea a línea, de forma que 
//cada vez que se pulse Intro, se guarde la línea en un archivo binario. 
//El proceso se termina cuando introduzcamos una línea vacía. 
//Leer el texto completo del archivo y mostrarlo por pantalla.

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta = "ficheros/ej8.bin";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            while (true) {
                String linea = sc.nextLine();
                if (linea.isEmpty()) break;
                oos.writeObject(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nTexto guardado:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            while (true) {
                System.out.println((String) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("Fin del texto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

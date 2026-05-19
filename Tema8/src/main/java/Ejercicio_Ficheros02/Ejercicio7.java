package Ejercicio_Ficheros02;

import java.io.*;
import java.util.Scanner;

//7.- Escribir por teclado una frase y guardarla en un archivo binario. 
//A continuación, recuperarla del archivo y mostrarla por pantalla.

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta = "ficheros/ej7.bin";

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(frase);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            String leida = (String) ois.readObject();
            System.out.println("Frase leída: " + leida);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

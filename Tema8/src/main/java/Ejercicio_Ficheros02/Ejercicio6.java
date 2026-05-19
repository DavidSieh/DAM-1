package Ejercicio_Ficheros02;

import java.io.*;

//6.- En un fichero binario, sabemos que se ha 
//guardado una serie de números double, pero no sabemos cuántos. 
//Implementar un programa que los lea todos y los muestre por pantalla.

public class Ejercicio6 {
    public static void main(String[] args) {

        String ruta = "ficheros/ej4.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
            while (true) {
                System.out.println(dis.readDouble());
            }
        } catch (EOFException e) {
            System.out.println("Fin del fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

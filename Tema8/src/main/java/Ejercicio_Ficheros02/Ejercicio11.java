package Ejercicio_Ficheros02;

import java.io.*;

//11.- Disponemos de dos ficheros binarios que guardan números enteros 
//ordenados de forma creciente (numeros1.dat y numeros2.dat). 
//Fusionar ambos ficheros en un tercero (numeros.dat), 
//de forma que todos los datos sigan ordenados. 
//Para probar el algoritmo se pueden utilizar los ficheros generados por el 
//Ejercicio resuelto 11.3, introduciendo números ordenados.


public class Ejercicio11 {
    public static void main(String[] args) {

        String f1 = "ficheros/numeros1.dat";
        String f2 = "ficheros/numeros2.dat";
        String out = "ficheros/numeros.dat";

        try (
            DataInputStream a = new DataInputStream(new FileInputStream(f1));
            DataInputStream b = new DataInputStream(new FileInputStream(f2));
            DataOutputStream o = new DataOutputStream(new FileOutputStream(out))
        ) {

            int x = a.readInt();
            int y = b.readInt();

            while (true) {
                if (x <= y) {
                    o.writeInt(x);
                    x = a.readInt();
                } else {
                    o.writeInt(y);
                    y = b.readInt();
                }
            }

        } catch (EOFException e) {
            // Cuando uno termina, volcamos el otro
            try (DataInputStream a = new DataInputStream(new FileInputStream(f1));
                 DataOutputStream o = new DataOutputStream(new FileOutputStream(out, true))) {
                while (true) o.writeInt(a.readInt());
            } catch (Exception ignored) {}

            try (DataInputStream b = new DataInputStream(new FileInputStream(f2));
                 DataOutputStream o = new DataOutputStream(new FileOutputStream(out, true))) {
                while (true) o.writeInt(b.readInt());
            } catch (Exception ignored) {}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
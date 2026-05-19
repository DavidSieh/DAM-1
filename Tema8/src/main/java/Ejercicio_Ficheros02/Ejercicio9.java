package Ejercicio_Ficheros02;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

//9.- Crear una tabla de 10 números enteros aleatorios menores que 100, 
//ordenados de menor a mayor, y guardarlos en un fichero binario.
//A continuación, recuperarlos y mostrarlos por consola.

public class Ejercicio9 {
    public static void main(String[] args) {

        String ruta = "ficheros/ej9.bin";

        int[] nums = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) nums[i] = r.nextInt(100);
        Arrays.sort(nums);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta))) {
            for (int n : nums) dos.writeInt(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
            while (true) System.out.println(dis.readInt());
        } catch (EOFException e) {
            System.out.println("Fin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

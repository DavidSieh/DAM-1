package Ejercicio_archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio2 {
    
	
	
	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
      
		System.out.print("Nombre: ");
        String nombre = sc.nextLine();
      
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        try (PrintWriter pw = new PrintWriter(new FileWriter("datos.txt", false))) {
            pw.println("Nombre: " + nombre);
            pw.println("Edad: " + edad);
            System.out.println("Datos guardados en datos.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
        sc.close();
    }
}

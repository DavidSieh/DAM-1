package Ejercicio_archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    
	public static void main(String[] args) {
       
		
		Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Nombre del fichero: ");
        String nombre = sc.nextLine().trim();
        
        
        if (nombre.isEmpty()) {
            nombre = "prueba.txt";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        sc.close();
    }
}

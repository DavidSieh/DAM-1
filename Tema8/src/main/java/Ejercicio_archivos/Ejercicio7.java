package Ejercicio_archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {
    
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		
		System.out.print("Nombre del fichero: ");
        String nombre = sc.nextLine().trim();

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;
                if (contador == 24) {
                    System.out.print("ENTER para seguir leyendo, q para salir: ");
                    String resp = sc.nextLine();
                    if (resp.equalsIgnoreCase("q")) {
                        break;
                    }
                    contador = 0;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        sc.close();
    }
}

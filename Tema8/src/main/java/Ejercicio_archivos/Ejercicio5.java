package Ejercicio_archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    
	
	public static void main(String[] args) {
        String nombre = "numeros.txt";
        Integer min = null;
        Integer max = null;

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
           
        	String linea;
             
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;
                int n = Integer.parseInt(linea);
                if (min == null || n < min) min = n;
                if (max == null || n > max) max = n;
            }
            
            if (min == null) {
                System.out.println("El fichero está vacío o no contiene números válidos.");
           
            } else {
                System.out.println("Menor: " + min);
                System.out.println("Mayor: " + max);
            }
            
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error procesando numeros.txt: " + e.getMessage());
        }
    }
}

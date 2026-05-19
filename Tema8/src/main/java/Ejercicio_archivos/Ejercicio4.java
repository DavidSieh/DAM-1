package Ejercicio_archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    
	
	
	public static void main(String[] args) {
        String nombre = "carta.txt";
        int lineas = 0;
        int palabras = 0;
        int caracteres = 0;

       
        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas++;
                caracteres += linea.length();
                if (!linea.isEmpty()) {
                    String[] partes = linea.split(" ");
                    palabras += partes.length;
                }
            }
            System.out.println("Líneas: " + lineas);
            System.out.println("Palabras: " + palabras);
            System.out.println("Caracteres: " + caracteres);
       
        } catch (IOException e) {
            System.out.println("Error al leer carta.txt: " + e.getMessage());
        }
    }
}

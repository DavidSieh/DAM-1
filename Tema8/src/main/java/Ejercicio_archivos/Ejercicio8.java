package Ejercicio_archivos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio8 {
    
	
	
	public static void main(String[] args) {
        
		List<String> nombres = new ArrayList<>();
        String[] ficheros = {"perso1.txt", "perso2.txt"};

        for (String f : ficheros) {
            
        	try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String linea;
                
                while ((linea = br.readLine()) != null) {
                    if (!linea.trim().isEmpty()) {
                        nombres.add(linea);
                    }
                }
           
        	} catch (IOException e) {
                System.out.println("Error leyendo " + f + ": " + e.getMessage());
            }
        }

        Collections.sort(nombres, String.CASE_INSENSITIVE_ORDER);

        try (PrintWriter pw = new PrintWriter(new FileWriter("todos.txt"))) {
            
        	for (String n : nombres) {
                pw.println(n);
            }
            System.out.println("Fichero todos.txt creado.");
        
        } catch (IOException e) {
            System.out.println("Error escribiendo todos.txt: " + e.getMessage());
        }
    }
}

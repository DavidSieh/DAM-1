package Ejercicio_archivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
    
	
	public static void main(String[] args) {
       
		String fichero = "Matriz.txt";
        List<int[]> filas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
          
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
               
                if (linea.isEmpty()) continue;
                String[] partes = linea.split("\\s+");
                int[] fila = new int[partes.length];
               
                for (int i = 0; i < partes.length; i++) {
                    fila[i] = Integer.parseInt(partes[i]);
                }
                filas.add(fila);
            }
        
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error leyendo matriz: " + e.getMessage());
            return;
        }

        if (filas.isEmpty()) {
            System.out.println("Matriz vacía.");
            return;
        }

        int n = filas.size();
        int m = filas.get(0).length;
        
        System.out.println("Matriz traspuesta:");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(filas.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
}

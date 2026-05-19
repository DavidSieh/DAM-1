package Ejercicio_archivos;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
   
	
	private static void copiar(String origen, String destino) throws IOException {
        
		
		try (BufferedReader br = new BufferedReader(new FileReader(origen));
            
				
				PrintWriter pw = new PrintWriter(new FileWriter(destino))) {
                String linea;
           
            
            while ((linea = br.readLine()) != null) {
                pw.println(linea);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        try {
            copiar("original.txt", "copia.txt");
            System.out.println("Copiado original.txt en copia.txt");
        } catch (IOException e) {
            System.out.println("Error en copia a): " + e.getMessage());
        }

        
        System.out.print("Nombre del fichero fuente: ");
        String fuente = sc.nextLine().trim();
        
        
        if (!fuente.isEmpty()) {
            String destino = "copia_de_" + fuente;
            try {
                copiar(fuente, destino);
                System.out.println("Copiado " + fuente + " en " + destino);
            } catch (IOException e) {
                System.out.println("Error en copia b): " + e.getMessage());
            }
            sc.close();
        }
    }
}

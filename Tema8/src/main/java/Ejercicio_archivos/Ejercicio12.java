package Ejercicio_archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio12 {
    
	
	public static void main(String[] args) {
        String f1 = "texto1.txt";
        String f2 = "texto2.txt";

        try (BufferedReader br1 = new BufferedReader(new FileReader(f1));
             BufferedReader br2 = new BufferedReader(new FileReader(f2))) {

            String l1, l2;
            int numLinea = 0;
            boolean iguales = true;

            while (true) {
                l1 = br1.readLine();
                l2 = br2.readLine();
                numLinea++;

                if (l1 == null && l2 == null) {
                    break;
                
                } else if (l1 == null || l2 == null) {
                    iguales = false;
                   
                    System.out.println("Los ficheros son distintos. Diferencia en línea " + numLinea);
                    System.out.println("texto1: " + (l1 == null ? "<EOF>" : l1));
                    System.out.println("texto2: " + (l2 == null ? "<EOF>" : l2));
                    return;

                } else if (!l1.equals(l2)) {
                    iguales = false;
                    
                    int pos = primeraDiferencia(l1, l2);
                   
                    System.out.println("Los ficheros son distintos.");
                    System.out.println("Primera diferencia en línea " + numLinea + ", carácter " + (pos + 1));
                    System.out.println("texto1: " + l1);
                    System.out.println("texto2: " + l2);
                    
                    return;
                }
            }

            if (iguales) {
                System.out.println("Los ficheros son iguales.");
            }
        
        } catch (IOException e) {
            System.out.println("Error comparando ficheros: " + e.getMessage());
        }
      
    }

    private static int primeraDiferencia(String a, String b) {
       
    	int len = Math.min(a.length(), b.length());
        
        for (int i = 0; i < len; i++) {
            
        	if (a.charAt(i) != b.charAt(i)) return i;
        }
        return len;
    }
}

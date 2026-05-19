package Ejercicio_archivos;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
    
	
	private static Map<Character, Character> cargarDecodificador(String fichero) throws IOException {
        Map<Character, Character> mapa = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
           
        	String lineaAlfabeto = br.readLine();
            String lineaCifrado = br.readLine();
            
            if (lineaAlfabeto == null || lineaCifrado == null) {
                throw new IOException("codec.txt no tiene el formato esperado.");
            }
            String[] alf = lineaAlfabeto.trim().split("\\s+");
            String[] cif = lineaCifrado.trim().split("\\s+");
            
            if (alf.length != cif.length) {
                throw new IOException("Longitudes de alfabetos distintas.");
            }
            
            for (int i = 0; i < alf.length; i++) {
                char a = alf[i].charAt(0);
                char c = cif[i].charAt(0);
                mapa.put(c, a);
                mapa.put(Character.toUpperCase(c), Character.toUpperCase(a));
            }
        }
        return mapa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Fichero cifrado de entrada: ");
        String entrada = sc.nextLine().trim();
        
        System.out.print("Fichero de salida decodificado: ");
        String salida = sc.nextLine().trim();

        try {
            Map<Character, Character> mapa = cargarDecodificador("codec.txt");
            
            try (BufferedReader br = new BufferedReader(new FileReader(entrada));
                 PrintWriter pw = new PrintWriter(new FileWriter(salida))) {
                int ch;
               
                while ((ch = br.read()) != -1) {
                    char c = (char) ch;
                    if (mapa.containsKey(c)) {
                        pw.print(mapa.get(c));
                    } else {
                        pw.print(c);
                    }
                }
            }
            System.out.println("Fichero decodificado en " + salida);
        
        } catch (IOException e) {
            System.out.println("Error en decodificación: " + e.getMessage());
        }
        sc.close();
    }
}


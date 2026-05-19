package Ejercicio_archivos;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
    
	
	private static Map<Character, Character> cargarCodigo(String fichero) throws IOException {
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
                mapa.put(a, c);
                mapa.put(Character.toUpperCase(a), Character.toUpperCase(c));
            }
        }
        return mapa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Fichero de entrada a encriptar: ");
        String entrada = sc.nextLine().trim();
        
        System.out.print("Fichero de salida cifrado: ");
        String salida = sc.nextLine().trim();

        try {
            Map<Character, Character> mapa = cargarCodigo("codec.txt");
            
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
            System.out.println("Fichero encriptado en " + salida);
       
        } catch (IOException e) {
            System.out.println("Error en encriptación: " + e.getMessage());
        }
        sc.close();
    }
}

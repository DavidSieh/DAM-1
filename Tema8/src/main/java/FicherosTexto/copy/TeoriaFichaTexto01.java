package FicherosTexto.copy;

import java.io.*;
import java.io.IOException;
//import java.util.Scanner;
//import java.io.PrintWriter;

public class TeoriaFichaTexto01 {

	public static void main(String[] args) {

		// Pruebas de entrada/salida en fichero
		// Escribir texto en un fichero de texto
//		escrituraFicheroTextoPW(); 
		// Leer texto de un fichero de texto
//		lecturaFicheroTextoSC();
		
		// Escribir texto en un fichero de texto, con uso de Buffer
		escrituraFicheroTextoBW();
		// Leer texto de un fichero de texto, con uso de Buffer
		lecturaFicheroTextoBR();
		
	}
	
//	// Escribe en un fichero de texto (empleando PrintWriter)
//	public static void escrituraFicheroTextoPW() {
//		FileWriter fw = null;  // FileWriter(String fileName) 
//		PrintWriter pw = null;  // PrintWriter(FileWriter vbleName)
//		try {
//			fw = new FileWriter("ficheros//prueba1.txt");
//			pw = new PrintWriter(fw);
//			for(int i = 1; i <= 10; i++) {
//				pw.println("C: " + i);
//			}
//		} catch (IOException e) {
//			System.err.println("Error!! (La carpeta no existe): \n" + e.getMessage());
//			//e.printStackTrace();
//		} finally {
//			try {
//				if(pw != null) pw.close(); //cierro el objeto de tipo PrintWriter
//				if(fw != null) fw.close(); //cierro el objeto de tipo FileWriter
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // porque es una exception de tipo checked
//		}		
//	}
//
//	// Lee de un fichero de texto (empleando Scanner)
//	public static void lecturaFicheroTextoSC() {
//		FileReader fr = null;  // FileReader(String fileName) 
//		Scanner sc = null;  // Scanner(FileReader vbleName)
//		String linea; // para leer toda la línea
//		try {
//			fr = new FileReader("ficheros//prueba1.txt");
//			sc = new Scanner(fr);
//			for(int i = 1; i <= 10; i++) {
//				linea = sc.nextLine();
//				System.out.println(linea);
//			}
//		} catch (IOException e) {
//			System.err.println("Error!! (La carpeta no existe): \n" + e.getMessage());
//			//e.printStackTrace();
//		} finally {
//			try {
//				if(sc != null) sc.close(); //cierro el objeto de tipo PrintWriter
//				if(fr != null) fr.close(); //cierro el objeto de tipo FileWriter
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // porque es una exception de tipo checked
//		}		
//	}
	
	// Escribe en un fichero de texto (empleando BufferedWriter)
	public static void escrituraFicheroTextoBW() {
//		FileWriter fw = null;  // FileWriter(String fileName) 
//		BufferedWriter bw = null;  // BufferedWriter(FileWriter vbleName)
		try (FileWriter fw = new FileWriter("ficheros//prueba2.txt");
			 BufferedWriter bw = new BufferedWriter(fw); ){			
			for(int i = 1; i <= 10; i++) {
				bw.write("Linea: " + i + "\n");
			}
		} catch (IOException e) {
			System.err.println("Error!! (La carpeta no existe): \n" + e.getMessage());
			//e.printStackTrace();
		}
	}

	// Lee de un fichero de texto (empleando BufferedReader)
	public static void lecturaFicheroTextoBR() {
		String linea; // para leer toda la línea
		int c; // para leer un carácter del fichero
		try ( FileReader fr = new FileReader("ficheros//prueba2.txt");
			  BufferedReader br = new BufferedReader(fr); ) {
//			for(int i = 1; i <= 10; i++) {
//				linea = br.readLine();
//				System.out.println(linea);
//			}
//			while((linea = br.readLine()) != null) { // leo línea a línea
//				System.out.println(linea);
//			}
			while((c = br.read()) != -1) {// leo carácter a carácter
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.err.println("Error!! (La carpeta no existe): \n" + e.getMessage());
			//e.printStackTrace();
		} 
	}

}

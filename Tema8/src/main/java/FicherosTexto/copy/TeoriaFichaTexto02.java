package FicherosTexto.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TeoriaFichaTexto02 {

	public static void main(String[] args) {

		// Pruebas de entrada/salida en fichero
		
		// Escribir texto en un fichero de texto, sin uso de Buffer
		escrituraFicheroTextoOSW();
		// Leer texto de un fichero de texto, sin uso de Buffer
		lecturaFicheroTextoISR();
		
	}

	// Leo de un fichero, sin buffer
	private static void lecturaFicheroTextoISR() {
		int c;
		try ( FileInputStream fis = new FileInputStream("ficheros//prueba03.txt");
			  InputStreamReader isr = new InputStreamReader(fis); ) {
			while((c = isr.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error en la creacion o apertura del fichero\n" + e.getMessage());
		} catch (IOException e) {
			System.err.println("Error en la lectura del fichero\n" + e.getMessage());
		}	
	}

	// Escribir en un fichero, sin buffer
	private static void escrituraFicheroTextoOSW() {
		String[] alumnos = {"Carlos", "Luis", "David", "Abel"};
		try (FileOutputStream fos = new FileOutputStream("ficheros//prueba03.txt");
				 OutputStreamWriter osw = new OutputStreamWriter(fos);){
				for(int i = 0; i < alumnos.length; i++)
					osw.write(alumnos[i] + "\n");
			} catch (FileNotFoundException e) {
				System.err.println("Error en la creacion o apertura del fichero\n" + e.getMessage());
			} catch (IOException e) {
				System.err.println("Error en la escritura del fichero\n" + e.getMessage());
			}		
	}
}

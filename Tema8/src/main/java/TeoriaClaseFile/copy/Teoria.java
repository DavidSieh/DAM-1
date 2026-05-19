package TeoriaClaseFile.copy;

import java.io.File;
import java.io.IOException;

public class Teoria {

	static final String RUTA = "ficheros/";
	static final String NFICHERO = "nombrefichero.tipo";
	
	public static void main(String[] args) {
		

		// Crear un fichero de tipo File
		File fichero = new File(RUTA + NFICHERO);		
		try {
			if(fichero.createNewFile())
				System.out.println("Fichero creado");
			else
				System.out.println("No es posible crear el fichero");
		} catch (IOException e) {
			System.err.println("Error!!! " + e.getMessage());
			//e.printStackTrace();
		}
		
		// Comprobar si existe un determinado fichero
		
		// Comprobar si un item es un archivo o un directorio.
		
		//    Comprobar los permisos de un fichero.
		
		//    Borrar un fichero.
		
		//    Obtener la ruta completa de un fichero.
		
		//    Obtener el nombre de un fichero.
		
		//    Obtener la ruta del directorio que contiene un fichero. Es decir, obtener su ruta padre.

		//    Obtener el tamaño de un fichero.

		//    Comprobar si un fichero o directorio está oculto.

		//    Listar todos los archivos y directorios de un determinado directorio.

		//    Crear un directorio.

		//    Cambiar los permisos de un fichero.


	}

//	File fichero = new File(RUTA + NFICHERO);
//	
//	try {
//		if(fichero.createNewFile())
//			System.out.println("Fichero creado");
//		else
//			System.out.println("No es posible crear el fichero");
//	} catch (IOException e) {
//		System.err.println("Error!!! " + e.getMessage());
//		//e.printStackTrace();
//	}

}

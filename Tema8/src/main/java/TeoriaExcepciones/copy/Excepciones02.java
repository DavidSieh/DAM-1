package TeoriaExcepciones.copy;

/**
 * Tema 8 - Programación
 * @author mlizquierdos
 */
public class Excepciones02 {

	public static void main(String[] args) {

        System.out.println( "Ejemplos y ejercicios de UT08 - 1.- Excepciones" );
        System.out.println( "===============================================\n" );

        try {
			comprobarEdad(17);
		} catch (Exception ex) {
			System.err.println("Error!!! Edad no válida");
//			ex.printStackTrace();
		} finally {
			System.out.println("Fin del programa");
		}

	}

	private static void comprobarEdad(int edad) throws Exception {		
		if (edad < 18) {
//			Exception ex = new Exception("Menor de edad");
//			throw ex; // lanzo excepción
			throw new Exception("Menor de edad"); // lanzo excepción
		}		
	}

}

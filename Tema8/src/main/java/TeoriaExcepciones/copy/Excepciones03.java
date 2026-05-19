package TeoriaExcepciones.copy;

import java.util.Scanner;

public class Excepciones03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println( "Ejemplos y ejercicios de UT08 - 1.- Excepciones" );
        System.out.println( "===============================================\n" );

        try {
        	System.out.print("Introduzca un numero entero positivo: ");
        	int numero = Integer.parseInt(sc.nextLine());
			comprobarEntero(numero);
		} catch (MiExcepcion ex) {
			System.err.println("Error!!!" + ex.getMessage());
//			ex.printStackTrace();
		} catch (NumberFormatException ex) {
			System.err.println("Error!!!" + ex.getMessage());
//			ex.printStackTrace();
		} finally {
			System.out.println("Fin del programa");
		}

	}

	private static void comprobarEntero(int numero) throws MiExcepcion {
		if(numero < 0)
//			throw new MiExcepcion();		
			throw new MiExcepcion("Numero negativo");		
//			throw new MiExcepcion("Numero negativo", );		
//			throw new MiExcepcion();		
	}

}

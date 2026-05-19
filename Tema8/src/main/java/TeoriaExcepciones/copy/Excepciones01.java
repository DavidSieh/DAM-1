package TeoriaExcepciones.copy;

/**
 * Tema 8 - Programación
 * @author mlizquierdos
 */
public class Excepciones01 {

	public static void main (String args[]) {
		
        System.out.println( "Ejemplos y ejercicios de UT08 - 1.- Excepciones" );
        System.out.println( "===============================================\n" );

        System.out.println("Ejemplo 1: Excepcion 'ArithmeticException'" );
		int a = 10, b = 2, c = 0;
		
		try {
			c = a / b;
		}catch (ArithmeticException ex) { // puedo usar Exception (clase padre)
			System.err.println("Error!!! No es posible dividir por 0");
//			System.err.println("Error!!! " + ex.getMessage());
			return;
		}
		// llega aquí si no se ha producido excepción
		System.out.println("El resultado de la division es " + c);
		
        System.out.println("\nEjemplo 2: Excepcion 'NumberFormatException'" );
//        String cadena = "1a";
        String cadena = "5";
        int numero;
        try {
        	numero = Integer.parseInt(cadena);
        }catch (NumberFormatException ex) {
			System.err.println("Error!!! No es un número");
//			System.err.println("Error!!! " + ex.getMessage());
			numero = -1;
        }
        if (numero != -1) {
        	System.out.println("Has pulsado el " + numero + "!!!");
        }
        
        System.out.println("\nEjemplo 3: Excepcion 'ArrayIndexOutOfBoundsException'" );
        int arr[] = {1, 2, 3, 4, 5};
        int otroNumero;
        try {
        	otroNumero = arr[4];
        }catch (ArrayIndexOutOfBoundsException ex) {
        	System.err.println("Error!!! Posición fuera de rango");
        	otroNumero = arr[0];
        }
    	System.out.println("El numero en posicion 5 es: " + otroNumero);
    	
        System.out.println("\nEjemplo 4: Excepcion 'IllegalArgumentException'" );
    	try {
    		new Thread().setPriority(11);
    	}catch(IllegalArgumentException ex) {
        	System.err.println("Error!!! El argumento es incorrecto");
    	}
    	
        System.out.println("\nEjemplo 5: Excepcion 'NullPointerException'" );
        String otraCadena = null;
        try {
            // Intentamos acceder a un método o propiedad de un objeto nulo
            int tamanio = otraCadena.length();
            System.out.println("Tamaño de la cadena: " + tamanio);
        } catch (NullPointerException ex) {
            // Manejamos la excepción
            System.err.println("Error \"Objeto nulo\".\nMensaje de error: " + ex.getMessage());
        }
        
	}

}
package Métodos;
import java.util.Scanner;
public class Ejercicio02 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		//pedimos las variables
		double numeroDecimales;
		int decimales;
		
		//primero los decimales 
		System.out.println("dame un numero: ");
		numeroDecimales=sc.nextDouble();
		//después enteros para ejecutar la división y quye nos de correcto el redondeo
		System.out.println("dame el numero de decimales: ");
		decimales=sc.nextInt();
		sc.close();
		
		// LLamamos al método que hemos creado.		
		System.out.print(numeroDecimales + " redondeado a " + decimales + " decimales es: " + redondearNumero(numeroDecimales,decimales));
		
		//creamos el método
	} private static double redondearNumero(double numeroDecimales, int decimales) {
		
		//función matemática
		double factor = Math.pow(10, decimales);
		//nos devuelve el resultado
		return Math.round(numeroDecimales* factor)/factor;
	}
}

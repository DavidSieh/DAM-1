package Métodos;
import java.util.Scanner;
public class Ejercicio03 {
	
//  3. Elaborar un método factorial(), que calculará el factorial del número que se 
//	le pasa como parámetro. Devolverá: el resultado del calculo del factorial, o bien 
//	un -1 en caso de que el parámetro pasado sea negativo, y un -2 en caso de que 
//	el parámetro pasado sea cero.

	public static void main(String[]args) {
		//ingresamos escaner + variable.
		Scanner sc = new Scanner(System.in);
		int Numero;
		
		System.out.println("introduce un numero entero: ");
		Numero =sc.nextInt();
		sc.close();
		// llamamos al método
		System.out.println("El factorial de " + Numero + " es " + factorial(Numero));
	}
		
	// método para calcular el factorial del numero.	
		public static int factorial(int Numero) {
			
			int factorial = 1;
			for (int i = 1; i <= Numero; i++)
				factorial *= i;
			return factorial;
		}
	
}

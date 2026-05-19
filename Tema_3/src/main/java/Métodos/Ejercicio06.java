package Métodos;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		
		System.out.println("introduce un numero A: ");
		A=sc.nextInt();
		System.out.println("introduce un numero B: ");
		B=sc.nextInt();
		
		System.out.println("el numero A es: " + A + " el número B es: " + B + " el MCD siguiendo euclides es: " + calculoEuclides(A,B));
		sc.close();
		
		
	}public static int calculoEuclides(int A, int B) {
		
		if (B == 0)
			return A;
		else
			return calculoEuclides  (B, A%B);
				
	}
}

package recursividad;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el limite de la serie de Fibonacci: ");
		int limite = sc.nextInt();
		sc.close();
		
		for (int i = 0; i<limite;i++) {
			System.out.print(funcionFibonacci(i) + ", ");
		}
		
		
	}

	private static int funcionFibonacci(int i) {
		if (i == 0 || i == 1) {
		return i;
	}else {
		return funcionFibonacci(i -1) + funcionFibonacci(i -2);
	}

}
}
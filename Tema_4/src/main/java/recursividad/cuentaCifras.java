package recursividad;

import java.util.Scanner;

public class cuentaCifras {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce una cifra entera positiva: ");
		int limite = sc.nextInt();
		sc.close();
		
		
			System.out.print("El número tiene está cantidad de numeros: "+cuentaCifras(limite));
		
		
		
	}

	private static int cuentaCifras(int limite) {
		
		if(limite < 10) {
			return 1;
		}else {
			return 1 + cuentaCifras(limite/10);
		}
	}

}

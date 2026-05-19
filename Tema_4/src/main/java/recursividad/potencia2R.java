package recursividad;
import java.util.Scanner;
public class potencia2R {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
	
		System.out.print("introduce el valor n:");
		int n = sc.nextInt();		
		sc.close();
		System.out.printf("%n2 elevado a %d es igual a %d", n, potencia2R(n));
		
	}

	private static int potencia2R(int n) {
		if(n==0) {
			return 1;
		}else {
			return 2 * potencia2R(n-1);
		}
		
	}

}

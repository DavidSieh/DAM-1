package recursividad;
import java.util.Scanner;
public class Division {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		int dividendo,divisor;
		System.out.print("Introduce el dividendo:");
		dividendo=sc.nextInt();
		System.out.print("Introduce el divisor:");
		divisor=sc.nextInt();
		System.out.printf("%n la división entre los dos numeros es: %d", divisionR(dividendo, divisor));
	}

	private static int divisionR(int dividendo, int divisor) {
		if(divisor>dividendo) {
			return 0;
		}else {
			
		}return 1 + divisionR(dividendo-divisor,divisor);
	}
	

}

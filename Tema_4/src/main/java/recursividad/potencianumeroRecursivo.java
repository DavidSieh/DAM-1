package recursividad;
import java.util.Scanner;
public class potencianumeroRecursivo {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		System.out.print("introduce la base: ");
		int base=sc.nextInt();
		System.out.print("introduce el exponente: ");
		int exponente =sc.nextInt();
		sc.close();
		System.out.printf("%n%d elevado a %d es igual a %.3f", base , exponente, potencia(base,exponente));
		
	}

	private static double potencia(int base, int exponente) {
		if(exponente == 0) {
			return 1;
		}else if (exponente<0) {
			return potencia(base,exponente+1)/base;
		}else {
			return base*potencia(base,exponente -1);
		}
	}
}

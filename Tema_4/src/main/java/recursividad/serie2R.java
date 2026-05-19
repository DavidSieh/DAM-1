package recursividad;
import java.util.Scanner;
public class serie2R {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[]args) {
		System.out.print("Introduce u número de terminos: ");
		int nTerm=sc.nextInt();
		sc.close();
		double total = serie2R(nTerm);
		
		System.out.printf("%nLa serie: 1 + 1/2! + 1/3! + 1/4! +...+ 1/%d! es %.3f," ,nTerm,total);
	}

	private static double serie2R(int nTerm) {
		if(nTerm==1) {
			return 1.0;
		}else {
			return 1.0/factorial(nTerm)  + serie2R(nTerm - 1);
		}
	}

	private static int factorial(int n) {
		if(n==0) {
			return 1;
		}else  return n * factorial(n-1);
		}
			
}


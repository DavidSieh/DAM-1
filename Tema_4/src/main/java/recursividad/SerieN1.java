package recursividad;
import java.util.Scanner;
public class SerieN1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		final int N = 5;
		System.out.print("Introduce u número de terminos: ");
		int nTerm=sc.nextInt();
		sc.close();
		int total = serie1R(nTerm,N);
		
		System.out.printf("%nLa serie: n + 2n + ... + %dn es %d," ,nTerm,total);
	}

	private static int serie1R(int nTerm, int n) {
		if(nTerm==1) {
			return n;
		}else {
			return nTerm * n + serie1R(nTerm - 1, n);
		}
	}

}

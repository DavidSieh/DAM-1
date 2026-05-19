package recursividad;
import java.util.Scanner;
public class invertirNumeroR {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		int num;
		
		System.out.print("introduce un numero para invertir");
		num=sc.nextInt();
		sc.close();
		System.out.printf("%nEl numero %d invertido es el %s" , num, invertirNumeroString(num));
		int numCifras = String.valueOf(num).length();
		System.out.printf("%nEl numero %d invertido es el %s" , num, invertirNumero(num, numCifras-1));
	}

	private static int invertirNumero(int num, int pos) {
		if(num<10) {
			return num;
		}else {
			return num%10 * (int)Math.pow(10, pos) + invertirNumero(num/10, pos-1);
		}
		
	}

	private static String invertirNumeroString(int num) {
		if (num<10) {
			return String .valueOf(num);
		}else {
			return String.valueOf(num%10) + invertirNumeroString(num/10);
		}
		
	}
}

package Métodos;
import java.util.Scanner;
public class Ejercicio01 {

	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		char caracter;
		System.out.println("Dame un caracter: ");
		caracter=sc.nextLine().toLowerCase().charAt(0);
		sc.close();
		
		boolean resultado = esVocal('a');
		System.out.print(resultado ? caracter + " es vocal" : caracter +  "NO es vocal");
	}
	
	
	private static boolean esVocal(char c) {
		boolean vocal = true;
		if (c == 'a' || c == 'e' || c == 'i' || c =='o'|| c =='u') {
		}
		else 
			vocal=false;
		
			
		return vocal;
	}
	
	}
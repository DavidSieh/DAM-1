package recursividad;
import java.util.Scanner;
public class invertirCadena {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		System.out.print("introduce una cadena de texto:");
		String cadena = sc.nextLine();
		sc.close();
		String invertida = invertirCadenaR(cadena);
		System.out.printf("Cadena introducida: %s%n", cadena);
		System.out.printf("Cadena invertida: %s", invertida);
	}

	private static String invertirCadenaR(String cadena) {
		if (cadena.length()==1) {
			return cadena;
		}else {
			return invertirCadenaR(cadena.substring(1)) +cadena.charAt(0);
		}
		
	}
}

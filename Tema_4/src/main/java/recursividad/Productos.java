package recursividad;
import java.util.Scanner;
public class Productos {

	
	
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		
		int multiplicando, multiplicador;
		System.out.print("introduce el multiplicando:");
		multiplicando = sc.nextInt();
		System.out.print("introduce el multiplicador:");
		multiplicador = sc.nextInt();
		sc.close();
		System.out.printf("El producto de los numeros es: %d" , productoR(multiplicando, multiplicador));
		
	
	}

	private static int productoR(int multiplicando, int multiplicador) {
		if (multiplicador == 0) {
			return 0;
		}else {
			return multiplicando + productoR(multiplicando, --multiplicador);
		}
			
	}
}


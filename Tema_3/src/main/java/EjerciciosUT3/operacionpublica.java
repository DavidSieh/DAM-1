package EjerciciosUT3;
import java.util.Scanner;
public class operacionpublica {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("introduce el primer número: ");
		num1=sc.nextInt();
		System.out.println("introduce el segundo número: ");
		num2=sc.nextInt();
		
		sc.close();
		
		System.out.println("la suma es " + Operación.sumar(num1, num2));
		System.out.println("la resta es " + Operación.resta(num1, num2));
	}
}

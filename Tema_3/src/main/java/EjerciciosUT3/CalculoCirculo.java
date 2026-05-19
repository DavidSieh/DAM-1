package EjerciciosUT3;
import java.util.Scanner;
public class CalculoCirculo {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		double radio;
		
		do {
			
		System.out.println("introudce el radio de la circunferencia");
		radio=sc.nextDouble();
		}while (radio<0);
		sc.close();
		
		Circulo c1 =new Circulo(radio);
		
		System.out.println(" " + c1);
		System.out.println("el  area del circulo es: " + c1.calculoArea());
		System.out.println("el  perimetro del circulo es: " + c1.calculoPerimetro());
		
		c1.setR(12.3);
		
		System.out.println("el  area del circulo ahora es: " + c1 );
		System.out.println("el  area del circulo es: " + c1.calculoArea());
		System.out.println("el  perimetro del circulo es: " + c1.calculoPerimetro());
		
		
	}
}

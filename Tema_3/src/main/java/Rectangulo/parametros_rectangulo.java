package Rectangulo;
import java.util.Scanner;
public class parametros_rectangulo {
	
	public static void main(String[]args) {
		
		//creamos un Scanner para poder introducir los valores
		Scanner sc = new Scanner(System.in);
		int valor1,valor2;
		
		//llamamos a los valores
		System.out.println("introduzca valor de la base: ");
		valor1=sc.nextInt();
		System.out.println("introduzca valor de la altura: ");
		valor2=sc.nextInt();
		sc.close();
		
		//Creamos el rectangulo para que pille los valores en enteros positivos 
		Rectangulo R = new Rectangulo(0,0);
		R.setAltura(valor2);
		R.setBase(valor1);
		
		
		//condicionamos si salen numeros negativos
		if (valor1 <0) {
			valor1=0;
		System.out.println("valor negativo se le asigna valor positivo " + valor1);
		}if (valor2 <0) {
			valor2=0;
		System.out.println("valor negativo se le asigna valor positivo " + valor2);
		}
		
		System.out.println("El resultado del area: " + calculoArea(valor1, valor2));
		System.out.println("El resultado del perimetro: " + calculoPerimetro(valor1, valor2));
		horizontalVertical(valor1, valor2);
		valoresRectangulo(valor1,valor2);
		dibujoRectangulo(valor1,valor2);
		
	}private static int calculoArea(int valor1, int valor2) {
		int calculoArea;
	
		calculoArea= valor1*valor2;
	
		return calculoArea;
	}private static int calculoPerimetro(int valor1, int valor2) {
		int calculoPerimetro;
		
		calculoPerimetro = 2*(valor1+valor2);
		
		return calculoPerimetro;
		
	}private static void horizontalVertical(int valor1, int valor2) {
		
		if (valor1>valor2) {
			System.out.println("el rectangulo es horizontal");
		}else if (valor1<valor2){
			System.out.println("el rectangulo es vertical");
		}
		
	}private static void valoresRectangulo(int valor1, int valor2) {
		System.out.println("el valor de la base " + valor1);
		System.out.println("el valor de la altura " + valor2);
		
	}private static void dibujoRectangulo(int valor1, int valor2) {
		
		 for (int i = 1; i <= valor2; i++) {
	        	for (int j = 1; j <= valor1; j++) {
	        	System.out.print("*"); 
	        }
	        	System.out.println(); 	
	}
	}
}

package Métodos;
import java.util.Scanner;
public class ejercicio08 {
	

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int A;
		
		System.out.println("introduce un número: ");
		A=sc.nextInt();
		sc.close();
		
		System.out.println("El número convertido a Binario: " + numeroBinario(A));
		System.out.println("El número convertido a Hexadecimal: " + numeroHexadecimal(A));
//		System.out.println("El número convertido a decimal: " + numeroOctal(A));
		
	} public static int numeroBinario(int A) {
		int residuo=0;
		int binario=0;
		int potencia=1;
		
		while(A >0) {
			residuo= A % 2;
			A/=2;
			binario = binario + residuo * potencia;
			potencia*=10;
		
	}
		return binario;

	} public static String numeroHexadecimal(int A) {
		
		StringBuilder resultado = new StringBuilder(A);
		
		int calculo, calculo1;
		
		calculo1= A/16;
		calculo = A %16;
		
		switch (calculo) {	
		case 10:resultado.append("A");break;
		case 11:resultado.append("B");break;
		case 12:resultado.append("C");break;
		case 13:resultado.append("D");break;
		case 14:resultado.append("E");break;
		case 15:resultado.append("F");break;
		}
		
		return calculo1 + resultado.toString();
		
		
		
	}
}
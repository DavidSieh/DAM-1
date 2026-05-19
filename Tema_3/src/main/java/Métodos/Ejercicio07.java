package Métodos;
import java.util.Scanner;
public class Ejercicio07 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int A;
		
		System.out.println("introduce un número entre 1 y 99: ");
		A=sc.nextInt();
		sc.close();
		System.out.println("el número convertido en romano es : " + romano(A));
		
		
	}public static String romano(int A) {
		
		StringBuilder resultado = new StringBuilder();
		
		int decenas,unidades;
		decenas=A/10;
		unidades=A%10;
		
		switch(decenas) {
		case 1:resultado.append("X");break;
		case 2:resultado.append("XX");break;
		case 3:resultado.append("XXX");break;
		case 4:resultado.append("XL");break;
		case 5:resultado.append("L");break;
		case 6:resultado.append("LX");break;
		case 7:resultado.append("LXX");break;
		case 8:resultado.append("LXXX");break;
		case 9:resultado.append("XC");break;
		}
		
		switch(unidades) {
		case 1:resultado.append("I");break;
		case 2:resultado.append("II");break;
		case 3:resultado.append("III");break;
		case 4:resultado.append("IV");break;
		case 5:resultado.append("V");break;
		case 6:resultado.append("VI");break;
		case 7:resultado.append("VII");break;
		case 8:resultado.append("VIII");break;
		case 9:resultado.append("IX");break;
		}
		return resultado.toString();
	}

}

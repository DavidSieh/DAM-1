package Métodos;
import java.util.Scanner;
public class Ejercicio05 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String palabra;
	        char c1, c2, c3, c4, c5;

	        System.out.println("Introduce una cadena de 5 letras: ");
	        palabra = sc.nextLine().toLowerCase();
	        sc.close();
	        // Tomamos cada letra individualmente
	        c1 = palabra.charAt(0);
	        c2 = palabra.charAt(1);
	        c3 = palabra.charAt(2);
	        c4 = palabra.charAt(3);
	        c5 = palabra.charAt(4);

	        // Ciframos cada letra
	        System.out.print("El código cifrado es: ");
	        codigoSecreto(c1);
	        codigoSecreto(c2);
	        codigoSecreto(c3);
	        codigoSecreto(c4);
	        codigoSecreto(c5);
	    }

	    public static void codigoSecreto(char caracter) {
	        if (caracter == 'a') System.out.print("c");
	        else if (caracter == 'b') System.out.print("d");
	        else if (caracter == 'c') System.out.print("e");
	        else if (caracter == 'd') System.out.print("f");
	        else if (caracter == 'e') System.out.print("g");
	        else if (caracter == 'f') System.out.print("h");
	        else if (caracter == 'g') System.out.print("i");
	        else if (caracter == 'h') System.out.print("j");
	        else if (caracter == 'i') System.out.print("k");
	        else if (caracter == 'j') System.out.print("l");
	        else if (caracter == 'k') System.out.print("m");
	        else if (caracter == 'l') System.out.print("n");
	        else if (caracter == 'm') System.out.print("ñ");
	        else if (caracter == 'n') System.out.print("o");
	        else if (caracter == 'ñ') System.out.print("p");
	        else if (caracter == 'o') System.out.print("q");
	        else if (caracter == 'p') System.out.print("r");
	        else if (caracter == 'q') System.out.print("s");
	        else if (caracter == 'r') System.out.print("t");
	        else if (caracter == 's') System.out.print("u");
	        else if (caracter == 't') System.out.print("v");
	        else if (caracter == 'u') System.out.print("w");
	        else if (caracter == 'v') System.out.print("x");
	        else if (caracter == 'w') System.out.print("y");
	        else if (caracter == 'x') System.out.print("z");
	        else if (caracter == 'y') System.out.print("a");
	        else if (caracter == 'z') System.out.print("b");
	        else System.out.print(caracter);
	    }
	}


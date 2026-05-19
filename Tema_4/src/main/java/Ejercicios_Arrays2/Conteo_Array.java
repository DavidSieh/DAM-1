package Ejercicios_Arrays2;
import java.util.Scanner;
public class Conteo_Array {
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        int A = sc.nextInt();
	        sc.close();
	        
	        int Num[] = {1,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	        
	        System.out.println("El número " + A + " aparece " + conteoNumero(Num, A) + " veces en el array.");
	    }

	    private static int conteoNumero(int[] Num, int A) {
	        int Conteo = 0;
	        for (int a : Num) {
	            if (a == A) {
	                Conteo++;
	            }
	        }
	        return Conteo;
	    }
	}


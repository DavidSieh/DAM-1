package Ejercicios_Arrayas3;
import java.util.Scanner;
public class Inicializar_bidimensional {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		//matriz 3x4
		int [][] Ar= new int [3][4];
		
		System.out.print("introduce un número para inicializar el Array:");
		int temp =sc.nextInt();
		sc.close();
		
		for(int a = 0; a<Ar.length;a++) {
			for(int b = 0; b<Ar[a].length;b++) {
				//almacenamos el array
				Ar[a][b] = temp;
				//mostramos
				System.out.print(Ar[a][b] + " ");
			}
			System.out.println();
		}
		
	}

}

package Ejercicio03;
import java.util.Scanner;
public class EscalerasPares {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		 int altura;  
	        System.out.print("Introduce la altura del triángulo: "); 
	        altura = sc.nextInt(); 
	        
	        for (int i = 0; i <= altura; i++) { 
	            for (int j = 1; j <= i; j++) {
	            	if(i % 2==0)
	                System.out.print(j+=1); 
	            }
	            System.out.println(); 
	        }

	        sc.close(); 
	    }
	}

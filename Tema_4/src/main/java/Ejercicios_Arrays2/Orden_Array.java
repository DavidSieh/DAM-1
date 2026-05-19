package Ejercicios_Arrays2;

public class Orden_Array {
	
	public static void main(String[]args) {
		
		
		// Se crea el Array
		
		  int Num[] = {1,2,3,4,5,6,7,8,9,10};
		  
		  //Hacemos un metodo para comprobar si comprobarNum es verdadero o falso 
		  //y que imprima lo que pidamos, como yo lo he hecho ascendente lo remarco
	        
		  if (comprobarNum(Num)) {
	            System.out.println("El array está ordenado en orden ascendente");
	        } else {
	            System.out.println("El array NO está ordenado en orden ascendente");
	        }
	    }

	    private static boolean comprobarNum(int[] Num) {
	        for (int i = 0; i < Num.length - 1; i++) {
	            if (Num[i] > Num[i + 1]) {
	                return false;
	            }
	        }
	        return true; 
	    }
	}
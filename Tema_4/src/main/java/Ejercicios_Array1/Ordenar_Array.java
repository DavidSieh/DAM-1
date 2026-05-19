package Ejercicios_Array1;

public class Ordenar_Array {
	
public static void main(String[]args) {
	
//	7. Ordenar el array de números generado, de menor a mayor, 
//	sin utilizar funciones de ordenación.
		
		int nArray [] = new int[10];
		
		//Función para generar un Array aleatorio de 10 numeros.
		
		for(int posicion = 0; posicion<=nArray.length-1;posicion++)	{
			nArray[posicion] = (int)(Math.random()*10)+1;
		}
		
		
		//función para ordenar todo el array, con 2 fpr y un IF.
		
			for(int posicion = 0; posicion<=nArray.length-1;posicion++)	{
			for(int posicion1 = 0; posicion1< nArray.length -1 -posicion;posicion1++) {
			
			if (nArray[posicion1]>nArray[posicion1+1]) {
				int temp = nArray[posicion1];
                nArray[posicion1] = nArray[posicion1 + 1];
                nArray[posicion1 + 1] = temp;
            }
			}
			}
			
		
		 System.out.println("Array con números aleatorios:");
	        for (int numero : nArray) {
	            System.out.println(numero + " ");
	        }
	        System.out.println();
	    }

	}
			
			
		

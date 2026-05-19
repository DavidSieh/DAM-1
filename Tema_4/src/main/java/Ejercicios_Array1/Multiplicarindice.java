package Ejercicios_Array1;

public class Multiplicarindice {
	public static void main(String[]args) {
		
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		int nArray [] = new int[10];
		
//		6. Multiplicar cada elemento del array por su índice correspondiente 
//		y almacena los resultados en un nuevo array.

		System.out.println("multiplicación del Array: ");
//			for(int posicion : num) {
			for(int posicion = 0; posicion<=num.length-1;posicion++)	{
			nArray[posicion]=num[posicion]*posicion;
		
				
			System.out.println(nArray[posicion]);
	}
	}
}

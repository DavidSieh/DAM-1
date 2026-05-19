package Ejercicios_Array1;

public class ejercicio_suma_array {
	
	public static void main(String[]args) {
		
//		1. Crear un array con "X" números enteros 
//		y calcular la suma de todos sus elementos.
		
		
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		int suma=0;
		
		// función para que recorrer todo el Array, sumarlo con una función
		
		System.out.println("Sumatorio del Array: ");
		for(int posicion = 0; posicion < num.length; posicion++) {
			
			suma = suma + num[posicion];
			
     	System.out.println("resultado de la suma " + suma);
     }
		
	}

}

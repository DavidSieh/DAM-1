package Ejercicios_Arrayas3;

public class Suma_Media_Array_aleatorio {
	
	public static void main(String[]args) {
		
		
		int nArray [] = new int[15];
		int suma = 0;
		
		
		
		//Función para generar un Array aleatorio de 15 numeros y sumar.
		
		System.out.println("Sumatorio de Aleatorios");
		for(int posicion = 0; posicion<=nArray.length-1;posicion++)	{
			nArray[posicion] = (int)(Math.random()*15)+1;
			//sumatorio del Array
			suma = suma + nArray[posicion];
			System.out.print(suma + " ");
		}
		
		System.out.println("\nmedia del Array: ");
		for(double posicion : nArray) {
			if (posicion  %5 == 0)
				suma += posicion;
			double media = suma /nArray.length;
			
	 	System.out.print(" " + media);
}
		
	}

}

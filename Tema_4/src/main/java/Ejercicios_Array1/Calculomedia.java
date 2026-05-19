package Ejercicios_Array1;

public class Calculomedia {
	
	public static void main(String[]args) {
	
			
			double [] num = {1,2,3,4,5,6,7,8,9,10};
			double suma=0;
			
			
			// función para que recorrer todo el Array, multiplicar solo los pares con una función
			
			System.out.println("media del Array 5: ");
			for(double posicion : num) {
				
			
				if (posicion  %5 == 0)
					suma += posicion;
				double media = suma /num.length;
				
		 	System.out.println("resultado " + media);
	}

}
}

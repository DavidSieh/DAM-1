package Ejercicios_Array1;

public class Intercambio {
	public static void main(String[]args) {
		
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		
		
		// función para que recorrer todo el Array
		
		System.out.println("intercambio del Array: ");
			for(int posicion : num) {
			
				if (posicion == 1) {
					posicion = num[9];
				}else if(posicion ==10) {
					posicion= num[0];
				}
				
				System.out.println(posicion);
     }
			
			
}
}
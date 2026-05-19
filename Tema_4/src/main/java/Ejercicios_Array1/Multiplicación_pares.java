package Ejercicios_Array1;

public class Multiplicación_pares {
	
	public static void main(String[]args) {
	
	int [] num = {1,2,3,4,5,6,7,8,9,10};
	int prod=1;
	
	// función para que recorrer todo el Array, multiplicar solo los pares con una función
	
	System.out.println("producto del Array: ");
	
	
	
	//forzamos que solo ejecute los pares 
	for(int posicion : num) {
		
		if (posicion  %2 == 0)
		prod *= posicion;
		
 	System.out.println("resultado " + prod);
 }
	
}


}

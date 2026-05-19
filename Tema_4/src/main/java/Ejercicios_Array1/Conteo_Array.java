package Ejercicios_Array1;

public class Conteo_Array {
	
	public static void main(String[]args) {
	
	int [] num = {1,2,3,4,5,6,7,8,9,10};
	int contador=0;
	
//	5. Con el array anterior, contar cuántas veces 
//	aparece un número específico "N".

	System.out.println("conteo del Array: ");
		for(int posicion : num) {
			
			if(posicion==5)
			contador++;

			System.out.println(posicion);
			
}
		System.out.println("numero de veces que aparece el 5: " + contador);
}
}

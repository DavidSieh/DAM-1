package Ejercicios_Arrayas3;

public class Mostrar_Array {
	
	public static void main(String[]args) {
		
		
		//Crear programa para mostrar Array de 5 elementos
		//y luego invertir el orden.
		
		int Ar [] = {1,2,3,4,5};
		
		
		//mostramos Array ordenado 
		
		System.out.println("Mostramos el Array: ");
		for (int num : Ar) {
		System.out.print(num + " ");
		}
		
		//mostramos Array inverso
		System.out.println("\nMostramos el Array inverso: ");
		
		for(int A= 0; A<Ar.length/ 2; A++) {
			int temp =Ar[A];
			Ar[A] = Ar[Ar.length -1 -A];
			Ar[Ar.length -1 -A] =temp;
		}
	
		for (int numero : Ar) {
            System.out.print(numero + " ");
        }
        System.out.println();
		
	}

}

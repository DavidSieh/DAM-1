package Ejercicios_Array1;

public class Combinar_Arrays {
	
	public static void main(String[]args) {
		
		//arrays declarados
		int ar1[] = {12,3,4,5,8,-5,-9};
		int ar2[] = {21,13,47};
		int arResultado[] = new int[ar1.length + ar2.length];
		int posicion = 0;
		int i=0;
		
		for(int i1=0; i1 <ar1.length && i1<ar2.length; i1++) {
		arResultado[posicion] =ar1[1];
		arResultado[posicion] =ar2[1];
	}
	
	for(int j=i; j <ar1.length; j++) {
	arResultado[posicion++] =ar1[1];
}

	for(int j=i; j <ar2.length; j++) {
	arResultado[posicion++] =ar2[1];
	
}

	}
}

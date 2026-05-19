package Ejercicios_Array1;

public class Array_palabras {
	
//9.	Convertir una cadena formada por varias palabras en 
//	un array de palabras e invertir el orden de los elementos.
	public static void main(String[]args) {
		
		//String de letras 
		
		String LArray[]={"esto","es","una","frase","muy","larga"};
		String aux;
		
		System.out.println("Array original " + LArray.length);
		mostrarArray(LArray);
		
		// Invertir el array
        for (int i = 0; i < LArray.length / 2; i++) {
            aux = LArray[i];
            LArray[i] = LArray[LArray.length - 1 - i];
            LArray[LArray.length - 1 - i] = aux;
        }
        System.out.println("\nArray invertido:");
        mostrarArray(LArray);
    }
	

private static void mostrarArray(String[] LArray) {
	for(int i=0; i < LArray.length;i++) {
		System.out.println(LArray[i] + "\t");
	}
	
}
}

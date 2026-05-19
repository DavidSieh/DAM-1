package Ejercicios_Array1;


public class Eliminar_duplicados {
	
//	8. Generar un array nuevo con "X" números enteros entre 1 y 20;
//	eliminar los elementos duplicados existentes en el mismo.
	
	public static void main(String[]args) {
	
	int nArray [] = new int[20];
	
	//Función para generar un Array aleatorio de 20 numeros.
	
	for(int posicion = 0; posicion<nArray.length-1;posicion++)	{
		nArray[posicion] = (int)(Math.random()*20)+1;
	}
	
	
	
	 // Llamar a eliminar repetidos
	    int[] resultado = elminarRepetidos(nArray);

	    // Imprimir array sin duplicados
	    System.out.println("Array sin duplicados:");
	    for(int i = 0; i < resultado.length; i++) {
	        System.out.print(resultado[i] + " ");
	    }
	}
	
    

private static int[] elminarRepetidos(int[] nArray) {
	
	 int arAux [] = new int[nArray.length]; //Array auxiliar
     boolean existe; //averiguar si el numero existe
     int posicion1 = 0; //contador de elementos únicos
     
     // Recorremos el array original
     for(int i = 0; i < nArray.length; i++) {
         existe = false;
         
         // Comprobamos si ya está en el auxiliar
         for(int j = 0; j < posicion1; j++) {
             if(arAux[j] == nArray[i]) {
                 existe = true;
                 break;
             }
         }
         
         // Si no existe, lo añadimos
         if(!existe) {
             arAux[posicion1] = nArray[i];
             posicion1++;
         }
     }
     
     // Devolvemos solo la parte útil del array auxiliar
     int[] resultado = new int[posicion1];
     for(int k = 0; k < posicion1; k++) {
         resultado[k] = arAux[k];
     }
     
     return resultado;
 }
}



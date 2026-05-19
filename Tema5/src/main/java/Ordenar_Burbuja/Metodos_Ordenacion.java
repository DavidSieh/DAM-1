package Ordenar_Burbuja;

public class Metodos_Ordenacion {
	
	public static void main(String[]args) {
		
		int[]burbuja = ordenarBurbuja();
		int[] resultado = ordenarSeleccion();
		
		
		for (int n : resultado) { 
			System.out.print(n + " "); 
			
		}
		

		for (int n : burbuja) { 
			System.out.println(n + " "); 
			
		}
	}
	
	public static int[] ordenarBurbuja() {
		
		int burbuja [] = {4,9,5,6,7,1,3,10,17,12,20};
		int iteracion = 0;
		int contador = 0;
		
			for(int i = 0; i<burbuja.length;i++) {
				contador = i +1;
				for(int j = 0; j<(burbuja.length - i - 1); j++) {
					
					if (burbuja[j + 1]<burbuja[j]) {
						iteracion = burbuja[j + 1];
						burbuja[j + 1] = burbuja[j];
						burbuja[j] = iteracion;
					}
				}
				}
			  System.out.println("numero de pasos hasta ordenar = " + contador);
		       return burbuja;
	}
	
	public static int[] ordenarSeleccion() { 
		int seleccion[] = {4, 9, 5, 6, 7, 1, 3, 10, 17, 12, 20}; 
		int contador = 0; 
		
		for (int i = 0; i < seleccion.length - 1; i++) 
		{ int valormin = i; // Buscar el índice del mínimo 
		
		for (int j = i + 1; j < seleccion.length; j++) { 
			
			if (seleccion[j] < seleccion[valormin]) 
			{ valormin = j; 
			} 
			} // Intercambiar solo una vez por iteración 
		if (valormin != i) { 
			int aux = seleccion[i]; 
			seleccion[i] = seleccion[valormin]; 
			seleccion[valormin] = aux; contador++; 
			} 
		} System.out.println("Número de intercambios = " + contador); 
		return seleccion; 
		}
	
		// Algoritmo de ordenación por inserción
	
	public static void ordInsercion (int[] pArray) {    	
    int i, j;
    int actual;     
    for (i = 1; i < pArray.length; i++) {
        actual = pArray[i];
        for (j = i; j > 0 && pArray[j - 1] > actual; j--) {
        	pArray[j] = pArray[j - 1];
        }
        pArray[j] = actual;
    }        
}

	// Algoritmo de ordenación Quicksort
	public static void ordRapida (int[] pArray, int indiceInf, int indiceSup) {    	
    int pared, actual, pivote, temp;
    if (indiceInf < indiceSup) {
        // el elemento de pivote es el más a la derecha
        pivote = pArray[indiceSup - 1];
        pared  = actual = 0;
        while (actual < indiceSup) {
            if (pArray[actual] <= pivote) {
                if (pared != actual) {
                    temp = pArray[actual];
                    pArray[actual] = pArray[pared];
                    pArray[pared] = temp;              
                }
                pared ++;
            }
            actual ++;
        }
        // ordenación de la lista izquierda
        ordRapida(pArray, indiceInf, pared - 1);
        // ordenación de la lista derecha
        ordRapida(pArray, pared + 1, indiceSup);
    }
}
}


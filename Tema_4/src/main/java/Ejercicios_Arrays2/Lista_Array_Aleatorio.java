package Ejercicios_Arrays2;

public class Lista_Array_Aleatorio {
    
    public static void main(String[]args) {
        
        final int  TAM = 50;
        int nArray [] = new int[TAM];
        
        generarAleatorios(nArray);
        int cuantos = cuantosFaltan(nArray);
        
        int [] arFaltan = new int[cuantos];
        cargarLosperdidos(nArray, arFaltan);
        
        System.out.print("Arrays de 50\n");
        visualizar(nArray);
        System.out.println("\n\nValores que faltan del 1 al 100:");
        visualizar(arFaltan);
    }

    private static void visualizar(int[] nArray) {
        for(int i = 0; i < nArray.length; i++) {
            System.out.print(nArray[i] + " ");
        }
    }

    private static void cargarLosperdidos(int[] nArray, int[] arFaltan) {
        int posicion = 0;
        // Recorremos del 1 al 100
        for(int num = 1; num <= 100; num++) {
            boolean esta = false;
            // Buscamos si num está en el array original
            for(int i = 0; i < nArray.length && !esta; i++) {
                if(nArray[i] == num) {
                    esta = true;
                }
            }
            // Si no está, lo añadimos a arFaltan
            if (!esta) {
                arFaltan[posicion] = num;
                posicion++;
            }
        }
    }

    private static int cuantosFaltan(int[] nArray) {
        int cuantos = 0;
        // Recorremos del 1 al 100
        for(int num = 1; num <= 100; num++) {
            boolean esta = false;
            // Buscamos si num está en el array original
            for(int i = 0; i < nArray.length && !esta; i++) {
                if(nArray[i] == num) {
                    esta = true;
                }
            }
            // Si no está, contamos como faltante
            if (!esta) {
                cuantos++;
            }
        }
        return cuantos;
    }

    private static int[] generarAleatorios(int nArray[]) {
        for(int i = 0; i < nArray.length; i++) {
            nArray[i] = (int)(Math.random()*100)+1;
        }
        return nArray;
    }
}


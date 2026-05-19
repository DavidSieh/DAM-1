package Tema_4;

public class App {
    public static void main(String[] args) {
    	
        	
        	final int TAM = 5; // dimension del array
        	
//        	// array para almacenar las notas de DAM1, de programación
//        	int notas[] = {2, 5, 8, 2, 10, 3, 7, 4};
        	// array declarar (sin almacenar) las notas de DAM1, de programación
        	int notas1[] = new int[TAM];
        	
            System.out.println("Mi primer array");
            
//            System.out.println("Num. de alumnos: " + notas.length);
    //
//            System.out.println("Nota del primer alumno: " + notas[0]);
//            System.out.println("Nota del último alumno: " + notas[7]);
//            System.out.println("Nota del tercer alumno: " + notas[2]);
    // 
//            System.out.println("Sus notas (del primero al ultimo): ");
//            for(int posicion = 0; posicion < notas.length; posicion++) {
//            	System.out.println("Nota del alumno " + (posicion + 1) +
//            			": " + notas[posicion]);
//            }
//            
//            System.out.println("Sus notas (del ultimo al primero): ");
//            for(int posicion = notas.length - 1; posicion >= 0; posicion--) {
//            	System.out.println("Nota del alumno " + (posicion + 1) +
//            			": " + notas[posicion]);
//            }
    //
//            //imprime la referencia al array "notas"
//            System.out.println("Sus notas: " + notas.toString());
    //
    //
//            //imprime las "notas" en formato [2, 5, ... 4]
//            System.out.print("Sus notas:\n[");
//            for(int posicion = 0; posicion < notas.length; posicion++) {
//            	System.out.print( notas[posicion] + 
//            			(posicion == notas.length - 1 ? "" : ", "));
//            }
//            System.out.print("]");
            
          System.out.print("Sus notas:\n[");
          for(int posicion = 0; posicion < notas1.length; posicion++) {
        	  notas1[posicion] = (int) (Math.random() * 11);
          	System.out.print( notas1[posicion] + 
          			(posicion == notas1.length - 1 ? "" : ", "));
          }
          System.out.print("]");
            
    } 
    }


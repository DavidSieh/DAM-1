package Ejercicios_Arrays2;
import java.util.Scanner;
public class Agenda_Array {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	    
		boolean b = false;
		String AgendaN[] = {"David", "Luis","Motombo","Julia", "José"};
		String AgendaD[] = {"Calle 1", "Calle 2", "Calle 3", "Calle 4", "Calle 5"};
		
		
		do {
			System.out.println("Selecciona: " 
					+"\n1. caso 1"
					+"\n2. caso 2"
					+"\n3. caso 3"
					+"\n4. caso 4"
					+"\n4. caso 5");
				int A1 =sc.nextInt();
		
		switch(A1){
			case 1:System.out.println("Nombre: " + AgendaN[0] + " Dirección: " + AgendaD[0]) ;break;
			case 2:System.out.println("Nombre: " + AgendaN[1] + " Dirección: " + AgendaD[1]) ;break;
			case 3:System.out.println("Nombre: " + AgendaN[2] + " Dirección: " + AgendaD[2]) ;break;
			case 4:System.out.println("Nombre: " + AgendaN[3] + " Dirección: " + AgendaD[3]) ;break;
			case 5:System.out.println("Nombre: " + AgendaN[4] + " Dirección: " + AgendaD[4]) ;break;
			case 6:System.out.println("Saliendo del programa...");b = true;break;
			default:System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
		 } while (!b); 

        sc.close();
    }
		
	
		
	
	}
	

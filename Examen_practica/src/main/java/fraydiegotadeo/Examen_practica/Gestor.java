package fraydiegotadeo.Examen_practica;
import java.util.Scanner;
public class Gestor {
	
	
	
	
	protected static Gatos A1 = new Gatos("Bigotes", "Común Europeo", "Macho", 4,null , null, 0, 0, true);
	private static Perros B2 = new Perros(null, null, null, 0, null, null, 0, null, false, false);
	private static Tortuga C3 = new Tortuga(null, null, null, 0, null, null, 0, 0, false);

	
	protected static void menu() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
	
		do {
			
			System.out.println("-----BIENVENIDA LUCIA A TU APP--------");
			System.out.println("1. Mostrar Animales disponibles.");
			System.out.println("2. ¿Alguno lleva más de un mes  disponible para adopción?");
			System.out.println("3. Mostrar listado completo de animales ");
			System.out.println("4. Animales adoptados por Lucia :)");
			System.out.println("0. Salir del menu...");
		
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1: mostrarUnAnimal();break;
			case 2: sumarMes();break;
			case 3:	mostrarTodos();break;
			case 4: mostrarAdoptados();break;
				default: System.out.println("");break;
			}
	
	
		}while (opcion !=0);
		System.out.println("Saliendo.....");
		sc.close();
	}
	
	
	private static void mostrarUnAnimal() { 
		System.out.println("¿Qué animal quieres ver? \n1.Gato \n2.Perro \n3.Tortuga"); 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		switch (n) { 
			case 1: System.out.println(A1); break;
			case 2: System.out.println(B2); break;
			case 3: System.out.println(C3); break;
				default: System.out.println("ERROR"); break;
			}
	
		}
	
	private static void sumarMes() { 
		System.out.println("¿Qué animal lleva más de un mes? \n1.Gato \n2.Perro \n3.Tortuga");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		switch (n) { 
		case 1: A1.setFecha(A1.getFecha().plusMonths(1));break;
		case 2: B2.setFecha(B2.getFecha().plusMonths(1));break;
		case 3: C3.setFecha(C3.getFecha().plusMonths(1));break;
		default: System.out.println("ERROR");break;
		} 
		
	}
	
	private static void mostrarTodos() { 
		System.out.println(A1); 
		System.out.println(B2); 
		System.out.println(C3);
	}
	
	
	private static void mostrarAdoptados() { 
		if (A1.isAdoptado()) System.out.print(A1.getNombre() + "\n"); 
		if (B2.isAdoptado()) System.out.print(B2.getNombre() + "\n"); 
		if (C3.isAdoptado()) System.out.print(C3.getNombre() + "\n"); 
		} 
	
}


	


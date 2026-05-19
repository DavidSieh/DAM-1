package Herencia4;

import java.util.ArrayList;
import java.util.Scanner;



public class App {
	
	public static void main (String[]args) {
		
		menu();
		
	}

	private static void menu() {
		
			Scanner sc= new Scanner(System.in);
			
			
			ArrayList<Platos>comandas = new ArrayList<>();
			ArrayList<Comandas>comanda = new ArrayList<>();
			
			int opcion;
			
			do {
			    System.out.println("1. Agregar comanda");
			    System.out.println("2. Agregar platos");
			    System.out.println("3. Mostrar comandas");
			    System.out.println("4. Mostrar Platos y coste total");
			    System.out.println("5. Salir");
			    System.out.print("Opción a elegir: ");

			    opcion = sc.nextInt();

			    switch(opcion) {
			        case 1: agregarComanda(sc,comanda); break;
			        case 2: agregarPlatos(sc,comandas); break;
			        case 3: mostrarComanda(sc,comanda);
			        case 4: mostrarPlatos(sc,comandas); break;
			        case 5: System.out.println("Saliendo..."); break;
			        default: System.out.println("ERROR"); break;
			    }

			} while(opcion != 5);

			sc.close();
		}

	private static void mostrarPlatos(Scanner sc, ArrayList<Platos> comandas) {
		
		for(Platos i : comandas) {
			System.out.println(i);
		}
		
	}

	private static void mostrarComanda(Scanner sc, ArrayList<Comandas> comanda) {
		
		for(Comandas i : comanda) {
			System.out.println(i);
		}
		
		
	}

	private static void agregarPlatos(Scanner sc, ArrayList<Platos> comanda) {
		int opcion = sc.nextInt()
;		do {
		    System.out.println("1. Agregar Primero");
		    System.out.println("2. Agregar Carne");
		    System.out.println("3. agregar Pescados");
		    System.out.println("4. Agregar postre");
		    System.out.println("5. Salir");
		    System.out.print("Opción a elegir: ");

		    opcion = sc.nextInt();

		    switch(opcion) {
		        case 1:
		        	System.out.println("¿Nombre del plato? ");
		    		String nombre = sc.nextLine();
		    		
		    		sc.nextLine();
		    		
		    		System.out.println("¿Número de comensales? ");
		    		double precio = sc.nextDouble();	
		    		
		    		System.out.println("¿A compartir? (si/no)");
		    		String respuesta = sc.next().toLowerCase();

		    		boolean compartir = respuesta.equals("si");
		    		
		    		Primeros nuevo1 = new Primeros(nombre, precio, compartir);
		        	comanda.add(nuevo1);
		        	
		        	; break;
		        case 2: ; break;
		        case 3: ;
		        case 4: ; break;
		        case 5: System.out.println("Saliendo..."); break;
		        default: System.out.println("ERROR"); break;
		    }

		} while(opcion != 5);

		sc.close();
	}
		


	private static void agregarComanda(Scanner sc, ArrayList<Comandas> comanda) {
		
		System.out.println("¿Número de Mesa? ");
		int mesa = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("¿Número de comensales? ");
		int comensales = sc.nextInt();	
		
		System.out.println("¿Algún comensal es diabético? (si/no)");
		String respuesta = sc.next().toLowerCase();

		boolean diabetico = respuesta.equals("si");

		
		Comandas nuevo = new Comandas(mesa, comensales, diabetico);
		comanda.add(nuevo);
		
		
	}
			
}

	

	


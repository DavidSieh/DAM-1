package Herencia3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	

	public static void main(String[] args) {
		
		menu();
		
		
	}

	private static void menu() {
		Scanner sc= new Scanner(System.in);
		
		
		ArrayList<Electrodomestico>almacen = new ArrayList<>();
		
		
		int opcion;
		
		do {
		    System.out.println("1. Agregar compra");
		    System.out.println("2. Compra completa");
		    System.out.println("3. Precios individuales");
		    System.out.println("4. Precios totales");
		    System.out.println("5. Salir");
		    System.out.print("Opción a elegir: ");

		    opcion = sc.nextInt();

		    switch(opcion) {
		        case 1: agregarCompra(sc,almacen); break;
		        case 2: compraCompleta(sc,almacen); break;
		        case 3: preciosIndis(sc,almacen); break;
		        case 4: precioTotal(sc,almacen); break;
		        case 5: System.out.println("Saliendo..."); break;
		        default: System.out.println("ERROR"); break;
		    }

		} while(opcion != 5);

		sc.close();
	}

	private static void precioTotal(Scanner sc, ArrayList<Electrodomestico> almacen) {
		

	      System.out.println("--------mostrando precios totales de la compra---------");
			
			for(Electrodomestico i : almacen) {
				System.out.println(i.precioFinal() + "$");
			}
		
	}

	private static void preciosIndis(Scanner sc, ArrayList<Electrodomestico> almacen) {
		
      System.out.println("--------mostrando precios indis por orden de entrada---------");
		
		for(Electrodomestico i : almacen) {
			System.out.println(i.getPrecio() + "$");
		}
		
	}

	private static void compraCompleta(Scanner sc, ArrayList<Electrodomestico> almacen) {
		
		System.out.println("--------mostrando lista completa---------");
		
		for(Electrodomestico i : almacen) {
			System.out.println(i);
		}
		
	}

	private static void agregarCompra(Scanner sc, ArrayList<Electrodomestico> almacen) {
		
		int opcion1;
		do {
			System.out.println("1. Agregar Lavadora");
			 System.out.println("2. Agregar Television");
			 System.out.println("3. Salir");
			opcion1 = sc.nextInt();
			
			switch(opcion1) {
			case 1:
				System.out.println("----Añadiendo Lavadora----");
				
				sc.nextLine();
				System.out.println("Precio lavadora: ");
				double precio = sc.nextDouble();
				
				sc.nextLine();
				System.out.println("Color lavadora: ");
				String color = sc.nextLine();
				
				System.out.println("Consumo lavadora: ");
				char consumo = sc.next().charAt(0);
				
				System.out.println("Peso lavadora: ");
				double peso = sc.nextDouble();
				
				System.out.println("Carga lavadora: ");
				int carga = sc.nextInt();
				
				
				Lavadora nueva = new Lavadora(precio, color, consumo, peso, carga);
				almacen.add(nueva);break;
				
			case 2:
	         System.out.println("----Añadiendo Television----");
	         sc.nextLine();
				System.out.println("Precio Television: ");
				double precio1 = sc.nextDouble();
				
				sc.nextLine();
				System.out.println("Color Television: ");
				String color1 = sc.nextLine();
				
				System.out.println("Consumo Television: ");
				char consumo1 = sc.next().charAt(0);
				
				System.out.println("Peso television: ");
				double peso1 = sc.nextDouble();
				
				System.out.println("Tamaño Television: ");
				double tamaño = sc.nextDouble();
				
				System.out.println("¿Tiene TDT?: ");
				boolean TDT = sc.nextBoolean();
				
				
				Television nueva1 = new Television(precio1, color1, consumo1, peso1, tamaño, TDT);
				almacen.add(nueva1);break;
				
			case 3:System.out.println("Saliendo....");break;
			default: System.out.println("ERROR");break;
			
			}
		}while(opcion1!=3);
		
		
	}
		
		
		
	}



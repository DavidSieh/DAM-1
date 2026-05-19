package Videoclub;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		int opcion;	
		GestorVideoclub videoclub = new GestorVideoclub();
		
		// peliculas y clientes de prueba
		videoclub.aniadirCliente(new Cliente("Lourdes"));
		videoclub.aniadirCliente(new Cliente("Jorge"));
		videoclub.aniadirCliente(new Cliente("Marisol"));

		videoclub.aniadirPelicula(new Pelicula(1, "Moonligth"));
		videoclub.aniadirPelicula(new Pelicula(2, "Es por tu bien"));
		videoclub.aniadirPelicula(new Pelicula(3, "La la land"));
		videoclub.aniadirPelicula(new Pelicula(4, "El guardian invisible"));

		do {
			System.out.println("\n----MENU----");
			System.out.println("1-Prestamo");
			System.out.println("2-Devolucion");
			System.out.println("3-Listado Morosos");
			System.out.println("4-Listado Prestamos");
			System.out.println("5-Listado Peliculas");
			System.out.println("6-Salir");
			
			do {
				opcion = pedirNumero("Introduzca la opción deseada");
			} while (opcion < 1 || opcion > 6);
			
			switch (opcion) {
			case 1:
				opcionPrestamo(videoclub);
				break;
			case 2:
				opcionDevolucion(videoclub);
				break;
			case 3:
				System.out.println("LISTADO DE PRESTAMOS A MOROSOS");
				videoclub.mostrarPrestamosMosoros();				
				break;
			case 4:
				System.out.println("LISTADO TOTAL DE PRESTAMOS");
				videoclub.mostrarPrestamos();				
				break;
			case 5:
				System.out.println("CATÁLOGO DE PELÍCULAS");
				videoclub.mostrarPeliculas();
				break;
			default:
				System.out.print("\nFin del programa.");
				break;
			}
		} while (opcion != 6);

	}
	
	public static int pedirNumero(String mensaje) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);		
		System.out.print("\n" + mensaje +" ");
		return Integer.valueOf(entrada.nextLine());
	}
	
	public static void opcionPrestamo(GestorVideoclub videoclub) {
		
		// Definición de variables
		int codigoPelicula, numeroCarnet;
		Pelicula p;
		Cliente c;
		
		System.out.println("\nNUEVO PRESTAMO");
		codigoPelicula = pedirNumero("Codigo de pelicula?");
		
		p = videoclub.buscarPelicula(codigoPelicula);
		// Compruebo que exista la película
		if(p != null) {
			// Compruebo que no esté alquilada
			if(!videoclub.isPrestada(codigoPelicula)) {
				// Pido el número de carnet
				numeroCarnet = pedirNumero("Introduzca el número de carnet del cliente:");
				// busco el cliente con ese número de carnet
				c = videoclub.buscarCliente(numeroCarnet);
				// Compruebo que exista
				if(c != null) {
					// Lógica de negocio (LN)
					if(videoclub.aniadirPrestamo(new Prestamo(p, c))) {
						System.out.println("Prestamo realizado con éxito");
					} else {
						System.err.println("Error al realizar el préstamo");
					}	
				} else {
					System.out.println("El cliente no existe. Debe registrar ese cliente.");
				}
			} else {
				System.out.println("La película aún no está disponible.");
			}
		} else {
			System.out.println("La película no existe.");
		}
		
	}

	public static void opcionDevolucion(GestorVideoclub videoclub) {
		
		// Definición de variables
		int codigoPelicula, numeroCarnet;
		Pelicula p;
		Cliente c;

		System.out.println("\nDEVOLUCION");
		codigoPelicula = pedirNumero("Codigo de pelicula?");
		
		p = videoclub.buscarPelicula(codigoPelicula);
		// Compruebo que exista la película
		if(p != null) {
			// Compruebo que SI esté alquilada
			if(videoclub.isPrestada(codigoPelicula)) {
				// Pido el número de carnet
				numeroCarnet = pedirNumero("Introduzca el número de carnet del cliente:");
				// busco el cliente con ese número de carnet
				c = videoclub.buscarCliente(numeroCarnet);
				// Compruebo que exista
				if(c != null) {
					
					// Lógica de negocio (LN)
					if(videoclub.devolucion(codigoPelicula, numeroCarnet)) {
						System.out.println("Devolución realizada con éxito");
					} else {
						System.err.println("Error al realizar la devolución");
					}	
				} else {
					System.out.println("El cliente no existe.");
				}
			} else {
				System.out.println("La película no estaba prestada.");
			}
		} else {
			System.out.println("La película no existe.");
		}

	}
	
}

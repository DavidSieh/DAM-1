package com.frayd.dam.Tema6_7;

import java.util.Scanner;

public class AppTienda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GestorFactura gF = new GestorFactura();
		GestorStock gS = new GestorStock();
		char opcion;
		Cajonfacturas cajonFacturas = new Cajonfacturas();		
		Stock stock = new Stock();
		// Agrego 3 productos para no tener que comenzar insertando productos, pero no es necesario porque existe la opción Stock
		stock.insertarProducto(new Producto(1, "Pantalon---", 30.00F, 10, 5));
		stock.insertarProducto(new Producto(2, "Camisa----", 29.00F, 5, 2));
		stock.insertarProducto(new Producto(3, "Abrigo----", 60.00F, 6, 5));

		// Gestión del menú principal de la aplicación
		do {
			mostrarMenuPrincipal();
			opcion = pedirOpcion(sc, '3');
			switch (opcion) {
			case '1':
				menuFacturar(gF, cajonFacturas, stock, sc);
				break;
			case '2':
				menuStock(gS, stock, sc);
				break;
			}
		} while (opcion != '3');		
		sc.close();
		
	}

	// Visualiza el menú principal
	private static void mostrarMenuPrincipal() {
		System.out.println("----- MENU -----");
		System.out.println("\t1-FACTURAR");
		System.out.println("\t2-STOCK");
		System.out.println("\t3-FIN\n");
		System.out.print("\nIntroduzca la opción deseada: ");
	}
	
	// Gestiona las diferentes opciones de facturas (llama a los diferentes métodos, en la clase GestorFactura)
	private static void menuFacturar(GestorFactura gF, Cajonfacturas cajonFacturas, Stock stock, Scanner sc) {
		char opcion;
		do {
			mostrarMenuFactura();
			opcion = pedirOpcion(sc, '5');
			switch (opcion) {
			case '1':
				gF.insertarFactura(cajonFacturas, stock, sc);
				break;
			case '2':
				gF.buscarFactura(cajonFacturas, sc);
				break;
			case '3':
				gF.listarPendientes(cajonFacturas);
				break;
			case '4':
				gF.pagarPendientes(cajonFacturas, sc);
				break;
			}
			if (opcion != '5') {
				System.out.print("Pulse una tecla para continuar");
				sc.nextLine();
			}
		} while (opcion != '5');
		
	}
	
	// Visualiza el menú que permite gestionar las facturas
	private static void mostrarMenuFactura() {
		System.out.println("----FACTURACION----");
		System.out.println("\t1-Nueva Factura");
		System.out.println("\t2-Buscar Factura");
		System.out.println("\t3-Facturas Pendientes");
		System.out.println("\t4-Pago Facturas");
		System.out.println("\t5-Salir");
		System.out.print("\nIntroduzca la opción deseada: ");
	}	


	// Gestiona las diferentes opciones de stocks (llama a los diferentes métodos, en la clase GestorStock)
	private static void menuStock(GestorStock gS, Stock stock, Scanner sc) {
		char opcion;
		do {
			mostrarMenuStock();
			opcion = pedirOpcion(sc, '7');
			switch (opcion) {
			case '1':
				gS.añadirProducto(stock, sc);
				break;
				
			case '2':
				gS.borrarProducto(stock, sc);
				break;
			case '3':
				gS.buscarProducto(stock, sc);
				break;
			case '4':
				gS.listarProductosAgotados(stock);
				break;
			case '5':
				gS.listarProductosBajoMinimos(stock);
				break;
			case '6':
				gS.listarProductosConStock(stock);
				break;				
			}
		} while (opcion != '7');
	}
	
	// Visualiza el menú que permite gestionar el stock
	private static void mostrarMenuStock() {
		System.out.println("----Stock----");
		System.out.println("\t1-Nuevo producto");
		System.out.println("\t2-Borrar producto");
		System.out.println("\t3-Buscar producto");
		System.out.println("\t4-Productos agotados");
		System.out.println("\t5-Necesidades de compra");
		System.out.println("\t6-Mostrar stock");
		System.out.println("\t7-Salir");
		System.out.print("\nIntroduzca la opción deseada: ");
	}

	// Pedir las opciones de los diferentes menús (controla posibles errores, sin excepciones)
	private static char pedirOpcion(Scanner sc, char limite) {
		char opcion;
		do {
			opcion = sc.nextLine().charAt(0); //evitamos los enteros a la hora de introducir datos (control de errores)
		} while (opcion < '1' || opcion > limite);
		return opcion;
	}


}
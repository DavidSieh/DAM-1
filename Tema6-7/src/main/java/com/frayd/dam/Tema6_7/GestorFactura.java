package com.frayd.dam.Tema6_7;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorFactura {

	public void insertarFactura(Cajonfacturas cajonFacturas, Stock stock, Scanner sc) {
		System.out.println("INSERTANDO FACTURA...");
		Factura f = new Factura();
		char respuesta = 's';
		do {
			System.out.print("Codigo de producto:");
			int codigo = Integer.valueOf(sc.nextLine());
			Producto p = stock.buscarProducto(codigo);
			if (p != null) {
				// Se controla la cantidad de productos que se pueden facturar.
				System.out.print("Cantidad:");
				int cantidad = Integer.valueOf(sc.nextLine());
				
				if (p.getCantidad() < cantidad) {
					System.out.print("Cantidad no disponible");
				} else {
				
					LineaFactura lf = new LineaFactura(p.getCodigo(), cantidad, p.getPrecio());
					f.addLinea(lf);
					
					// Se resta la cantidad de productos de su total, una vez facturado
					p.setCantidad(p.getCantidad() - cantidad);
				}
			} else
				System.out.println("El producto no existe");
			// Se pueden insertar varias líneas de golpe
			System.out.println("Algo mas?(s/n)");
			respuesta = sc.nextLine().toLowerCase().charAt(0);
		} while (respuesta != 'n');
		
		// Se añade la factura al cajón.
		cajonFacturas.anadirFactura(f);
		System.out.println("Factura insertada!");
	}

	public void buscarFactura(Cajonfacturas cajonFacturas, Scanner sc) {		
		System.out.println("BUSCANDO FACTURA...");
		System.out.print("Escribe el numero de factura:");		
		int num = Integer.valueOf(sc.nextLine());
		Factura factura = cajonFacturas.buscarFactura(num);
		if (factura == null) {
			System.out.println("Esta factura no existe ");
		} else {
			imprimirFactura(factura);
		}		
	}

	public void listarPendientes(Cajonfacturas cajonFacturas) {		
		System.out.println("FACTURAS PENDIENTES");
		ArrayList<Factura> listaFacturas = cajonFacturas.facturasPendientes();
		if(listaFacturas.size() == 0) {
			System.out.println("No hay facturas pendientes");
		} else {					
			for (int i = 0; i < listaFacturas.size(); i++) {
				System.out.println(listaFacturas.get(i).getNumero());
			}
		}
	}
	
	public void pagarPendientes(Cajonfacturas cajonFacturas, Scanner sc) {		
		System.out.println("PAGO DE FACTURAS PENDIENTES");
		System.out.print("Numero de factura:");		
		int num = Integer.valueOf(sc.nextLine());		
		Factura factura = cajonFacturas.buscarFactura(num);
		if (factura == null) {
			System.out.println("Esta factura no existe ");
		} else {
			factura.setPagada(true);
			System.out.println("Factura pagada!");
		}		
	}
	
	public void imprimirFactura(Factura factura) {		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Factura numero:" + factura.getNumero() + "      Fecha:" + formato.format(factura.getFecha()));
		ArrayList<LineaFactura> lineas;
		lineas = factura.getLineas();
		float suma = 0;
		System.out.println("Producto\tCantidad\tPrecio");
		for (int i = 0; i < lineas.size(); i++) {
			System.out.print(lineas.get(i).getCodigo());
			System.out.print("\t\t" + lineas.get(i).getCantidad());
			System.out.println("\t\t" + lineas.get(i).getPrecio());
			suma += lineas.get(i).getCantidad() * lineas.get(i).getPrecio();
		}
		System.out.println("\t\tTOTAL:" + suma);
	}

}

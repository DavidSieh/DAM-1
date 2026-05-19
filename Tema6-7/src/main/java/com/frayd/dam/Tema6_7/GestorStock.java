package com.frayd.dam.Tema6_7;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorStock {

	public void añadirProducto(Stock stock, Scanner sc) {
		System.out.println("NUEVO PRODUCTO");				
		System.out.print("Escribe el codigo:");
		int codigo = Integer.valueOf(sc.nextLine());				
		System.out.print("Escribe la descripcion:");
		String descripcion = sc.nextLine();				
		System.out.print("Escribe el precio (con punto para el decimal):");
		float precio = Float.valueOf(sc.nextLine());				
		System.out.print("Escribe la cantidad:");
		int cantidad = Integer.valueOf(sc.nextLine());				
		System.out.print("Escribe el minimo:");
		int minimo = Integer.valueOf(sc.nextLine());				
		Producto p = new Producto(codigo, descripcion, precio, cantidad, minimo);
		if(stock.insertarProducto(p)) {
			System.out.println("Producto almacenado con éxito!");
		} else {
			System.out.println("Producto no ha podigo agregarse!");
		}
	}
	
	public void borrarProducto(Stock stock, Scanner sc) {
		System.out.println("BORRANDO PRODUCTO...");
		System.out.print("Escribe el codigo:");		
		int codigo = Integer.valueOf(sc.nextLine());
		boolean resultado = stock.borrarProducto(codigo);		
		if (resultado == false) {
			System.out.println("Este producto no existe");
		} else {
			System.out.println("Producto Borrado");
		}
	}

	public void buscarProducto(Stock stock, Scanner sc) {
		System.out.println("BUSCANDO PRODUCTO...");
		System.out.print("Escribe el codigo a buscar:");		
		int codigo = Integer.valueOf(sc.nextLine());
		Producto p = stock.buscarProducto(codigo);
		if (p == null) {
			System.out.println("Este producto no existe");
		} else {
			System.out.println("Descripcion: " + p.getDescripcion());
			System.out.println("Precio: " + p.getPrecio());
			System.out.println("Cantidad: " + p.getCantidad());
			System.out.println("Minimo: " + p.getMinimo());
		}
	}

	public void listarProductosAgotados(Stock stock) {
		System.out.println("LISTADO DE PRODUCTOS AGOTADOS");
		ArrayList<Producto> productos = stock.productosAgotados();
		if(productos.isEmpty()) {
			System.out.println("No hay productos agotados.");
		} else {					
			System.out.println("Codigo\tDescripcion\tPrecio\tMinimo");
			for (int i = 0; i < productos.size(); i++) {
				System.out.print(productos.get(i).getCodigo());
				System.out.print("\t" + productos.get(i).getDescripcion());
				System.out.print("\t" + productos.get(i).getPrecio());
				System.out.println("\t\t" + productos.get(i).getMinimo());
				System.out.println("--------------------------------------");
			}
		}
	}

	public void listarProductosBajoMinimos(Stock stock) {
		System.out.println("LISTADO DE NECESIDADES DE COMPRA");
		ArrayList<Producto> productos = stock.productosBajoMinimos();		
		if(productos.isEmpty()) {
			System.out.println("No hay productos bajo mínimos.");
		} else {					
			System.out.println("Codigo\tDescripcion\tCantidad\tMinimo");
			for (int i = 0; i < productos.size(); i++) {
				System.out.print(productos.get(i).getCodigo());
				System.out.print("\t" + productos.get(i).getDescripcion());
				System.out.print("\t" + productos.get(i).getCantidad());
				System.out.println("\t\t" + productos.get(i).getMinimo());
				System.out.println("---------------------------------------");
			}
		}
	}

	public void listarProductosConStock(Stock stock) {
		System.out.println("LISTADO DE PRODUCTOS EN STOCK");
		ArrayList<Producto> productos = stock.getStock();
		if(productos.isEmpty()) {
			System.out.println("No hay productos en stock.");
		} else {					
			System.out.println("Codigo\tDescripcion\tCantidad\tMinimo");
			for (int i = 0; i < productos.size(); i++) {
				System.out.print(productos.get(i).getCodigo());
				System.out.print("\t" + productos.get(i).getDescripcion());
				System.out.print("\t" + productos.get(i).getCantidad());
				System.out.println("\t\t" + productos.get(i).getMinimo());
				System.out.println("---------------------------------------");
			}
		}
	}

}
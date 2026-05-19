package com.frayd.dam.Tema6_7;

import java.util.ArrayList;

public class Stock {

	private ArrayList<Producto> productos;

	// constructor
	public Stock() {
		productos = new ArrayList<Producto>();
	}

	// lista de productos
	public ArrayList<Producto> getStock() {
		return productos;
	}

	// añadir un nuevo producto --> Mejorar con diferentes controles (como si el producto ya existe)
	public boolean insertarProducto(Producto p) {
		return productos.add(p);
	}

	// borrar un producto del almacen
	public boolean borrarProducto(int codigo) {
		boolean encontrado = false;
		for (int i = 0; i < productos.size() && !encontrado; i++) {
			if (productos.get(i).getCodigo() == codigo) {
				productos.remove(i);
				encontrado = true;
			}
		}
		return encontrado;
	}

	// buscar un producto del almacen a partir de su codigo
	public Producto buscarProducto(int codigo) {
		Producto p = null;
		boolean encontrado = false;		
		for (int i = 0; i < productos.size() && !encontrado; i++) {
			if ( productos.get(i).getCodigo() == codigo ) {
				p = productos.get(i);
				encontrado = true;
			}
		}
		return p;
	}

	// lista de productos con cantidad==0
	public ArrayList<Producto> productosAgotados() {
		ArrayList<Producto> agotados = new ArrayList<Producto>();
		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getCantidad() == 0) {
				// aniadiendo producto agotado a la lista de agotados
				agotados.add(productos.get(i));
			}
		}
		return agotados;
	}

	// lista de productos cuya cantidad es inferior al minimo stock
	public ArrayList<Producto> productosBajoMinimos() {
		ArrayList<Producto> necesidades = new ArrayList<Producto>();
		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getCantidad() < productos.get(i).getMinimo()) {
				// aniadiendo producto bajo minimos a la lista
				necesidades.add(productos.get(i));
			}
		}
		return necesidades;
	}
	
}

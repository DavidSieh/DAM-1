package com.frayd.dam.Tema6_7;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Factura {
	
	private static int numerosDeFactura = 1; // atributo static para numeros de factura
	private int numero; // numero de la factura
	private LocalDateTime fecha; // fecha de emision de la factura
	private boolean pagada; // factura pagada o pendiente de cobro
	private ArrayList<LineaFactura> lineas; // array de lineas de factura

	// constructor de facturas
	public Factura() {
		numero = numerosDeFactura;
		numerosDeFactura++;
		fecha = LocalDateTime.now();
		pagada = false;
		lineas = new ArrayList<LineaFactura>();
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}

	public void addLinea(LineaFactura lf) {
		lineas.add(lf);
	}

	public int getNumero() {
		return numero;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
}


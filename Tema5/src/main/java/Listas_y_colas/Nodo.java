package Listas_y_colas;

import java.util.Objects;

class Nodo { 
	
	//Esta clase tiene como función principal que se inserten elementos y pasen al siguiente funcionando como Lista enlazada.
	//simplemente tiene 2 atributos.
	
	private int valor; 
	private Nodo siguiente;
	
	
	//Constructor vacio.
	public Nodo() {
		this.valor = 0;
		this.siguiente = null;
	}
	
	
	//Constructor con Dato por defecto.
	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public Nodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}


	@Override
	public int hashCode() {
		return Objects.hash(siguiente, valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		return Objects.equals(siguiente, other.siguiente) && valor == other.valor;
	}


	@Override
	public String toString() {
		return "Dato Nodo: " + valor;
	} 
	
	//operaciones añadir,recorrer y eliminar.
	
	
	//Añadir dato en lista.
	
	public boolean aniadirNodo(Nodo inicio) {
		boolean aniadido = false;
		return aniadido;
	}
	

	}

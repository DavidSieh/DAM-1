package Listas_y_colas;

public class ListaEnlazada implements Lista{
	
	private static int  CONTROL = -1; 
	private Nodo inicio; // primer elemento de la lista enlazada
	private int numElementos; //total de elementos de la lista
	
	
	//Constructor por defecto (lista vacia).
	
	public ListaEnlazada() {
		this.inicio = null;
		this.numElementos = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	@Override
	public int getFirst() {
		int primero = -1;
		if(!isEmpty()) {
			primero = inicio.getValor();
		}
		return primero;
	}

	@Override
	public int getLast() {
	int último = -1;
	Nodo recorre = inicio;
	
	if(!isEmpty()) {
		while(recorre.getSiguiente() != null) {
			recorre=recorre.getSiguiente();
		}
		último = recorre.getValor();
	}
		return último;
	}

	@Override
	public void insertAtBegin(int info) {
		Nodo nuevo =  new Nodo(info);
		nuevo.setSiguiente(inicio);
		inicio = nuevo;
		numElementos++;
	}

	@Override
	public void insertAtEnd(int info) {
		Nodo recorre = new Nodo(info);
		@SuppressWarnings("unused")
		int último;
		if(isEmpty()) {
			while(recorre.getSiguiente() != null) {
				recorre=recorre.getSiguiente();
			}
			último = recorre.getValor();
			
		}
		numElementos++;
		}

	@Override
	public void insertAtPosition(int index, int info) {
		if(index<= (size() + 1)) {// permitimos añadir al final.
			if(index == 1) 
				insertAtBegin(info);
			else if(index == (size() + 1))// si quiere añadir detras del último
				insertAtEnd(info);
				else {
					Nodo nuevo = new Nodo(info);
					Nodo anterior=inicio;
					Nodo recorre=inicio;
					int contador = 1;
					
					while(contador != index) {
						anterior = recorre;
						recorre = recorre.getSiguiente();
						contador++;
					}
					nuevo.setSiguiente(recorre);
					//es como que se guarda entre medias el dato
					anterior.setSiguiente(nuevo);
					numElementos++;
				}
		}else {
			System.out.println("No existe esa posición");
		}
		
	}

	@Override
	public boolean containsInfo(int info) {
		boolean existe = false;
		
		Nodo recorre = new Nodo();
			while (recorre.getSiguiente() != null && recorre.getValor() != info)
				recorre=recorre.getSiguiente();
					if(recorre.getValor() != info) {
						existe = true;
					}
		return existe;
	}

	@Override
	public int getElementAt(int index) {
		int info = CONTROL;
		if(index<= (size() + 1)) {
			int contador = 1;
			Nodo recorre = new Nodo();
			while(contador != index) {
				recorre = recorre.getSiguiente();
				contador++;
				
			}
			if (contador == index) {
				info = recorre.getValor();
			}
		}
		
		return info;
	}

	@Override
	public boolean removeByInfo(int info) {
		boolean borrado = false;
		
		if(containsInfo(info)) {
			Nodo Borrar = inicio;
			if(info == inicio.getValor()) {// está el primero
				inicio = inicio.getSiguiente();
			}else {
				Nodo anterior = inicio;
				while(Borrar.getValor()!= info && Borrar.getSiguiente() !=null) {
					anterior =Borrar;
					Borrar =Borrar.getSiguiente();
				}if(Borrar.getValor() == info) {
					anterior.setSiguiente(Borrar.getSiguiente());
					
				}
			}
			Borrar = null;
			borrado=true;
		}
		
		return borrado;
	}

	@Override
	public boolean removeAt(int index) {
		boolean borrado = false;
		if(index<= size()) {
			Nodo Borrar = inicio;
			if (index == 1) {
				inicio = inicio.getSiguiente();
		}else {
			int contador = 1;
			Nodo anterior = inicio;
			while(contador!= index) {
				anterior = Borrar;
				Borrar = Borrar.getSiguiente();
				contador++;
			}
			if(contador == index) {
				anterior.setSiguiente(Borrar.getSiguiente());
			}
			
		}
			
			Borrar = null;
			borrado=true;
	}
		
		return borrado;
	}

	@Override
	public void print() {

		if (size() == 0) {
			System.out.println("No existe la lista");
		}else {
			Nodo recorre = inicio;
			while(recorre.getSiguiente() != null) {
				System.out.println(recorre);
				recorre=recorre.getSiguiente();
			}
		}
		
	}

	@Override
	public boolean clearList() {
		boolean borrarTodo = false;
		if (size() == 0) {
			System.out.println("No existe la lista");
			borrarTodo = true;
		}else {
			int contador =1;
			borrarTodo=true;
			while (contador <= size() && borrarTodo == true) {
				removeAt(contador);
				
				contador++;
			}
			
		}
		
		return borrarTodo;
	}

	@Override
	public int size() {
		return numElementos;
	}

}

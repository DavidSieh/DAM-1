package Listas_y_colas;

public class Listaenlazadaapp {
	
	public static void main(String[]args) {
		
		ListaEnlazada listaE = new ListaEnlazada();
		
		
		listaE.insertAtBegin(23);
		System.out.println("lista actual:");
		listaE.print();
		
		System.out.println("lista contiene: " + listaE.size());
	}

}

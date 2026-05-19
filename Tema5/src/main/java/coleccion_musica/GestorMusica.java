package coleccion_musica;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class GestorMusica {
	
	protected LinkedList<CD>GestorMusica = new LinkedList<>();
	
	public GestorMusica(){
	
	DVDs d1 = new DVDs("Mala Gestión", LocalDate.now(), 19.99, 10);
	DVDs d2 = new DVDs("Kino", LocalDate.now(), 19.99, 10);
	DVDs d3 = new DVDs("Disturbed", LocalDate.now(), 19.99, 10);
	Discos c2 = new Discos("Noche de casino", LocalDate.now(), 19.99, "Madrid");
	Discos c3 = new Discos("En que pais", LocalDate.now(), 19.99, "Badalona");
	
	GestorMusica.addFirst(d1);
	GestorMusica.addFirst(d2);
	GestorMusica.addFirst(d3);
	GestorMusica.addFirst(c2);
	GestorMusica.addFirst(c3);
}
	
	public void menu() {
		Scanner sc = new Scanner(System.in); 
		int opcion;
		
		do {
			System.out.println("1.Conjunto de los discos almacenados");
			System.out.println("2.Mostrar precios y tituo");
			System.out.println("3.Solicitar un año de compra y mostrar los datos de cualquier disco o dvd");
			System.out.print("Opción a elegir: ");
			
			opcion=sc.nextInt();
		
			
			switch (opcion) { 
			case 1: rellenarColeccion(); break; 
			case 2: mostrarPrecios(); break; 
			case 3: System.out.print("Introduce año de compra: "); int año = sc.nextInt(); 
			buscarPorAño(año); break; 
			
			case 4: System.out.println("Saliendo del programa..."); break; 
			default: System.out.println("Opción no válida."); 
			} 
			} while (opcion != 4); 
		sc.close(); 
		}

	private void buscarPorAño(int año) { 
		boolean encontrado = false; 
		for (CD item : GestorMusica) { 
			if (item.getAno() != null && item.getAno().getYear() == año) { 
				System.out.println(item); encontrado = true; 
				} 
			} if (!encontrado) { 
				System.out.println("No se encontraron artículos del año " + año); 
				} 
			}

	private void mostrarPrecios() {
	    if (GestorMusica.isEmpty()) {
	        System.out.println("La colección está vacía.");
	        return;
	    }

	    System.out.println("Listado de precios:");
	    for (CD item : GestorMusica) {
	        System.out.println(item.getTitulo() + " - " + item.getPrecio() + " €");
	    }
	}


	private void rellenarColeccion() { 
		System.out.println("Elementos actualmente en la colección:"); 
	for (CD item : GestorMusica) { System.out.println(item); 
	} 
	}
		
	}
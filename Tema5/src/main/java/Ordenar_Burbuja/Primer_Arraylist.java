package Ordenar_Burbuja;

import java.util.ArrayList;

public class Primer_Arraylist {
	


	public static void main(String[]args) {
		
		System.out.println("Pruebas de Arraylist");
		
		ArrayList <String> nombre = new ArrayList<String>();
		
		nombre.add("Matías");
		nombre.add("José Luis");
		
		System.out.print(nombre);
		
		nombre.add(1,"Mateo");
		System.out.println("\nSegunda prueba de Arraylist");
		System.out.print(nombre);
		
		System.out.println("\nTamaño: " + nombre.size());
		nombre.add(nombre.size(),"Antonio");
		System.out.print(nombre);
		
		nombre.remove(0);
		nombre.set(0, "Martín");
		System.out.print("\n" + nombre);
		
		//copia de ArrayList
		ArrayList <String> clase = new ArrayList<String>(nombre);
		System.out.println("\nCopia del ArrayList:");
		System.out.print(clase);
		
		clase = reverse(clase);
	}

	private static ArrayList<String> reverse(ArrayList<String> clase) {
	
		ArrayList<String>resultado = new ArrayList<String>();
		for (int i = clase.size() - 1; i >= 0; i--)
			resultado.add(clase.get(i));
		return resultado;
	}
	
	
	
}

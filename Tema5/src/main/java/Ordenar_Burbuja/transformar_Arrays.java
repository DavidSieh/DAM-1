package Ordenar_Burbuja;

import java.util.ArrayList;

public class transformar_Arrays {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> pArray = new ArrayList<>();
		
		pArray.add(2);
		pArray.add(25);
		pArray.add(23);
		pArray.add(1);
		pArray.add(7);
		pArray.add(9);
		pArray.add(92);
		pArray.add(86);
		pArray.add(42);
		pArray.add(32);
		pArray.add(12);
		pArray.add(345);
		pArray.add(245);
		
		System.out.print(pArray);
		
		System.out.println("Ordenacion en burbuja");
		System.out.println(ordenarBurbuja(pArray));
		
	}
		
	public static ArrayList<Integer> ordenarBurbuja(ArrayList<Integer> pArray) {
		
		int contador = 0; // cuenta las pasadas externas 
		for (int i = 0; i < pArray.size() - 1; i++) { 
			contador++; 
			for (int j = 0; j < pArray.size() - i - 1; j++) 
			{ 
				if (pArray.get(j) > pArray.get(j + 1)) { 
					int temp = pArray.get(j); 
					pArray.set(j, pArray.get(j + 1));
					pArray.set(j + 1, temp); 
					} 
				}
			} 
		System.out.println("Número de pasos hasta ordenar = " + contador); 
		return pArray; }
			
		}
	
		
	


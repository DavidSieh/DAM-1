package Genéricos;

public class Generico_prueba {
	
	public static void main(String[]args) {
		
		
		//wrapper porque no se admiten primitivos en genericos.
		//Integer arr[]= {1,2,3,4};
		String arr[] = {"España","Francia","Portugal","Alemania","Brasil","Finlandia","Argentina"};
		System.out.println(tomarAleatorio(arr));
	}

	private static <T> T tomarAleatorio(T arr[]) {
		
		int i = (int)(Math.random()*arr.length);
		
		return arr[i];
	}

}

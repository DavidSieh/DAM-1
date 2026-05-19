package Genéricos;

public class ClaseGenericaMain {
	
	public static void main (String[]args) {
		
	
	
	Generica <Integer> miEntero = new Generica <Integer>();
	miEntero.setMiDato(90);
	System.out.println("Integer:" + miEntero.getMiDato());
	
	
	/**
	 * @author david.sieher
	 */
}
}
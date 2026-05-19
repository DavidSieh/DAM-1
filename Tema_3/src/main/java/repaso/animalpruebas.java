package repaso;

public class animalpruebas {
	
	public static void main (String[]args) {
		
		Animal A1= new Animal("2025-11-13"); 
		//A1.setNombre("Pioloin");
		A1.ponerNombre();
		
		Animal A2= new Animal("Matilde", "2025-12-25");
		
		
		System.out.println("Animal 1: " + A1.getNombre());
		System.out.println("Animal 2: " + A2);
		
		
		System.out.println("Iguales? " + (A1.equals(A2) ? "Si" : "No"));
		
		Ave av1= new Ave("Piolin", "2026-1-15", true);
		av1.setVuela(true);
		
		System.out.println("Animal 3: " + av1);
	
	}

}

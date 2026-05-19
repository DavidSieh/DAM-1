package Ej2;

public class CajaSorpresa_app {
	
	public static void main(String[]args) {
		
		CajaSorpresa Caja = new  CajaSorpresa();
		
		
		System.out.println("Sorpresas registradas: ");
		Caja.agregarSorpresa(1, "Móvil");
		Caja.agregarSorpresa(2, "entrada concierto");
	
		System.out.print(Caja.getCajas());
	}

}

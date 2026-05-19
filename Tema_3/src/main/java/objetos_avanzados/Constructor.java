package objetos_avanzados;

public class Constructor {

	
	public static void main(String[]args) {
		
		System.out.println("Tema 3");
		
		//Cliente José
		
		Cliente cliente1 = new Cliente(" 12345678N "," José ",674824231);
		System.out.println("Nombre del cliente:" + cliente1.getNombre());
		System.out.println("Dni del cliente:" + cliente1.getDni());
		System.out.println("Tlfno del cliente: " + cliente1.getTelefono());
		
		System.out.println("\nSiguiente cliente");
		
		Cliente cliente2 = new Cliente(" 128767493N "," Josélito ",67482428);
		System.out.println("Nombre del cliente:" + cliente2.getNombre());
		System.out.println("Dni del cliente:" + cliente2.getDni());
		System.out.println("Tlfno del cliente: " + cliente2.getTelefono());
		
		System.out.println("\nSiguiente cliente");
		
		Cliente cliente3 = new Cliente(" 197867493N "," Tirso ",897563425);
		System.out.println("Nombre del cliente:" + cliente3.getNombre());
		System.out.println("Dni del cliente:" + cliente3.getDni());
		System.out.println("Tlfno del cliente: " + cliente3.getTelefono());
		
	
//		//creo un cliente sin constructor
//		
//		Cliente cliente4 = new Cliente();
//		cliente4.setNombre(" José ");
//		System.out.println("Nombre del cliente:" + cliente4.getNombre());
//		System.out.println("Dni del cliente:" + cliente4.getDni());
//		System.out.println("Tlfno del cliente: " + cliente4.getTelefono());
	}
}


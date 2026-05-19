package ClaseV;

public class Appprincipal {
	
	public static void main(String[]args) {
		
		GestorServicios G= new GestorServicios(0, null, null, false, null, null, null);
		
		Netflix N1 = new Netflix(15.99,"Jose", "Curro", true, "ES67 0043 5874 2511 1591 2816", "Francisco José Joselez", "España");
	
		Hbo H1 = new Hbo(8.99, "Manolo", "filip", true, "ES67 0043 5874 2511 1591 2816", false, "Manolo Gutierrez Blanco");
		
		PrimeVideo P1 = new PrimeVideo(3.0, "Julia", "Juls", true, "ES67 0043 5874 2511 1591 2816", "Julita@gmail.com", "Julia manoliz"); 
		
		System.out.println(G);
		System.out.println();
		System.out.println("INFORMACIÓN GENERAL DE LOS SERVICIOS CONTRATADOS: \n");
		
		
		System.out.println(N1);
		System.out.println();
		System.out.println(H1);
		System.out.println();
		System.out.println(P1);
	}

}

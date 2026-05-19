package EjerciciosUT3;

public class DatosPersona {



	    public static void main(String[] args) {
	        // Crear objetos Persona dentro del método main
	        Persona p1 = new Persona(null, 0);
	        p1.setnombre("Juan");
	        p1.setedad(35);

	        Persona p2 = new Persona(null, 0);
	        p2.setnombre("Juanico");
	        p2.setedad(45);

	        // Mostrar datos
	        System.out.println("Persona 1: " + p1.getnombre() + ", Edad: " + p1.getedad());
	        System.out.println("Persona 2: " + p2.getnombre() + ", Edad: " + p2.getedad());
	    }
	}



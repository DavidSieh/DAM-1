package FrayDiegoTadeo.Examen02;

import java.util.Scanner;

public class init {

	    public static void main(String[] args) {
	        menu();
	    }

	    public static void menu() {
	        Scanner sc = new Scanner(System.in);
	        GestorAnimales gs = new GestorAnimales();
	        int opcion;

	       //menu principal, aquí llamamos a todos los metodos con un switch en dependencia del número.
	        
	        do {
	            System.out.println("\n----- MENÚ DE LUCÍA -----");
	            System.out.println("1. Adoptar un animal");
	            System.out.println("2. Mostrar nombres de animales adoptados");
	            System.out.println("3. Mostrar gasto mensual total");
	            System.out.println("4. Mostrar número total de animales");
	            System.out.println("5. Mostrar información completa de todos los animales");
	            System.out.println("0. Salir");
	            System.out.print("Elige opción: ");

	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    adoptarAnimal(gs);
	                    break;

	                case 2:
	                    System.out.println(gs.mostrarAnimales());
	                    break;

	                case 3:
	                    System.out.println("Gasto mensual: " + gs.gastoMensual() + " €");
	                    break;

	                case 4:
	                    System.out.println("Total animales: " + gs.contarAnimales());
	                    break;

	                case 5:
	                    mostrarInfoCompleta(gs);
	                    break;

	                case 0:
	                    System.out.println("Saliendo...");
	                    break;

	                default:
	                    System.out.println("Opción no válida");
	            }

	        } while (opcion != 0);

	        sc.close();
	    }

	    //Aquí se pregunta 
	    
	    @SuppressWarnings("resource")
		private static void adoptarAnimal(GestorAnimales gs) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("\n¿Qué animal quieres adoptar?");
	        System.out.println("1. Gato");
	        System.out.println("2. Perro");
	        System.out.println("3. Tortuga");
	        int tipo = sc.nextInt();

	        System.out.print("Nombre del animal: ");
	        String nombre = sc.next();

	        System.out.print("Edad: ");
	        int edad = sc.nextInt();

	        System.out.print("Raza: ");
	        String raza = sc.next();

	        // Preguntar si es macho con validación S/N
	        char sexo;
	        do {
	            System.out.print("¿Es macho? (S/N): ");
	            sexo = sc.next().toUpperCase().charAt(0);
	        } while (sexo != 'S' && sexo != 'N');

	        boolean macho = (sexo == 'S');

	        // Crear tarjeta con datos reales
	        TarjetaId t = new TarjetaId("Lucía", raza, macho, edad, null);

	        switch (tipo) {
	            case 1:
	                System.out.print("Número de camadas (0-3): ");
	                int camadas = sc.nextInt();
	                Gato g = new Gato(t, nombre, camadas);
	                if (gs.setGatos(g)) {
	                    g.setGasto(g.gastoAnimal());
	                    System.out.println("Gato adoptado.");
	                } else {
	                    System.out.println("No puedes adoptar más gatos.");
	                }
	                break;

	            case 2:
	                System.out.print("¿Rastrea? (S/N): ");
	                char r;
	                do {
	                    r = sc.next().toUpperCase().charAt(0);
	                } while (r != 'S' && r != 'N');

	                boolean rastrea = (r == 'S');

	                Perro p = new Perro(t, nombre, rastrea);
	                if (gs.setPerros(p)) {
	                    p.setGasto(p.gastoAnimal());
	                    System.out.println("Perro adoptado.");
	                } else {
	                    System.out.println("No puedes adoptar más perros.");
	                }
	                break;

	            case 3:
	                System.out.print("Peso de la tortuga: ");
	                double peso = sc.nextDouble();
	                Tortuga tt = new Tortuga(t, nombre, peso);
	                if (gs.setTortugas(tt)) {
	                    tt.setGasto(tt.gastoAnimal());
	                    System.out.println("Tortuga adoptada.");
	                } else {
	                    System.out.println("No puedes adoptar más tortugas.");
	                }
	                break;

	            default:
	                System.out.println("Tipo no válido.");
	        }
	    }

	    private static void mostrarInfoCompleta(GestorAnimales gs) {
	        System.out.println("\n--- INFORMACIÓN COMPLETA DE LOS ANIMALES ---");
	        System.out.println(gs.toString());
	    }
	}

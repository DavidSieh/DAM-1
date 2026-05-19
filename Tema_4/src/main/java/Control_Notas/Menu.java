package Control_Notas;

import java.util.Scanner;

public class Menu {
	
	
	public static void main(String[]args) {
		
		menu();	
	}
		private static void menu() {

		        Scanner sc = new Scanner(System.in);
		        GestorNotas gestor = new GestorNotas();
		        int opcion;

		        do {
		            System.out.println("---------MENU----------");
		            System.out.println("1. Añadir Alumno");
		            System.out.println("2. Eliminar Alumno");
		            System.out.println("3. Modificar nota del alumno");
		            System.out.println("4. Mostrar Aprobados");
		            System.out.println("5. Nota media de alumnos");
		            System.out.println("0. Salir");

		            opcion = sc.nextInt();
		            sc.nextLine(); // limpia buffer

		            switch (opcion) {
 
		            case 1: añadirAlumno(gestor, sc); break; 
		            
		            case 2: eliminarAlumno(gestor, sc); break; 
		            
		            case 3: modificarNota(gestor, sc); break; 
		            
		            case 4: gestor.mostrarAprobados(); break;
		            
		            case 5: double media = gestor.notaMedia(); 
		            if (media == -1) { 
		            	System.out.println("No hay alumnos en la clase."); 
		            	} else { 
		            		System.out.println("La nota media es: " + media); 
		            		} break;
		            
		                case 0:
		                    System.out.println("Saliendo...");
		                    break;

		                default:
		                    System.out.println("ERROR");
		            }

		        } while (opcion != 0);

		        sc.close();
		    }
		
		private static void eliminarAlumno(GestorNotas gestor, Scanner sc) {
			System.out.print("Nombre del alumno: "); 
			String nombre = sc.nextLine(); 
			
			if (gestor.eliminarAlumno(nombre)) { 
				System.out.println("Alumno eliminado."); 
				} else { 
					System.out.println("No existe ese alumno.");
					}
			
		}
		private static void añadirAlumno(GestorNotas gestor, Scanner sc) {

	        System.out.print("Nombre: ");
	        String nombre = sc.nextLine();

	        System.out.print("Nota del alumno: ");
	        int notas = sc.nextInt();
	        sc.nextLine();

	        Alumno nuevo = new Alumno(nombre, notas);

	        if (gestor.anadirAlumno(nuevo)) {
	            System.out.println("Alumno añadido correctamente.");
	        } else {
	            System.out.println("La clase está llena.");
	        }
	    }
		private static void modificarNota(GestorNotas gestor, Scanner sc) { 
			System.out.print("Nombre del alumno: "); 
			String nombre = sc.nextLine(); 
			System.out.print("Nueva nota: "); 
			double nuevaNota = sc.nextDouble(); sc.nextLine(); 
			
			if (gestor.modNotas(nombre, nuevaNota)) { 
				System.out.println("Nota modificada."); 
				} else { 
					System.out.println("No existe ese alumno."); 
					}
		}
		
		}
	

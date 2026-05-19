package Ejercicio_archivos;

import java.io.*;
import java.util.*;

public class Ejercicio13 {
    
	
	private static final String FICHERO = "agenda.txt";
    private static final int MAX_CONTACTOS = 20;

    private static class Contacto {
        String nombre;
        String telefono;

        Contacto(String n, String t) {
            nombre = n;
            telefono = t;
        }
    }

    private static List<Contacto> cargarAgenda() {
        
    	List<Contacto> agenda = new ArrayList<>();
        File f = new File(FICHERO);
       
        if (!f.exists()) return agenda;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
           
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
               
                if (partes.length == 2) {
                    agenda.add(new Contacto(partes[0], partes[1]));
                }
            }
       
        } catch (IOException e) {
            System.out.println("Error leyendo agenda: " + e.getMessage());
       
        }
        return agenda;
    }

    private static void guardarAgenda(List<Contacto> agenda) {
       
    	try (PrintWriter pw = new PrintWriter(new FileWriter(FICHERO))) {
            
    		for (Contacto c : agenda) {
                pw.println(c.nombre + ";" + c.telefono);
            }
       
    	} catch (IOException e) {
            System.out.println("Error guardando agenda: " + e.getMessage());
        }
    }

    private static boolean existeNombre(List<Contacto> agenda, String nombre) {
        
    	for (Contacto c : agenda) {
            
    		if (c.nombre.equalsIgnoreCase(nombre)) return true;
        }
        return false;
    }

    private static void mostrarMenu() {
        System.out.println("1. Nuevo contacto");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Mostrar todos");
        System.out.println("4. Salir");
        System.out.print("Opción: ");
    }

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        List<Contacto> agenda = cargarAgenda();
       
        int opcion;

        do {
            mostrarMenu();
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Opción: ");
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1:
                    if (agenda.size() >= MAX_CONTACTOS) {
                        System.out.println("La agenda está llena.");
                    
                    } else {
                        
                    	System.out.print("Nombre: ");
                        String nombre = sc.nextLine().trim();
                        
                        if (existeNombre(agenda, nombre)) {
                            System.out.println("Ese nombre ya existe en la agenda.");
                        } else {
                           
                        	System.out.print("Teléfono: ");
                           
                        	String telefono = sc.nextLine().trim();
                            agenda.add(new Contacto(nombre, telefono));
                           
                            System.out.println("Contacto añadido.");
                        }
                    }
                    break;
                case 2:
                  
                	System.out.print("Cadena a buscar: ");
                    String cadena = sc.nextLine().trim().toLowerCase();
                   
                    boolean encontrado = false;
                   
                    for (Contacto c : agenda) {
                        if (c.nombre.toLowerCase().contains(cadena)) {
                            System.out.println(c.nombre + " -> " + c.telefono);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontraron contactos.");
                    }
                    break;
                case 3:
                    agenda.sort(Comparator.comparing(c -> c.nombre.toLowerCase()));
                    
                    for (Contacto c : agenda) {
                        System.out.println(c.nombre + " y nº tlfn " + c.telefono);
                    }
                    break;
                case 4:
                    guardarAgenda(agenda);
                    System.out.println("Agenda guardada. Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 4);
        sc.close();
    }
}

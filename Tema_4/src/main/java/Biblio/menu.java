package Biblio;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {

        Scanner sc = new Scanner(System.in);
        GestorBiblioteca gestor = new GestorBiblioteca();
        int opcion;

        do {
            System.out.println("---------MENU----------");
            System.out.println("1. Añadir libro");
            System.out.println("2. Información de libros en biblioteca");
            System.out.println("3. Buscar por ISBN");
            System.out.println("4. Eliminar libro");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // limpia buffer

            switch (opcion) {

                case 1:
                    añadirLibro(gestor, sc);
                    break;

                case 2:
                    gestor.mostrarLibros();
                    break;

                case 3:
                    buscarLibro(gestor, sc);
                    break;

                case 4:
                    eliminarLibro(gestor, sc);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("ERROR");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void añadirLibro(GestorBiblioteca gestor, Scanner sc) {

        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Año publicación: ");
        int año = sc.nextInt();
        sc.nextLine();

        Libro nuevo = new Libro(isbn, titulo, autor, año);

        if (gestor.añadirLibro(nuevo)) {
            System.out.println("Libro añadido correctamente.");
        } else {
            System.out.println("La biblioteca está llena.");
        }
    }

    private static void buscarLibro(GestorBiblioteca gestor, Scanner sc) {

        System.out.print("ISBN a buscar: ");
        String isbn = sc.nextLine();

        Libro encontrado = gestor.buscarPorISBN(isbn);

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        } else {
            System.out.println("No existe ese libro.");
        }
    }

    private static void eliminarLibro(GestorBiblioteca gestor, Scanner sc) {

        System.out.print("ISBN a eliminar: ");
        String isbn = sc.nextLine();

        if (gestor.eliminarLibro(isbn)) {
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("No existe ese libro.");
        }
    }
}

		

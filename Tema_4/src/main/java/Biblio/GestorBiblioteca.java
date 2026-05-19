package Biblio;

public class GestorBiblioteca {

    private Libro[] libreria = new Libro[15];

    public boolean añadirLibro(Libro libro) {
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] == null) {
                libreria[i] = libro;
                return true;
            }
        }
        return false; // biblioteca llena
    }

    public Libro buscarPorISBN(String isbn) {
        for (Libro l : libreria) {
            if (l != null && l.getISBN().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && libreria[i].getISBN().equals(isbn)) {
                libreria[i] = null;
                return true;
            }
        }
        return false;
    }

    public void mostrarLibros() {
        boolean hayLibros = false;

        for (Libro l : libreria) {
            if (l != null) {
                System.out.println(l);
                hayLibros = true;
            }
        }

        if (!hayLibros) {
            System.out.println("No hay libros en la biblioteca.");
        }
    }
}

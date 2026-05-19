package aula;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorAlumnos gestor = new GestorAlumnos();

        // Añadimos algunos alumnos de ejemplo
        gestor.agregarAlumno(1, new Alumno("Ana", "García", "12345678A", 20, "1º DAM"));
        gestor.agregarAlumno(2, new Alumno("Luis", "Pérez", "87654321B", 21, "2º DAM"));
        gestor.agregarAlumno(3, new Alumno("Marta", "López", "11223344C", 19, "1º ASIR"));

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar número de alumnos");
            System.out.println("2. Buscar alumno por expediente");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Buscar alumnos por gusto");
            System.out.println("5. Mostrar todos los alumnos");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Número de alumnos: " + gestor.contarAlumnos());
                    break;

                case 2:
                    System.out.print("Introduce número de expediente: ");
                    int exp = sc.nextInt();
                    Alumno a = gestor.buscarAlumno(exp);
                    if (a != null) {
                        System.out.println("Nombre: " + a.getNombre());
                        System.out.println("Apellidos: " + a.getApellidos());
                        System.out.println("DNI: " + a.getDni());
                    } else {
                        System.out.println("ERROR: No existe ese expediente.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce expediente a eliminar: ");
                    int expDel = sc.nextInt();
                    if (gestor.eliminarAlumno(expDel)) {
                        System.out.println("Alumno eliminado.");
                    } else {
                        System.out.println("No existe ese expediente.");
                    }
                    break;

                case 4:
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Introduce un gusto a buscar: ");
                    String gusto = sc.nextLine();
                    long count = gestor.contarPorGusto(gusto);
                    System.out.println("Alumnos con gusto '" + gusto + "': " + count);
                    break;

                case 5:
                    gestor.mostrarTodos();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

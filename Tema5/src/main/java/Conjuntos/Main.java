package Conjuntos;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Estudiante> alumnos = new TreeSet<>(new ComparadorPorEdad());

        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE NOTAS DAM1 ---");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar todos los alumnos con su media");
            System.out.println("3. Mostrar la media de un alumno");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Número de matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
                    String fechaTexto = sc.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaTexto);

                    Estudiante e = new Estudiante(matricula, nombre, fecha);

                    System.out.print("¿Cuántas notas quieres añadir? ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nota " + (i + 1) + ": ");
                        double nota = sc.nextDouble();
                        e.agregarNota(nota);
                    }
                    sc.nextLine(); // limpiar buffer

                    alumnos.add(e);
                    System.out.println("Alumno añadido correctamente.");
                    break;

                case 2:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        for (Estudiante est : alumnos) {
                            System.out.println(est + " → Media: " + est.calcularPromedio());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Introduce el número de matrícula: ");
                    String matBuscar = sc.nextLine();

                    Estudiante encontrado = null;
                    for (Estudiante est : alumnos) {
                        if (est.getNumMatricula().equals(matBuscar)) {
                            encontrado = est;
                            break;
                        }
                    }

                    if (encontrado != null) {
                        System.out.println("Media de " + encontrado.getNombre() + ": " + encontrado.calcularPromedio());
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}

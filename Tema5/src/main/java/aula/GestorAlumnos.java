package aula;

import java.util.*;

public class GestorAlumnos {

    private Map<Integer, Alumno> alumnos = new HashMap<>();

    private static final List<String> GUSTOS_POSIBLES = Arrays.asList(
            "cine", "cocina", "costura", "surf", "fútbol",
            "lectura", "videojuegos", "música", "senderismo"
    );

    public void agregarAlumno(int expediente, Alumno alumno) {
        asignarGustosAleatorios1(alumno);
        alumnos.put(expediente, alumno);
    }

    public int contarAlumnos() {
        return alumnos.size();
    }

    public Alumno buscarAlumno(int expediente) {
        return alumnos.get(expediente);
    }

    public boolean eliminarAlumno(int expediente) {
        return alumnos.remove(expediente) != null;
    }

    public long contarPorGusto(String gusto) {
        return alumnos.values().stream()
                .filter(a -> a.getGustos().contains(gusto.toLowerCase()))
                .count();
    }

    public void mostrarTodos1() {
        alumnos.forEach((exp, alum) ->
                System.out.println("Expediente " + exp + ": " + alum));
    }

    private void asignarGustosAleatorios1(Alumno alumno) {
        Random rand = new Random();
        int cantidad = rand.nextInt(3) + 1; // entre 1 y 3 gustos
        Collections.shuffle(GUSTOS_POSIBLES);
        alumno.setGustos(GUSTOS_POSIBLES.subList(0, cantidad));
    }

    public void mostrarTodos() {
        alumnos.forEach((exp, alum) ->
                System.out.println("Expediente " + exp + ": " + alum));
    }

    private void asignarGustosAleatorios(Alumno alumno) {
        Random rand = new Random();
        int cantidad = rand.nextInt(3) + 1; // entre 1 y 3 gustos
        Collections.shuffle(GUSTOS_POSIBLES);
        alumno.setGustos(GUSTOS_POSIBLES.subList(0, cantidad));
    }
}


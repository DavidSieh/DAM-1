package aula;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String curso;
    private List<String> gustos;

    public Alumno(String nombre, String apellidos, String dni, int edad, String curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getDni() { return dni; }
    public int getEdad() { return edad; }
    public String getCurso() { return curso; }
    public List<String> getGustos() { return gustos; }

    public void setGustos(List<String> gustos) {
        this.gustos = gustos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " - DNI: " + dni +
               " - Curso: " + curso + " - Gustos: " + gustos;
    }
}


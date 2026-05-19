package repaso;

import java.util.Objects;

public class Animal {
	
	
	//atributos
	
	private static int id; //miembros de la clase animal
	private int codigoAnimal;
	private String nombre;
	private String fechaNacimiento;
	
	//métodos
	//constructores
	public Animal(String nombre, String fechaNacimiento) {
		codigoAnimal=id++;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Animal(String fechaNacimiento) {
		codigoAnimal=id++;
		this.fechaNacimiento=fechaNacimiento;
		this.nombre="pendiente";
	}
	//set y get, acceder a las variables declaradas

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int codigoAnimal() {
		return  codigoAnimal;
	}
	
	
	//toString - mostrar datos.
	@Override
	public String toString() {
		return "(" + codigoAnimal + ")" + "-" + "Nombre:" + nombre + ", Nacio: " + fechaNacimiento;
	}

	
	//comparación de objetos.
	@Override
	public int hashCode() {
		return Objects.hash(codigoAnimal, fechaNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return codigoAnimal == other.codigoAnimal && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	//métodos especificos.
	//pone el nombre a los animales que no lo tienen pendiente
	
	public void ponerNombre(String nombrePremiado) {
		nombre=nombrePremiado;
	}
	public void ponerNombre() {
		nombre=asignarNombre();
	}
	private String asignarNombre() {
		StringBuilder sb = new StringBuilder();
		sb.append((char) (((int) (Math.random()*26) + 65)));
		for(int i = 0; i<7; i++)
		sb.append((char) (((int)(Math.random()*26) + 97)));
		sb.append("-");
		sb.append(String.valueOf(codigoAnimal));
		return sb.toString();
	}

}

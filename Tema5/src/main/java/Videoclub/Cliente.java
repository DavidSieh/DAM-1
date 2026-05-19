package Videoclub;

import java.util.Objects;

public class Cliente {
	private static int numerosCliente = 1;
	private int numeroCarnet;
	private String nombre;

	public Cliente(String nombre) {
		this.numeroCarnet = numerosCliente;
		numerosCliente++;
		this.nombre = nombre;
	}

	public int getNumeroCarnet() {
		return numeroCarnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [numeroCarnet=" + numeroCarnet + ", nombre=" + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, numeroCarnet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nombre, other.nombre) && numeroCarnet == other.numeroCarnet;
	}

}


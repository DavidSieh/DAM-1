package Videoclub;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
	
	private Pelicula pelicula;
	private Cliente cliente;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;

	public Prestamo(Pelicula pelicula, Cliente cliente) {
		this.pelicula = pelicula;
		this.cliente = cliente;
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion = LocalDate.now().plusDays(2);
	}

	public Prestamo(Pelicula pelicula, Cliente cliente, int diasDevolucion) {
		this.pelicula = pelicula;
		this.cliente = cliente;
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion = LocalDate.now().plusDays(diasDevolucion);
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Prestamo [pelicula=" + pelicula + ", cliente=" + cliente + ", fechaPrestamo=" + fechaPrestamo
				+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cliente, fechaDevolucion, fechaPrestamo, pelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(fechaDevolucion, other.fechaDevolucion)
				&& Objects.equals(fechaPrestamo, other.fechaPrestamo) && Objects.equals(pelicula, other.pelicula);
	}

}

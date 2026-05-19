package coleccion_musica;

import java.time.LocalDate;
import java.util.Objects;

public class CD {
	
	protected String titulo;
	protected LocalDate año = LocalDate.now();
	protected double precio;
	static final double defecto = 19.99;
	
	
	public CD(String titulo, LocalDate año, double precio) {
		
		this.titulo = titulo;
		this.año = LocalDate.now();
		this.precio = precio;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public LocalDate getAno() {
		return año;
	}


	public void setAno(LocalDate año) {
		this.año = año;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public int hashCode() {
		return Objects.hash(año, precio, titulo);
	}
	
	protected double calcularPrecioVenta(double defecto){
	    if (año == null)
	        return defecto;

	    return defecto; // CD no cambia su precio, solo los hijos
	}

		


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		return Objects.equals(año, other.año)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(titulo, other.titulo);
	}
		
	

}

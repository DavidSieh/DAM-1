package coleccion_musica;

import java.time.LocalDate;
import java.util.Objects;

public class Discos extends CD {

	
	private String compra;
	
	public Discos(String titulo, LocalDate año, double precio,String compra) {
		super(titulo, año, precio);
		
		this.compra=compra;
		
	}
	@Override
	protected double calcularPrecioVenta(double defecto) {
	    if (año == null) return defecto;

	    int añosPasados = LocalDate.now().getYear() - año.getYear();
	    double factor = 1 - (0.002 * añosPasados); // -0.2% por año

	    return defecto * factor;
	}


	public String getCompra() {
		return compra;
	}

	public void setCompra(String compra) {
		this.compra = compra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(compra);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discos other = (Discos) obj;
		return Objects.equals(compra, other.compra);
	}

	@Override
	public String toString() {
		return "Disco almacenado: " 
				+"\nNombre del Disco: " + titulo +
				"\nAño de adquisición: " + año + 
				"\nPrecio: " + precio + 
				"\nLugar de adquisición: " + compra;
	}

	

}

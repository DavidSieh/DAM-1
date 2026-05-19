package coleccion_musica;

import java.time.LocalDate;
import java.util.Objects;

public class DVDs extends CD{

	private int canciones;
	
	public DVDs(String titulo, LocalDate año, double precio, int canciones) {
		super(titulo, año, precio);
		
		this.canciones=canciones;
		
	}
	@Override
	protected double calcularPrecioVenta(double defecto) { 
		if (año == null) return defecto; 
		int añosPasados = LocalDate.now().getYear() - año.getYear(); 
		double factor = 1 + (0.005 * añosPasados); // +0.5% por año return defecto * factor; }
		return defecto*factor;
	}

	public int getCanciones() {
		return canciones;
	}

	public void setCanciones(int canciones) {
		this.canciones = canciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(canciones);
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
		DVDs other = (DVDs) obj;
		return canciones == other.canciones;
	}

	@Override
	public String toString() {
		return "DVD almacenado: " 
				+"\nNombre del DVD: " + titulo +
				"\nAño de adquisición: " + año + 
				"\nPrecio: " + precio + 
				"\nNumero de canciones: " + canciones;
	}
	
	
	

}

package FrayDiegoTadeo.Examen02;


public abstract class Animal {
		
	protected TarjetaId tarjeta1;
	private String nombre; //nombre del animal
	private double gasto;
	private String fechaAdopcion;
	
	// Constructor (primer dueño, 0 gastos, adoptamos hoy)
	public Animal(TarjetaId tarjeta, String nombre) {		
		this.tarjeta1 = tarjeta;
		this.nombre = nombre;
		this.gasto = 0;
		this.fechaAdopcion = "15/12/2023";
	}
	
	// Método abstracto que calcula el gasto mensual del animal
	public abstract double gastoAnimal();
	
	public TarjetaId getTarjeta1() {
		return this.tarjeta1;
	}
	
	/**
	 * @param tarjeta the tarjeta to set
	 */
	public void setTarjeta(TarjetaId tarjeta) {
		this.tarjeta1 = tarjeta;
	}

	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}	
	public double getGasto() {
		return this.gasto;
	}
	
	public void setFechaAdopcion(String fechaAdopcion) {
		this.fechaAdopcion = fechaAdopcion;
	}
	
	public String getFechaAdopcion() {
		return this.fechaAdopcion;
	}

	// Muestro toda la informacion del animal
	@Override
	public String toString() {
        // Creo un objeto StringBuilder
        StringBuilder str = new StringBuilder(); 
        str.append("\nNombre: " + nombre);
        str.append(", Gasto mensual: " + gasto);
        str.append(", Adoptado el: " + fechaAdopcion);
		str.append(tarjeta1.toString());
		return str.toString();
	}	

}

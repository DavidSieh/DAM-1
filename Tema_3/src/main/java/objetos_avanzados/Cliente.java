package objetos_avanzados;

public class Cliente {

	//atributos
	private String dni;
	private String nombre;
	private long telefono;

	//metodos
	//constructor
public Cliente(String dni,String nombre,long telefono) {
	
	this.dni=dni;
	this.nombre=nombre;
	this.telefono=telefono;



	//setters y getters
}
	public String getDni() {
	return dni;
}
	public void setDni(String dni) {
		this.dni=dni;
}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono=telefono;
	}
}


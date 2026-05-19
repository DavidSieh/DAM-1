package EjerciciosUT3;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}public String getnombre(){
		return nombre;
		
	}public void setnombre(String nombre) {
		this.nombre=nombre;
	
	}public int getedad(){
		return edad;
	}
	
	public void setedad(int edad){
		this.edad=edad;
	}
}

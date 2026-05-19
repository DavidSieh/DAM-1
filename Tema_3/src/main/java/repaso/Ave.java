package repaso;

public class Ave extends Animal {
	
	private boolean vuela;
	
	public Ave(String nombre, String fechaNacimiento, boolean vuela) {
		super(nombre, fechaNacimiento);
		this.vuela=vuela;
		
	}

	public boolean getVuela() {
		return vuela;
	}
	
	public void setVuela(boolean vuela) {
		this.vuela=vuela;
		
	}
	
	

}

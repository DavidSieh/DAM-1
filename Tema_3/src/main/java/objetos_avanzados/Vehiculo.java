package objetos_avanzados;

public class Vehiculo {
	
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double tarifa;
	private boolean disponible;
	
	public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
		this.matricula=matricula;
		this.marca=marca;
		this.color=color;
		this.tarifa=tarifa;
		this.disponible=disponible;
		
	}public String getMatricula() {
		return matricula;
	}public void setMatricula(String matricula) {
		this.matricula=matricula;
	}public String getMarca() {
		return marca;
	}public void setMarca(String marca) {
		this.marca=marca;
	}public String getModelo() {
		return modelo;
	}public void setModelo(String modelo) {
		this.modelo=modelo;
	}public String setColor() {
		return color;
	}public void getColor(String color) {
		this.color="Gris";
	}public double getTarifa() {
		return tarifa;
	}public void setTarifa(double tarifa) {
		this.tarifa=tarifa;
	}public boolean getDisponible() {
		return disponible;
	}public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}
	

}

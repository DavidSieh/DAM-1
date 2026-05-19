package Herencia4;


public class Comandas {
	
	private int mesa;
	private int comensales;
	private boolean diabeticos;
	
	
	public Comandas(int mesa, int comensales, boolean diabeticos) {
		super();
		this.mesa = mesa;
		this.comensales = comensales;
		this.diabeticos =Diabeticos();
	}



	public boolean isDiabeticos() {
		return diabeticos;
	}



	public void setDiabeticos(boolean diabeticos) {
		this.diabeticos = diabeticos;
	}



	public int getMesa() {
		return mesa;
	}



	public void setMesa(int mesa) {
		this.mesa = mesa;
	}



	public int getComensales() {
		return comensales;
	}



	public void setComensales(int comensales) {
		this.comensales = comensales;
	}
	
	public boolean Diabeticos() {
		if (diabeticos = true) {
			System.out.println("No hay diabeticos");
		}else {
			System.out.println("Hay diabeticos");
		}
		
		
		return diabeticos;
		
		
	}


	@Override
	public String toString() {
		return "------Comandas------" +
				"Mesa del cliente: " + mesa +
				"Numero de comensales: " + comensales +
				"¿Hay diabeticos?" +  Diabeticos();
	}



	
	
	
	
	
	
}

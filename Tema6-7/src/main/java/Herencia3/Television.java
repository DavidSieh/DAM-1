package Herencia3;

public class Television extends Electrodomestico {

	private double tamaño;
	private boolean TDT;
	
	public Television(double precio, String color, char consumoElectrico, double peso, double tamaño, boolean TDT) {
		super(precio, color, consumoElectrico, peso);
		this.tamaño = tamaño;
		this.TDT = TDT;
	}
	
	public Television(double tamaño, boolean TDT) {
		this.tamaño = tamaño;
		this.TDT = TDT;
	}
	
	public Television() {
		this.tamaño=20;
		this.TDT = true;
		
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isTDT() {
		return TDT;
	}

	public void setTDT(boolean tDT) {
		TDT = tDT;
	}

	@Override
	public double precioFinal() {
		if(tamaño >= 40 && TDT == true) {
			precio *= 0.3;
		}
			
		return super.precioFinal();
	}
	
	@Override
	public String toString() {
		return "---Television---" + 
	            "\nPrecio de la Television: " + precio + 
	            "\nColor de la Television: " +  color +
	            "\nConsumo de la Television: " + consumoElectrico +
	            "\nPeso de la Television: " + peso +
	            "\nTamaño de la Television: " + tamaño +
	            "\n¿Tiene TDT?" + TDT;
	}
	
	
	
}

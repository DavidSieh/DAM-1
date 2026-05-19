package Herencia3;

public class Lavadora extends Electrodomestico {

	
	private int carga;
	
	
	public Lavadora(double precio, String color, char consumoElectrico, double peso,int carga) {
		super(precio, color, consumoElectrico, peso);
		this.carga=carga;
	}
	
	public Lavadora(double precio,double peso) {
		super(precio,peso);
	}
	
	public Lavadora(int carga) {
		this.carga=5;
	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	@Override
	public double precioFinal() {
		if (carga >30) {
			return precio +=50;
		}else
		return super.precioFinal();
	}

	@Override
	public String toString() {
		return "---Lavadora---" + 
	            "\nPrecio de la Lavadora: " + precio + 
	            "\nColor de la Lavadora: " +  color +
	            "\nConsumo de la lavadora: " + consumoElectrico +
	            "\nPeso de la lavadora: " + peso +
	            "\nCarga de la lavadora: " + carga;
	}
	
	

	
	
}


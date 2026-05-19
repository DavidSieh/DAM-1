package objetos_avanzados;

public class Coche extends Vehiculo{
	
	private int nPuertas;
	
	public Coche(String matricula,String marca,String modelo,String color,double tarifa, boolean disponible, int nPuertas) {
		super(matricula,marca,modelo,color, tarifa, disponible);
		this.nPuertas= 5;
		
	}public int getPuertas() {
		return nPuertas;
	}public void setPuertas() {
		this.nPuertas = 5;
	}

}

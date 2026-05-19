package EjerciciosUT3;

public class Circulo {

	//atributos 
	private double r;
	
	public Circulo(double radio) {
		this.r=radio;
	}public double getR() {
		return r;
	}public void setR(double radio) {
		this.r=radio;
	}
	
	//metodo calculo del area
	public double calculoArea() {
		return Math.PI*Math.pow(this.r, 2);
		
		
	}public double calculoPerimetro() {
		return 2 *Math.PI * this.r;
	}
	
	public String toString() {
		return "radio del Circulo" + r;
		
	}public String toString1() {
		return "Perimetro del Circulo" + calculoPerimetro();
	}
	
}

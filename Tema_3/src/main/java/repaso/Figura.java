package repaso;

public abstract class Figura {
	
	protected int base;
	protected int altura;
	
	public Figura(int base, int altura) {
		
		this.base=base;
		this.altura=altura;
		
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public abstract double calculodeArea();
	public abstract double calculodePerimetro();
	public abstract void dibujarFigura();

}

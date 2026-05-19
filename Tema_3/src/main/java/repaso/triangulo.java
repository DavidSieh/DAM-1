package repaso;

public class triangulo extends Figura{

	private char simbolo;
	
	//constructor
	
	public triangulo(int base, int altura,char simbolo) {
		super(base, altura);

		this.simbolo=simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}


	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}


	@Override
	public double calculodeArea() {
		return (base*altura)/2.0;
	}

	@Override
	public double calculodePerimetro() {
		
		return 0;
	}

	@Override
	public void dibujarFigura() {
		// TODO Auto-generated method stub
		
	}

}

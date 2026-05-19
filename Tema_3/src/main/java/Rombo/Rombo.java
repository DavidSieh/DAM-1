package Rombo;

public class Rombo {


	private int diagonalMayor;
    private int diagonalMenor;

    public Rombo(int diagonalMayor, int diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    // Método para mostrar dimensiones
    public void mostrarDimensiones() {
        System.out.println("Diagonal mayor: " + diagonalMayor);
        System.out.println("Diagonal menor: " + diagonalMenor);
    }

    // Método para calcular orientación
    public String orientacion() {
        if (diagonalMenor > diagonalMayor) {
            return "Horizontal";
        } else if (diagonalMayor > diagonalMenor) {
            return "Vertical";
        } else {
            return "Cuadrado (ambas diagonales iguales)";
        }
    }

    public double area() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    public double perimetro() {
        double L = Math.sqrt(Math.pow(diagonalMayor / 2.0, 2) +
                             Math.pow(diagonalMenor / 2.0, 2));
        return 4 * L;
    }

    public void dibujar() {
    	
    	    int altura = diagonalMayor;

    	    // Asegúrate de que la altura sea impar
    	    if (altura % 2 == 0) {
    	        altura++;
    	    }

    	    // Parte superior
    	    for (int i = 1; i <= altura; i += 2) {
    	        // Espacios
    	        for (int j = 0; j < (altura - i) / 2; j++) {
    	            System.out.print(" ");
    	        }
    	        // Símbolos
    	        for (int k = 0; k < i; k++) {
    	            System.out.print("+");
    	        }
    	        System.out.println();
    	    }

    	    // Parte inferior
    	    for (int i = altura - 2; i >= 1; i -= 2) {
    	        // Espacios
    	        for (int j = 0; j < (altura - i) / 2; j++) {
    	            System.out.print(" ");
    	        }
    	        // Símbolos
    	        for (int k = 0; k < i; k++) {
    	            System.out.print("+");
    	        }
    	        System.out.println();
    	    }
    	
    }
}



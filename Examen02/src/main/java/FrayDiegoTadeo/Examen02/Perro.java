package FrayDiegoTadeo.Examen02;


public class Perro extends Animal {

	// Atributos
		private final double PRECIOSACO = 12;
		private double velocidad;
		private boolean rastea;
		
		// Constructor
		public Perro(TarjetaId tarjeta, String nombre, boolean rastrea) {
			super(tarjeta, nombre);
			this.rastea = rastrea;
			this.velocidad = setVelocidad();
		}	
		
		/**
		 * @return the rastea
		 */
		public boolean isRastea() {
			return rastea;
		}

		/**
		 * @return the velocidad
		 */
		public double getVelocidad() {
			return velocidad;
		}

		/**
		 * @param rastea the rastea to set
		 */
		public void setRastea(boolean rastea) {
			this.rastea = rastea;
		}

		// Otros métodos
		@Override
		public double gastoAnimal() {
			return PRECIOSACO * (isRastea() ? 3 : 2);
		}
		

		// NO USE
		/**
		 * Resolver la velocidad del perro, que se resuelve con la siguiente serie:
		 * sumatorio S = 1/3 + 3/6 + 6/9 + 10/12 + ... 
		 */
		private double setVelocidad() {
	       // Declaro las variables
	        double sumatorio = 0;
	        final int UNO = 1;
	        int denominador = 0;

	        // Genero la serie
	        System.out.println("La serie es: ");
	        for (int i = 1; i <= (super.tarjeta1).getEdad(); i++) {
	            denominador += i;
	            sumatorio += (double) UNO / denominador;
	            System.out.print(UNO + "/" + denominador + (i != 10 ? " + " : ""));    // Si no es el último número, pongo una suma.
	        }

	        // Muestro el resultado
	        System.out.println("\nLa velocidad del perro es: " + sumatorio);
			return sumatorio * 35;
		}

		@Override
		public String toString() {
			return super.toString() + "Velocidad: " + getVelocidad();
		}
}

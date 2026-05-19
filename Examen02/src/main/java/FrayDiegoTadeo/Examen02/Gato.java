package FrayDiegoTadeo.Examen02;

public class Gato extends Animal {
	
	// Atributos
		private final double PRECIOSACO = 19.99;
		private int nCamadas; // solo 0, 1, 2 ó 3
		
		// Constructor
		public Gato(TarjetaId tarjeta1, String nombre, int nCamadas) {
			super(tarjeta1, nombre);
			this.nCamadas = comprobarNCamadas(nCamadas);
		}
		
		// Getters y Setters
		/**
		 * @return the nCamadas
		 */
		public int getnCamadas() {
			return nCamadas;
		}

		/**
		 * @param nCamadas the nCamadas to set
		 */
		public void setnCamadas(int nCamadas) {
			this.nCamadas = comprobarNCamadas(nCamadas);
		}
		
		// Otros métodos
		private int comprobarNCamadas(int nCamadas) {
			return (nCamadas >= 0 && nCamadas <= 3 ? nCamadas: 0);
		}

		@Override
		public double gastoAnimal() {
			return PRECIOSACO;
		}

		@Override
		public String toString() {
			return super.toString() + "N. Camadas: " + nCamadas;
		}

	}

package FrayDiegoTadeo.Examen02;

public class Tortuga extends Animal {

	// Atributos
		private final double COSTEDIARIO = 0.35;
		private final int DIAS = 30;
		private double peso;

		// Constructor
		public Tortuga(TarjetaId tarjeta, String nombre, double peso) {
			super(tarjeta, nombre);
			this.peso = peso;
		}

		// Setters y Getters
		/**
		 * @return the peso
		 */
		public double getPeso() {
			return peso;
		}

		/**
		 * @param peso the peso to set
		 */
		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		
		// Otros Métodos
		// Método para obtener la edad del animal
//		private int getEdad() {
//			return (super.tarjeta3 == null ? (super.tarjeta2 == null ? super.tarjeta2 : super.tarjeta1) : super.tarjeta3).getEdad();
//		}	

		// Resolver el gasto de la tortuga: peso / edad (es lo que come cada día) x 0.35€ el coste de su comida al día x 30 días
		// ... 
		@Override
		public double gastoAnimal() {
			return (getPeso() / (super.tarjeta1).getEdad()) * COSTEDIARIO * DIAS;
		}
		
		@Override
		public String toString() {
			return super.toString() +  "Peso: " + getPeso();
		}	
			 
		
	}

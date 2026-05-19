package FrayDiegoTadeo.Examen02;

public class GestorAnimales {
	
	final int TAM = 3; // número máximo de animales de cada tipo
	private Gato[] gatos;
	private Perro[] perros;
	private Tortuga[] tortugas;
	
	// Constructor por defecto
	public GestorAnimales() {
		this.gatos = new Gato[TAM];
		this.perros = new Perro[TAM];
		this.tortugas = new Tortuga[TAM];
	}
	
	// Setters y Getters
	public boolean setGatos(Gato gato) {
		boolean adoptado = false;
		for(int i = 0; i < gatos.length && !adoptado; i++)
			if(gatos[i] == null) {
				gatos[i] = gato;
				adoptado = true;
			}
		return adoptado;
	}
	public Gato[] getGatos() {
		return this.gatos;
	}
	
	public boolean setPerros(Perro perro) {
		boolean adoptado = false;
		for(int i = 0; i < perros.length && !adoptado; i++)
			if(perros[i] == null) {
				perros[i] = perro;
				adoptado = true;
			}
		return adoptado;
	}	
	public Perro[] getPerros() {
		return this.perros;
	}
	
	public boolean setTortugas(Tortuga tortuga) {
		boolean adoptado = false;
		for(int i = 0; i < tortugas.length && !adoptado; i++)
			if(tortugas[i] == null) {
				tortugas[i] = tortuga;
				adoptado = true;
			}
		return adoptado;
	}	
	public Tortuga[] getTortugas() {
		return this.tortugas;
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		// Vamos a informar sobre los animales adoptados
		info.append("Lucía tiene adoptados a: ");
		for(int i = 0; i < gatos.length; i++) {
			if(gatos[i] != null) {
				info.append("\nGato " + (i + 1) + ": "+ gatos[i].toString());
			}
		}
		for(int i = 0; i < perros.length; i++) {
			if(perros[i] != null) {
				info.append("\nPerro " + (i + 1) + ": " + perros[i].toString());
			}
		}
		for(int i = 0; i < tortugas.length; i++) {
			if(tortugas[i] != null) {
				info.append("\nTortuga" + (i + 1) + tortugas[i].toString());
			}
		}
		return info.toString();
	}
	
	public String mostrarAnimales() {
		StringBuilder info = new StringBuilder();
		// Vamos a informar sobre los animales adoptados
		info.append("Lucía tiene adoptados a: ");
		for(int i = 0; i < gatos.length; i++) {
			if(gatos[i] != null) {
				info.append("\nGato " + (i + 1) + ": "+ gatos[i].getNombre());
			}
		}
		for(int i = 0; i < perros.length; i++) {
			if(perros[i] != null) {
				info.append("\nPerro " + (i + 1) + ": " + perros[i].getNombre());
			}
		}
		for(int i = 0; i < tortugas.length; i++) {
			if(tortugas[i] != null) {
				info.append("\nTortuga " + (i + 1) + ": " + tortugas[i].getNombre());
			}
		}
		return info.toString();
	}

	// método que averigua el gasto mensual de animales que tiene Lucía
	public int gastoMensual() {
		int total = 0;
		for(int i = 0; i < gatos.length; i++) {
			if(gatos[i] != null) {
				total += gatos[i].getGasto();
			}
		}
		for(int i = 0; i < perros.length; i++) {
			if(perros[i] != null) {
				total += perros[i].getGasto();
			}
		}
		for(int i = 0; i < tortugas.length; i++) {
			if(tortugas[i] != null) {
				total += tortugas[i].getGasto();
			}
		}
		return total;
	}

	// método que averigua el número de animales que tiene Lucía
	public int contarAnimales() {
		int cuantos = 0;
		for(int i = 0; i < gatos.length; i++) {
			if(gatos[i] != null) {
				cuantos++;
			}
		}
		for(int i = 0; i < perros.length; i++) {
			if(perros[i] != null) {
				cuantos++;
			}
		}
		for(int i = 0; i < tortugas.length; i++) {
			if(tortugas[i] != null) {
				cuantos++;
			}
		}
		return cuantos;
	}
	}

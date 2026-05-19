package Biblio;

public class Libro {
	
	final int TAM = 15;
	private String ISBN;
	private String titulo;
	private String autor;
	private int añoPubli;
	
	public int getTAM() {
		return TAM;
	}

	public Libro(String iSBN, String titulo, String autor, int añoPubli) {
		
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.añoPubli = añoPubli;
	
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoPubli() {
		return añoPubli;
	}

	public void setAñoPubli(int añoPubli) {
		this.añoPubli = añoPubli;
	}
	
	@Override
	public String toString() {
		return "\nISBN: " + ISBN + 
				"\nTitulo: " + titulo +
				"\nAutor: " + autor +
			    "\nAño de publicación" + añoPubli;
					
	}

}

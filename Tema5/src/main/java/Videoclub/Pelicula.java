package Videoclub;

import java.util.Objects;

public class Pelicula {
	
		private int codigo;
		private String titulo;

		public Pelicula(int codigo, String titulo) {
			this.codigo = codigo;
			this.titulo = titulo;
		}

		public int getCodigo() {
			return codigo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		@Override
		public String toString() {
			return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + "]";
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(codigo, titulo);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pelicula other = (Pelicula) obj;
			return codigo == other.codigo && Objects.equals(titulo, other.titulo);
		}

	}


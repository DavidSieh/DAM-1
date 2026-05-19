package Videoclub;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;

public class GestorVideoclub {
	
	private ArrayList<Pelicula> listaPeliculas;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Prestamo> listaPrestamos;

	// Constructor
	
	public GestorVideoclub() {
		this.listaClientes = new ArrayList<>();
		this.listaPeliculas = new ArrayList<>();
		this.listaPrestamos = new ArrayList<>();
	}

	// Getters y Setters
	
	// obtiene la lista de Películas
	public ArrayList<Pelicula> getPeliculas() {
		return listaPeliculas;
	}
	
	// añade una película, siempre que no exista ya
	public boolean aniadirPelicula(Pelicula p) {
		boolean result = false;
		if (!this.listaPeliculas.contains(p)) {
			this.listaPeliculas.add(p);
			result = true;
		}
		return result;
	}

	// añade un cliente película, siempre que no exista ya
	public boolean aniadirCliente(Cliente c) {
		boolean result = false;
		if (!this.listaClientes.contains(c)) {
			this.listaClientes.add(c);
			result = true;
		}
		return result;
	}

	// obtiene la lista de Prestamos completa
	public ArrayList<Prestamo> getPrestamos() {
		return listaPrestamos;
	}

	// añade un préstamo, siempre que no exista ya
	public boolean aniadirPrestamo(Prestamo p) {
		boolean result = false;
		if (!this.listaPrestamos.contains(p)) {
			this.listaPrestamos.add(p);
			result = true;
		}
		return result;
	}

	// Resto de métodos
	
	/**
	 * Busca la pelicula correspondiente al código introducido en el parámetro
	 * 
	 * @param codPelicula
	 * @return la pelicula correspondiente o null si no la encuentra
	 */
	public Pelicula buscarPelicula(int codPelicula) {
		boolean encontrada = false;
		Pelicula p = null;
		for (int i = 0; i < listaPeliculas.size() && !encontrada; i++) {
			if (listaPeliculas.get(i).getCodigo() == codPelicula) {
				p = listaPeliculas.get(i);
				encontrada = true;
			}
		}
		return p;
	}

	/**
	 * Busca el cliente correspondiente al número de carnet introducido.
	 * 
	 * @param numCarnet carnet del cliente buscado
	 * @return el cliente correspondiente o null si no le encuentra
	 */
	public Cliente buscarCliente(int numCarnet) {
		boolean encontrado = false;
		Cliente c = null;
		for (int i = 0; i < listaClientes.size() && encontrado == false; i++) {
			if (listaClientes.get(i).getNumeroCarnet() == numCarnet) {
				c = listaClientes.get(i);
				encontrado = true;
			}
		}
		return c;
	}

	// Antes (en los Getters) hicimos: obtiene la lista de Prestamos completa
	// public ArrayList<Prestamo> getPrestamos() {
	/**
	 * Devuelve el listado de prestamos que tiene el cliente con numCarnet
	 * 
	 * @param numCarnet carnet del cliente del que deseamos el listado
	 * @return listado de prestamos
	 */
	public ArrayList<Prestamo> getPrestamos(int numCarnet) {
		ArrayList<Prestamo> prestamosCliente = new ArrayList<>();
		for (Prestamo p: listaPrestamos) { // for-each
			if(p.getCliente().getNumeroCarnet() == numCarnet) {
				prestamosCliente.add(p);
			}
		}
		return prestamosCliente;
	}

	/**
	 * Permite realizar devoluciones de una pelicula para un cliente concretos (la elimina de la lista)
	 * 
	 * @param codPelicula código de la película que deseo devolver
	 * @param numCarnet carnet del cliente que desea realizar la devolución
	 * @return true si la devolución se ha realizado correctamente
	 */
	public boolean devolucion(int codPelicula, int numCarnet) {
		Iterator<Prestamo> it = listaPrestamos.iterator();
		Prestamo p;
		boolean encontrado = false;
		while(it.hasNext() && !encontrado) {
			p = it.next();
			if(p.getCliente().getNumeroCarnet() == numCarnet && p.getPelicula().getCodigo() == codPelicula) {
				listaPrestamos.remove(p);
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	
	/**
	 * Método que permite obtener todos los prestamos que se han pasado de la fecha
	 * 
	 * @return listado de prestamos morosos
	 */
	public ArrayList<Prestamo> getPrestamosMorosos() {
		ArrayList<Prestamo> prestamosMorosos = new ArrayList<>();
		LocalDate fechaActual = LocalDate.now();
		for (int i = 0; i < listaPrestamos.size(); i++) {
			if(fechaActual.isAfter(listaPrestamos.get(i).getFechaDevolucion())) {
				prestamosMorosos.add(listaPrestamos.get(i));
			}
		}
		return prestamosMorosos;
	}
	
	// Otros métodos que empleo para diversas tareas; no se han solicitado en la clase VideoClub del ejercicio

	/**
	 * Método que permite comprobar si la película está prestada 
	 * 
	 * @param codPelicula código de la película que deseo comprobar
	 * @return true si la película está prestada
	 */
	public boolean isPrestada(int codPelicula) {
		for (Prestamo prestamo : listaPrestamos) {
			if(prestamo.getPelicula().getCodigo() == codPelicula) {				
				return true;	// VER COMENTARIOS inferiores
			}
		}
		return false;
	}
	
	/**
	 * Método que permite comprobar si la película está prestada
	 * 
	 * @param pelicula película que deseo comprobar
	 * @return true si la película está prestada
	 */
	public boolean isPrestada(Pelicula pelicula) {
		for (Prestamo prestamo : listaPrestamos) {
			if(prestamo.getPelicula().equals(pelicula)) {				
				return true;	// VER COMENTARIOS inferiores
			}
		}
		return false;
	}
	
	/**
	 * Método para mostrar todos los préstamos
	 */
	public void mostrarPrestamos() {
		if(!listaPrestamos.isEmpty()) {
			System.out.println("CLIENTE\tPELICULA\tFECHA_PRE\tFECHA_DEV");
			for (Prestamo pres : listaPrestamos) {
				System.out.print(pres.getCliente().getNombre());
				System.out.print("\t" + pres.getPelicula().getTitulo());
				System.out.print("\t" + pres.getFechaPrestamo());
				System.out.print("\t" + pres.getFechaDevolucion());
				System.out.println();
			}
		} else {
			System.out.println("No hay prestamos");
		}
	}
	
	/**
	 * Método para mostrar solo los préstamos de morosos
	 */
	public void mostrarPrestamosMosoros() {
		ArrayList<Prestamo> morosos = this.getPrestamosMorosos();
		if(!morosos.isEmpty()) {
			System.out.println("CLIENTE\tPELICULA\tFECHA_PRE\tFECHA_DEV");
			for (Prestamo pres : morosos) {
				System.out.print(pres.getCliente().getNombre());
				System.out.print("\t" + pres.getPelicula().getTitulo());
				System.out.print("\t" + pres.getFechaPrestamo());
				System.out.print("\t" + pres.getFechaDevolucion());
				System.out.println();
			}
		} else {
			System.out.println("No hay morosos");
		}
	}
	
	/**
	 * Método para mostrar todo el catálogo de películas
	 */
	public void mostrarPeliculas() {
		if(!listaPeliculas.isEmpty()) {
			System.out.println("CODIGO\tPELICULA");
			for (Pelicula peli : listaPeliculas) {
				System.out.print(peli.getCodigo());
				System.out.print("\t" + peli.getTitulo());
				System.out.println();
			}
		} else {
			System.out.println("No películas en el catálogo");
		}
	}

}


/*
 * 
 * 
// Commparativa  -  Código limpio

// Sin un único punto de salida <-- Solución válida para bloques de código tan cortos (La que usaría EN ESTE CASO)
public boolean isPrestada(int codPelicula) {
	for (Prestamo prestamo : listaPrestamos) {
		if(prestamo.getPelicula().getCodigo() == codPelicula) {				
			return true;	
		}
	}
	return false;
}

// Único punto de salida y Repeticiones innecesarias  (Solución que NUNCA usaría)
public boolean isPrestada2(int codPelicula) {
	boolean prestada = false;
	for (Prestamo prestamo : listaPrestamos) {
		if(prestamo.getPelicula().getCodigo() == codPelicula) {				
			prestada = true;	
		}
	}
	return prestada;
}

// Único punto de salida - sin repeticiones  <-- Mejor solución, pero...
public boolean isPrestada3(int codPelicula) {
	boolean prestada = false;
	for (Prestamo prestamo : listaPrestamos) {
		if(prestamo.getPelicula().getCodigo() == codPelicula) {				
			prestada = true;	
			break;
		}
	}
	return prestada;
}	

*/

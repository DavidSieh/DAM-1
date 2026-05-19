package TeoriaExcepciones.copy;

public class MiExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiExcepcion() {
		super();
	}
	
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
	
	public MiExcepcion(Throwable causa) {
		super(causa);
	}

	public MiExcepcion(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}

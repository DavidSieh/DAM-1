package TeoriaExcepciones.copy;

public class TeoriaExcepcionesPropias {

    public static void main(String[] args) {

        UsuarioService service = new UsuarioService();

        try {
            // Cuatro modos (1, 2, 3, 4) que permiten probar cada constructor
//            int edad = service.procesarEdad("-15", 1); // Constructor vacío
//            int edad = service.procesarEdad("-15", 2); // Constructor "mensaje"
            int edad = service.procesarEdad("-15", 3); // Constructor "causa"
//            int edad = service.procesarEdad("15a", 4); // Constructor "mensaje + causa"
            System.out.println("Edad: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Mensaje: " + e.getMessage());

            System.out.println("\n--- Causa original ---");
            if (e.getCause() != null) {
                e.getCause().printStackTrace();
            } else {
                System.out.println("No hay causa");
            }
        }
    }

}

class UsuarioService {

    public int procesarEdad(String edadTexto, int modo) throws EdadInvalidaException {
        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad < 0 || edad > 120) {
                switch (modo) {
                    case 1:
                        throw new EdadInvalidaException(); // vacío
                    case 2:
                        throw new EdadInvalidaException("Edad fuera de rango: " + edad); // mensaje
                    case 3:
                        throw new EdadInvalidaException(new Exception("Edad incorrecta")); // causa
                    case 4:
                        throw new EdadInvalidaException("Edad fuera de rango: " + edad, new Exception("Causa manual")); // mensaje + causa
                }
            }
            return edad;
        } catch (NumberFormatException e) {
            switch (modo) {
                case 1:
                    throw new EdadInvalidaException();
                case 2:
                    throw new EdadInvalidaException("Error al convertir: " + edadTexto);
                case 3:
                    throw new EdadInvalidaException(e);
                case 4:
                    throw new EdadInvalidaException("Error al convertir: " + edadTexto, e);
            }
            return -1; // nunca llega aquí
        }
    }
    
}

/**
 * Excepción personalizada
 * @author Lourdes
 */
class EdadInvalidaException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4596660408970105036L;

	// 1. Constructor vacío
    public EdadInvalidaException() {
        super();
    }

    // 2. Constructor con mensaje
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }

    // 3. Constructor con causa
    public EdadInvalidaException(Throwable causa) {
        super(causa);
    }

    // 4. Constructor con mensaje y causa
    public EdadInvalidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
    
}
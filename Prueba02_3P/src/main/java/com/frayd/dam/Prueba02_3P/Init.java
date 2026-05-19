package com.frayd.dam.Prueba02_3P;

public class Init extends GestorSuper {
   
	
	
	public static void main(String[] args) throws CodigoInvalido {
      
	
		menu();
		
		
    }
	class UsuarioService {

	    public int procesarEdad(String CodigoTexto, int modo) throws CodigoInvalido {
	        try {
	            int Codigo = Integer.parseInt(CodigoTexto);
	            if (Codigo >999999999) {
	                switch (modo) {
	                    case 1:
	                        throw new CodigoInvalido(); // vacío
	                    case 4:
	                        throw new CodigoInvalido("Edad fuera de rango: " + Codigo, new Exception("Causa manual")); // mensaje + causa
	                }
	            }
	            return Codigo;
	        } catch (NumberFormatException e) {
	            switch (modo) {
	                case 1:
	                    throw new CodigoInvalido();
	                case 2:
	                    throw new CodigoInvalido("Error al convertir: " + CodigoTexto, e);
	            }
	            return -1; 
	        }
	    }
	    
	}
    
	class CodigoInvalido extends Exception {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 4596660408970105036L;

		// 1. Constructor vacío
	    public CodigoInvalido() {
	        super();
	    }

	    // 4. Constructor con mensaje y causa
	    public CodigoInvalido(String Codigo, Throwable causa) {
	        super(Codigo, causa);
	    }
	    
	}
	
	
}

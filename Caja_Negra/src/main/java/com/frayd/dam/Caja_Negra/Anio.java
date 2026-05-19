package com.frayd.dam.Caja_Negra;

public class Anio {

//	public static boolean esBisiesto(int anio) {
//	    if (anio % 4 == 0) {
//	        if (anio % 100 != 0 || anio % 400 == 0) {
//	            return true;
//	        }
//	    }
//	    return false;
//	}

	public static String esBisiesto(int anio) {
		String resultado = "Año no bisiesto";
		if(anio < 0) {
			resultado = "Año no valido";
		} else {
		    if (anio % 4 == 0) {
		        if (anio % 100 != 0 || anio % 400 == 0) {
		            resultado = "Año bisiesto";
		        }
		    }
		}
	    return resultado;
	}
	
}
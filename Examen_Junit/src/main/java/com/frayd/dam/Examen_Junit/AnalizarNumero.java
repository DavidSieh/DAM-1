package com.frayd.dam.Examen_Junit;


public class AnalizarNumero {
  
	
	public static void main(String[]args) {
		
		 int []numerosPositivos = {-1,2,3,2,5,6,7,8,9,10};
		 int []numerosEquilibrio = {1,-2};
		 int []numerosNegativos = {-1,-2,-3,-2,-5,-6,-7,-8,-9,-10};
		    
		   
	
		 
		System.out.println(analizarNumeros(numerosPositivos));
		System.out.println(analizarNumeros(numerosEquilibrio));
		System.out.println(analizarNumeros(numerosNegativos));
		 
	}
   
    
    public static String analizarNumeros(int[] numeros) {
    	
    	if (numeros == null || numeros.length==0) {
    		return "Lista invalida";
    	}
    	
    	int i=0;
    	int positivos = 0;
    	int negativos = 0;
    	boolean encontradoCero=false;
    	
    	while(i < numeros.length && !encontradoCero) {
    		if(numeros[i] == 0) {
    			encontradoCero = true;
    		}else if (numeros[i] > 0) {
    			positivos++;
    		}else {
    			negativos++;
    		}
    		i++;
    	}
    	if (positivos > negativos) {
    		return "Predominan positivos";
    	}if (negativos > positivos) {
    		return "Predominan negativos";
    	}else {
    		return "Equilibrio";
    	}
    }
    
}

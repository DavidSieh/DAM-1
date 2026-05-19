package com.frayd.dam.Examen_Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class AnalizarNumeroTest {
	
	 int []numerosPositivos = {1,2,3,2,5,6,7,8,9,10};
	 int []numerosPositivos2 = {1,2,-3,-2,-5,-6,7,8,9,10};
	 int []numerosPositivos3 = {-1,-2,3,2,5,6,7,8,9,10};
	 int []numerosPositivos4 = {1,-2,3,2,-5,-6,7,8,9,10};
	 int []numerosEquilibrio = {1,-2};
	 int []numerosEquilibrio2 = {1,-2,3,-4};
	 int []numerosEquilibrio3 = {1,-2,3,4,-5,-6};
	 int []numerosNegativos = {-1,-2,-3,-2,-5,-6,-7,-8,-9,-10};
	 int []numerosNegativos2 = {-1,-2,-3,-2,-5,6,7,8,-9,-10};
	 int []numerosNegativos3= {-1,2,-2,-5,6,-7,-8,9,-10};
	 int []numerosNegativos4 = {-1,-2,-3,-2,-5,-6,-7,-8,-9,-10};
	 int []Vacio;

	 
	 //Test de la lista vacia
	 
	  @Test
	  void ListaVacia() {
	      assertEquals("Lista invalida", AnalizarNumero.analizarNumeros(Vacio));
	  }
	  
	  //test de la predominancia positiva

	  @Test
	  void predominanPositivos() {
		  assertEquals("Predominan positivos",AnalizarNumero.analizarNumeros(numerosPositivos));
		  assertEquals("Predominan positivos",AnalizarNumero.analizarNumeros(numerosPositivos2));
		  assertEquals("Predominan positivos",AnalizarNumero.analizarNumeros(numerosPositivos3));
		  assertEquals("Predominan positivos",AnalizarNumero.analizarNumeros(numerosPositivos4));
	  }

	  //test de la predominancia negativa
	  @Test
	  void predominanNegativos() {
		  assertEquals("Predominan negativos",AnalizarNumero.analizarNumeros(numerosNegativos));
		  assertEquals("Predominan negativos",AnalizarNumero.analizarNumeros(numerosNegativos2));
		  assertEquals("Predominan negativos",AnalizarNumero.analizarNumeros(numerosNegativos3));
		  assertEquals("Predominan negativos",AnalizarNumero.analizarNumeros(numerosNegativos4));
	  }

	  
	  //Test del Equilibrio
	  @Test
	  void equilibrioNumeros() {
		  assertEquals("Equilibrio",AnalizarNumero.analizarNumeros(numerosEquilibrio));
		  assertEquals("Equilibrio",AnalizarNumero.analizarNumeros(numerosEquilibrio2));
		  assertEquals("Equilibrio",AnalizarNumero.analizarNumeros(numerosEquilibrio3));
	  }
	  
	
}

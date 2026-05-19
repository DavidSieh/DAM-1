package com.frayd.dam.Caja_Negra;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnioTest {

//      @Test
//    void anioNoDivisiblePor4NoEsBisiesto() {
//        assertFalse(Anio.esBisiesto(2023));
//    }
//
//    @Test
//    void anioDivisiblePor4PeroNoPor100EsBisiesto() {
//        assertTrue(Anio.esBisiesto(2024));
//    }
//
//    @Test
//    void anioDivisiblePor100PeroNoPor400NoEsBisiesto() {
//        assertFalse(Anio.esBisiesto(1900));
//    }
//
//    @Test
//    void anioDivisiblePor400EsBisiesto() {
//        assertTrue(Anio.esBisiesto(2000));
//    }
//    
//    // Añadir valores límite
//    @Test
//    void anioCeroEsBisiesto() {
//        assertTrue(Anio.esBisiesto(0));  // 0 es divisible por 400
//    }
// 
//    @Test
//    void anioNegativoDivisiblePor4() {
//        assertTrue(Anio.esBisiesto(-4));
//    }

  @Test
  void anioNoDivisiblePor4NoEsBisiesto() {
      assertEquals("Año no bisiesto", Anio.esBisiesto(2023));
  }

  @Test
  void anioDivisiblePor4PeroNoPor100EsBisiesto() {
	  assertEquals("Año bisiesto", Anio.esBisiesto(2024));
  }

  @Test
  void anioDivisiblePor100PeroNoPor400NoEsBisiesto() {
	  assertEquals("Año no bisiesto", Anio.esBisiesto(1900));
  }

  @Test
  void anioDivisiblePor400EsBisiesto() {
	  assertEquals("Año bisiesto", Anio.esBisiesto(2000));
  }
  
  // Añadir valores límite
  @Test
  void anioCeroEsBisiesto() {
	  assertEquals("Año bisiesto", Anio.esBisiesto(0));  // 0 es divisible por 400
  }

  @Test
  void anioNegativoDivisiblePor4() {
	  assertEquals("Año no valido", Anio.esBisiesto(-4));	
  }

}



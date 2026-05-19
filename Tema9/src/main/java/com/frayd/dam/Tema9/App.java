package com.frayd.dam.Tema9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Programación - UT 9 (Bases de datos)
 * 
 *  CONCEPTOS CLAVE que se trabajan en esta clase:
 *  -----------------------------------------------
 *  1. DriverManager      - Gestiona los drivers JDBC disponibles y abre conexiones
 *  2. Connection         - Representa una sesión activa con la base de datos
 *  3. PreparedStatement  - Sentencia SQL precompilada (más segura y eficiente)
 *  4. Statement          - Sentencia SQL simple (sin parámetros)
 *  5. ResultSet          - Tabla de resultados devuelta por una consulta SELECT
 *  6. Transacciones      - Agrupar varias operaciones en una unidad atómica
 *  7. try-with-resources - Cierre automático y seguro de recursos (Java 7+)
 *
 *  DEPENDENCIA Maven necesaria en pom.xml:
 *  ----------------------------------------
 *  <dependency>
 *      <groupId>org.mariadb.jdbc</groupId>
 *      <artifactId>mariadb-java-client</artifactId>
 *      <version>3.3.3</version>
 *  </dependency>
 *  
 */
public class App {
	
	// Sintaxis JDBC --->>> jdbc:<subprotocolo>://<host>:<puerto>/<base_de_datos>[?parámetros]
	// En nuestro caso: jdbc:mysql://localhost:3306/testjava
    // En un proyecto real esta información NO debe estar en el código fuente
	private static final String URL_SERVIDOR = "jdbc:mysql://localhost:3306/";
	private static final String NOMBRE_BBDD = "testjava";
	private static final String USUARIO = "root";
	private static final String PASSWORD = "admin";
	
    public static void main(String[] args) {
    	
    System.out.println("Conexión y manejo de una base de datos");
   	crearEstructura();
    	
        System.out.println("Insertar datos en la tabla");
          insertarDatos();
    	
		System.out.println("Obtener TODOS los datos de la tabla");
		String SENTSQLSELECT = "SELECT * FROM animales;";
		consultarDatos(SENTSQLSELECT);
	  
	    System.out.println("Obtener los animales que comienzan por 'p')");
	    String SENTSQLSELECT2 = "SELECT * FROM animales WHERE NOMBRE LIKE 'p%';";
	    consultarDatos(SENTSQLSELECT2);
	    
	    System.out.println("Obtener los animales cuyo nombre termina en 'o')");
	    // consulta de parámetros (usando ? --> usar PreparedStatement)
	    consultarDatos2();
     	
    }

    private static void consultarDatos2() {
		String SENTENCIASQL = "SELECT nombre FROM animales WHERE nombre LIKE ? ORDER BY nombre";
        try (Connection conexion = DriverManager.getConnection(URL_SERVIDOR + NOMBRE_BBDD, USUARIO, PASSWORD);
        	PreparedStatement ps = conexion.prepareStatement(SENTENCIASQL)) {
        	ps.setString(1, "%o");
        	try (ResultSet rs = ps.executeQuery()){
	        	while(rs.next()) {
	        		System.out.println(rs.getString(1)); // rs.getString("nombre");
	        	}
        	}
        }catch(SQLException e) {
			System.err.println("Error!!! " + e.getMessage());
        }
 		
		
	}

	// Consultar datos de la tabla, con Statement
	private static void consultarDatos(String consulta) {
      	boolean hayDatos = false;
//        try (Connection conexion = DriverManager.getConnection(URL_SERVIDOR + NOMBRE_BBDD, USUARIO, PASSWORD)) {
//        	try (Statement s = conexion.createStatement()) {
//        		try (ResultSet rs = s.executeQuery(SENTSQLSELECT)) {
        try (Connection conexion = DriverManager.getConnection(URL_SERVIDOR + NOMBRE_BBDD, USUARIO, PASSWORD);
        	 Statement s = conexion.createStatement();
        	 ResultSet rs = s.executeQuery(consulta)) {
        			while(rs.next()) {   
        				hayDatos = true;
        				// es posible obtener dato por nombre de columna o por posición
        				System.out.println(rs.getInt("COD") + " - " + rs.getString(2)); //rs.getInt(1)
        			}
        			if(!hayDatos)
        			    System.out.println("La tabla está vacía");
//        		}        		
//        	}
        } catch (SQLException e) {
			System.err.println("Error!!! " + e.getMessage());
        }       	
	}

	@SuppressWarnings("unused")
	private static void insertarDatos() {
        String[] animales = {"Perro", "Gato", "Pato", "Gallina", "Zorro", "Agila"};
        String CONSULTAINSERT = "INSERT INTO animales (nombre) values (?)";
        try (Connection conexion = DriverManager.getConnection(URL_SERVIDOR + NOMBRE_BBDD, USUARIO, PASSWORD)) {
        	try (PreparedStatement ps = conexion.prepareStatement(CONSULTAINSERT)) {
        		for (String animal: animales) {
        			ps.setString(1, animal); // sustituye el primer argumento '?' por el nombre
        			ps.executeUpdate();
        		}
				System.out.println("Animales insertados!!!");
        	} 
        } catch (SQLException e) {
			System.err.println("Error!!! " + e.getMessage());
        } 	
	}

	@SuppressWarnings("unused")
	private static void crearEstructura() {
        System.out.println("UT 9 - Conexión Java - MySQL");
        System.out.println("============================\n");
        final String CONSULTACREARDDBB = "CREATE DATABASE IF NOT EXISTS " + NOMBRE_BBDD + ";";
        final String CONSULTACREARTABLA = "CREATE TABLE IF NOT EXISTS animales ( " +
                "    COD    INT  NOT NULL AUTO_INCREMENT, " +
                "    NOMBRE VARCHAR(50) NOT NULL, " +
                "    PRIMARY KEY (COD) " +
                ")";        
        try (Connection conexion = DriverManager.getConnection(URL_SERVIDOR, USUARIO, PASSWORD)) {
    		try (PreparedStatement ps = conexion.prepareStatement(CONSULTACREARDDBB); ) {
				ps.executeUpdate();
				System.out.println("Base de datos " +  NOMBRE_BBDD + " preparada!!!");
    		}
    		try (PreparedStatement ps = conexion.prepareStatement("USE " + NOMBRE_BBDD); ) {
				ps.execute();
				System.out.println("Base de datos " +  NOMBRE_BBDD + " activa!!!");
    		}    		
    		try (PreparedStatement ps = conexion.prepareStatement(CONSULTACREARTABLA); ) {
				ps.executeUpdate();
				System.out.println("Tabla lista!!!");
    		}
		} catch (SQLException e) {
			System.err.println("Error!!! " + e.getMessage());
//			e.printStackTrace();
		} 
	}
    
}

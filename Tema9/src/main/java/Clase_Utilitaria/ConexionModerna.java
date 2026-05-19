package Clase_Utilitaria;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Clase utilitaria para gestionar conexiones JDBC con MySQL.
 *
 * Implementación moderna y reutilizable.
 */
public class ConexionModerna {  // Impide herencia innecesaria

    // Datos de configuración
    private static String url;
    private static String usuario;
    private static String password;

    /**
     * Bloque estático de inicialización.
     * Se ejecuta una sola vez al cargar la clase.
     */
    static {

        try (InputStream entrada = ConexionModerna.class
                .getClassLoader()
                .getResourceAsStream("database.properties")) {

            Properties propiedades = new Properties();

            if (entrada == null) {
                throw new RuntimeException(
                        "No se encontró el fichero database.properties"
                );
            }

            propiedades.load(entrada);

            url = propiedades.getProperty("db.url");
            usuario = propiedades.getProperty("db.user");
            password = propiedades.getProperty("db.password");

        } catch (IOException e) {

            throw new RuntimeException(
                    "Error al cargar la configuración de la base de datos",
                    e
            );

        }

    }

    /**
     * Constructor privado para evitar instancias.
     */
    private ConexionModerna() {

    }

    /**
     * Devuelve una nueva conexión a la base de datos.
     *
     * @return Connection
     * @throws SQLException si ocurre un error de conexión
     */
    public static Connection getConexion() throws SQLException {

        return DriverManager.getConnection(
                url,
                usuario,
                password
        );

    }

}
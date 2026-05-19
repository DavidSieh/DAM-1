package Paquete_City;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CityDAO implements CityDaoImp {

    private static final String URL = "jdbc:mysql://localhost:3306/world";
    private static final String USER = "root";
    private static final String PASS = "admin";

    @Override
    public Set<City> listaCiudades() {

        Set<City> ciudades = new HashSet<>();

        String sql = "SELECT ID, Name, CountryCode, District, Population FROM city";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                City c = new City(
                        rs.getInt("ID"),
                        rs.getString("Name"),
                        rs.getString("CountryCode"),
                        rs.getString("District"),
                        rs.getInt("Population")
                );
                ciudades.add(c);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener ciudades: " + e.getMessage());
        }

        return ciudades;
    }

	@Override
	public boolean existeCiudad(long codigoCiudad) {
		
		return false;
	}
}


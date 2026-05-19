package Paquete_Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;


public class CountryDao implements Countryimp {

	private static final String URL = "jdbc:mysql://localhost:3306/world";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "admin";
	
	@Override
	public Set<Country> listaPaises() {
		
		Set<Country> paises = new HashSet<>();
		String CONSULTA = "SELECT CODE, NAME, REGION POPULATION FROM COUNTRY";
		
		 try (Connection con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
	             Statement st = con.createStatement();
	             ResultSet rs = st.executeQuery(CONSULTA)) {
			
			
			
			while(rs.next()) {
				Country c = new Country(
						rs.getInt("code"),
						rs.getString("name"),
						rs.getString("region"),
						rs.getInt("Population")
						);
				paises.add(c);
			}
			
		} catch (SQLException e) {
			System.err.println("Error al obtener PAISES: " + e.getMessage());
		}
		
		return null;
	}

}

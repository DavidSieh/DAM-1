package Paquete_City;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        CityDaoImp dao = new CityDAO();

        Set<City> ciudades = dao.listaCiudades();

        if (ciudades.isEmpty()) {
            System.out.println("No hay ciudades en la base de datos.");
        } else {
            for (City c : ciudades) {
                System.out.println(
                    c.getID() + " | " +
                    c.getName() + " | " +
                    c.getCountryCode() + " | " +
                    c.getDistrict() + " | " +
                    c.getPopulation()
                );
            }
        }
    }
}




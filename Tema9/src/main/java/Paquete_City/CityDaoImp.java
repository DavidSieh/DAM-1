package Paquete_City;

import java.util.Set;

public interface CityDaoImp {
    
	public Set<City> listaCiudades();
	
	public boolean existeCiudad(long codigoCiudad);
}

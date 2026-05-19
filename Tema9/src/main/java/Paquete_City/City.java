package Paquete_City;

import java.util.Objects;

public class City {

    private int ID;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    public City(int ID, String name, String countryCode, String district, int population) {
        this.ID = ID;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }



	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ID, countryCode, district, name, population);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return ID == other.ID && countryCode == other.countryCode && Objects.equals(district, other.district)
				&& Objects.equals(name, other.name) && population == other.population;
	}
 
	
	

}

package Paquete_Country;

import java.util.Objects;

public class Country {
	
	private int code;
	private String name;
	private String region;
	private int population;
	/**
	 * @param code
	 * @param name
	 * @param region
	 * @param population
	 */
	public Country(int code, String name, String region, int population) {
		super();
		this.code = code;
		this.name = name;
		this.region = region;
		this.population = population;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(code, name, population, region);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return code == other.code && Objects.equals(name, other.name) && population == other.population
				&& Objects.equals(region, other.region);
	}
	
	
	
	

}

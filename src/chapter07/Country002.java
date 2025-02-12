package chapter07;

public class Country002 {
	private String countryName;
	private String continent;	
	private int population;
	

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country002 [countryName=" + countryName + ", continent=" + continent + ", population=" + population
				+ "]";
	}

	public static void main(String[] args) {
		Country002 ags=new Country002();
		ags.setCountryName("대한민국");
		ags.setContinent("Aisa");
		ags.setPopulation(51000000);
		System.out.println(ags.toString());
		ags.setCountryName("미국");
		ags.setContinent("North America");
		ags.setPopulation(340000000);
		System.out.println(ags.toString());
	}

}

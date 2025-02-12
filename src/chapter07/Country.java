package chapter07;

public class Country {
	private String countryName;
	private String continent;	
	private int population; 
	
	public void setCountry(String cN , String c, int p) {
		countryName = cN;
		continent = c;
		population = p;
	}
	
	public void getCountry() {
		System.out.println(countryName);
		System.out.println(continent);
		System.out.println(population);
	}

	public static void main(String[] args) {
		Country country1=new Country();
		country1.setCountry("대한민국","아시아",51000000);
		country1.getCountry();
		Country country2=new Country();
		country2.setCountry("미국","북아메리카",340000000);
		country2.getCountry();
		
	}	
}

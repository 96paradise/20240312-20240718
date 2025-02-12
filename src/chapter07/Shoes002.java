package chapter07;

public class Shoes002 {
	private String name;
	private int price;
	private String make;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Shoes002 [name=" + name + ", price=" + price + ", make=" + make + "]";
	}

	public static void main(String[] args) {
		Shoes002 ags=new Shoes002();
		ags.setName("나이키 에어맥스");
		ags.setPrice(100000);
		ags.setMake("Nike");
		System.out.println(ags.toString());
		ags.setName("나이키 조던");
		ags.setPrice(200000);
		ags.setMake("Nike");
		System.out.println(ags.toString());
		

	}

}

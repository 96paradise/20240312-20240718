package chapter07;

public class Snack002 {
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
		return "Snack002 [name=" + name + ", price=" + price + ", make=" + make + "]";
	}

	public static void main(String[] args) {
		Snack002 ags=new Snack002();
		ags.setName("포카칩");
		ags.setPrice(1500);
		ags.setMake("Lotte");
		System.out.println(ags.toString());
		ags.setName("오예스");
		ags.setPrice(3000);
		ags.setMake("Lotte");
		System.out.println(ags.toString());

	}

}

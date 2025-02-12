package chapter07;

public class Shoes {
	private String name;
	private int price;
	private String make;
	
	public void setShoes(String n, int p, String m){
		name=n;
		price=p;
		make=m;
	}
	public void getShoes() {
		System.out.println(name);
		System.out.println(price+"원");
		System.out.println(make);
	}
	public static void main(String[] args) {
		Shoes shoes1=new Shoes();
		shoes1.setShoes("나이키 에어맥스",100000,"Nike");
		shoes1.getShoes();
		Shoes shoes2=new Shoes();
		shoes2.setShoes("나이키 조던",200000,"Nike");
		shoes2.getShoes();


	}

}

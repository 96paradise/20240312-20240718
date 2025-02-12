package chapter07;

public class Snack {
	private String name;
	private int price;
	private String make;
	
	public void setSnack(String n, int p, String m){
		name=n;
		price=p;
		make=m;
	}
	public void getSnack() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(make);
	}
	public static void main(String[] args) {
		Snack snack1=new Snack();
		snack1.setSnack("포카칩",1500,"lotte");
		snack1.getSnack();
		Snack snack2=new Snack();
		snack1.setSnack("오예스",3000,"lotte");
		snack1.getSnack();

	}

}

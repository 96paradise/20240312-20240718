package chapter07; //0318-7

public class Book {
	private String name;
	private int price;
	private String publosher;
	
	public void setBook(String n,int p, String pu) {
		name=n;
		price=p;
		publosher=pu;
	}
	
	public void getBook() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(publosher);
	}
	

	public static void main(String[] args) {
		Book book1=new Book();
		book1.setBook("프로그래밍 언어 활용", 0, "교육부");
		book1.getBook();
		Book book2=new Book();
		book2.setBook("개발자 환경 구축", 0, "교육부");
		book2.getBook();

	}

}

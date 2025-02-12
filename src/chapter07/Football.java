package chapter07;

public class Football {
	private String teamName;
	private String country;
	private String ace;
	
	public void setFootball(String tN, String c, String a){
		teamName=tN;
		country=c;
		ace=a;
	}
	public void getFootball() {
		System.out.println(teamName);
		System.out.println(country);
		System.out.println(ace);
	}
	public static void main(String[] args) {
		Football football1=new Football();
		football1.setFootball("아스날","영국","사카");
		football1.getFootball();
		Football football2=new Football();
		football2.setFootball("레알마드리드","스페인","벨링엄");
		football2.getFootball();
	}

}

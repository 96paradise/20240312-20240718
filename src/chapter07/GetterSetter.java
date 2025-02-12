package chapter07;

public class GetterSetter {
	private String name;
	private String phoneNumber;
	
	//게더세더
	//게더 - 값을 가져올 때
	//세더 - 값을 대입할 때
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPhoneNumber(String phoneNumber) {      //* 게더와 세더는 각각 1개씩 넣어줘야함, 2개이상 x
		this.phoneNumber=phoneNumber;
	}
	
	public static void main(String[] args) {
		GetterSetter gs=new GetterSetter();
		System.out.println(gs.getName());
		gs.setName("김자바");
		System.out.println(gs.getName());
		gs.setPhoneNumber("전화번호");
		System.out.println(gs.getName());
		//DTO(data transfer object), VO(value object)
		//클래스들은 두가지 방법으로 값을 초기화
		//1. 생성자 사용
		//2. 게더세더(getter setter)사용   //* DTO,VO에서는 이걸 더 많이 씀

	}

}

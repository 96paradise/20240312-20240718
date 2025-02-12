package chapter10;

//static 키워드
//static 키워드는 의미만 알아두기, 사용 거의 안함
//enum 나열값 >> *이걸 더 많이 씀
public class InstCnt {
	private int instNum=1;
	static int instStaticNum=0;
	
	public InstCnt(int instNum) {
		this.instNum=instNum;
	}
	@Override
	public String toString() {
		return "InstCnt [instNum=" + instNum + "]";
	}
	
	public static void sayHello() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		//인스턴스 변수 instNum을 사용하기 위해서
		//인스턴스 생성 - 클래스 틀을 이용해 인스턴스를 만들어서
		//메모리에 올린다
		InstCnt instCnt=new InstCnt(42);
		System.out.println(instCnt.toString());
		//static 선언을 붙이면 클래스 변수가 된다
		//static의 의미는 바로 사용이 가능하게 메모리에 올린다
		InstCnt.instStaticNum=42;
		System.out.println(instStaticNum);
		//메소드에 static 붙이면 클래스 메소드 메모리에 바로 적재되서
		//사용이 가능하다
		//메소드 내부의 변수
		int num1=0;
		InstCnt.sayHello();
		//클래스 내부에서 static 변수나 메소드를 사용할 때
		//클래스 이름 생략 가능하다
		sayHello();
		System.out.println(instStaticNum);
		
		//static을 붙인 클래스 변수나 메소드 사용은 하지 않는다
		//enum - 나열되는 데이터 값
		
		//main 메소드
		//인스턴스 생성과 관계없이 제일 먼저 호출되는 메소드이다
		//static을 붙여야 한다
		//main 메소드의 호출 명령은 외부로부터 시작되는 명령이다
		//public이 붙어 있다
		

	}

}

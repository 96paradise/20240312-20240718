package chapter10.lang;

public class SysMain {

	public static void main(String[] args) {
//		Sys.out.println("java");
		chapter10.Sys.out.println("java");
		java.lang.System.out.println("java");
		System.out.println("java");
		//System은 java.lang 패키지에 묶여 있는 클래스의 이름
		//컴파일러와 약속이 되어있다
		//out은 클래스 System의 이름을 통해 접근하므로,
		//이는 System클래스의 클래스 변수 이름임을 유추할 수 있다.
		//인스턴스 생성 없이 바로 사용가능하므로
		//static이 붙어 있는 클래스 변수라는 것도 유추 가능하다
		//이클립스 내에서는 이탤릭체로 되어있기 때문에 클래스 변수이다
		//이클립스 내에서 굵은 글씨체로 표현되서 final키워드가
		//붙어있는 상수이다

	}

}

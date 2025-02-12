package chapter02;

public class UserVariable4 {

	public static void main(String[] args) {
		//변수
		int number=1;
		System.out.println(number);
		number=2;
		System.out.println(number);
		int num;
//		int number;
		int a=1,b=2;           //* int squareWidth=4,squareLength=8;
							   //  System.out.println(squareWidth * squareLength);
		                       //  int squareWidth=4; int squareLength=8; (x)> 한줄 띄우기 아니면 위에 처럼하기
		                       //  int squareWidth=4; 
		                       //  int squareLength=8;

		//;세미콜론 문자의 끝을 의미
		System.out.println(a); //*세미콜론은 문자의 끝을 의미하기 때문에 다음줄로 코딩
		System.
		out.
		println(a);//(x)
		int c=1; int d=2;//(x)
		
		//변수 활용의 예
		int num1;
		num1=10;
		int num2=20;
		int num3=num1+num2;
		System.out.println(num3);
		
		//다양한 자료형 활용의 예
		//자바 기본 실수 자료형은 double
		double pi=3.14;
		System.out.println(3.14);
		
		double d3;
		double d4;
		double d1, d2;
		double result;
		d1=1.0000001;
		d2=2.0000001;
		result=d1+d2;
		System.out.println(result); //코딩값 3.0000001999999997, 값 3.0000002
		//실수의 연산은 오차가 발생된다
		//한정된 공간에 실수를 저장하기 위해
		//소수점자리를 제한하기 위해
		//공식을 사용해서 소수점 자리를 제한하여 저장하기 떄문에  //* 실수는 오차 있다고만 알고 있으면 됨, 깊게가면 머리아픔
		//자주 사용하는 자료형 boolean, int, double
		//boolean 불린, 불
		//공간이 1byte
		//두가지 상황을 체크하기 위해 자주 쓰인다 //* 조건문에서 다시 배움
		//값 : 참(true)과 거짓(false)
		boolean b1 = true;
		boolean b2=false; //* 띄어쓰기는 취향
		System.out.println(b1);
		System.out.println(b2);
		
		//문자열 자료형
		//유니코드 (2byte) //*512글자 전세계 언어 가능, 
		//아스킷코드(1byte) //*256글자 전세계 언어까진 안됨
		char ch3=54736;
		System.out.println(ch3);
		
		String str1="문자열 자료형의 표현은 쌍따옴표"; //*문자열을 쓸때는 String 씀
		System.out.println(str1);
		//boolean, int, double, String        //* 이 4개는 잘 알아놓기
		String lcetureName="정보처리기능사 취득 과정";
		System.out.println(lcetureName);
		
		//변수***** 
		//자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해 콘솔에 출력하세요
		//목적: 변수를 선언하고 사용
		
		
		
	}

}

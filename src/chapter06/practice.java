package chapter06;

public class practice {

	public static void main(String[] args) {
		//두 수를 입력 받아 더한 값을 리턴 해주는 함수 만들기
		//두 수를 입력 받아 뺀 값을 리턴 해주는 함수 만들기
		//두 수를 입력 받아 곱한 값을 리턴 해주는 함수 만들기
		//두 수를 입력 받아 나눈 값을 리턴 해주는 함수 만들기
		//두 수를 입력 받아 나머지 값을 리턴 해주는 함수 만들기
		//직사각형의 두변을 입력 받아 둘레는 리턴 해주는 함수
		//직사각형의 두변을 입력 받아 넓이를 리턴 해주는 함수
		//삼각형의 넓이와 높이를 입력 받아 넓이를 리턴 해주는 함수
		//원의 반지름을 입력 받아 넓이는 리턴 해주는 함수
		//정사각형의 한변을 입력 받아 넓이는 리턴 해주는 함수
		//만든 함수를 호출하여 잘 동작하는지도 해보세요
		
		
		System.out.println(add(7,2));
		System.out.println(minus(8,2));
		System.out.println(multiplication(3,2));
		System.out.println(division(20,2));
		System.out.println(rest(7,2));
		System.out.println(squarePremeter(12, 6));
		System.out.println(squareArea1(20, 30));
		System.out.println(triangleArea(30, 18));
		System.out.println(sircleArea(8));
		System.out.println(squareArea2(10));
		
	
	}
	public static int add(int add1, int add2) {
		return add1+add2;
	}
	public static int minus(int minus1, int minus2) {
		return minus1-minus2;
	}
	public static int multiplication(int multiplication1, int multiplication2) {
		return multiplication1*multiplication2;
	}
	public static int division(int division1, int division2) {
		return division1/division2;
	}
	public static int rest(int rest1, int rest2) {
		return rest1%rest2;
	}
	public static int squarePremeter(int a, int b) {
		return (2*a)+(2*b);
	}
	public static int squareArea1(int a, int b) {
		return a*b;
	}
	public static int triangleArea(int width, int height) {
		return width*height/2;
	}
	public static double sircleArea(int radius) {
		double pi=3.14;
		return radius*radius*pi;
	}
	public static int squareArea2(int side) {
		return side*side;
	}
}


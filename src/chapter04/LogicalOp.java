package chapter04; //2

public class LogicalOp {

	public static void main(String[] args) {
		// 변수 num1에 저장된 값이 1과 100 사이의 수인가?
		int num1= 0;      //* -11 변수값도 가능 +11도 가능
		boolean result;   //* boolean = true or false
		result=(1<num1)&&(num1<100);
		System.out.println("1초과 100미만인가? " + result);
		
		// 변수 num2에 저장된 값이 2 또는 3의 배수인가?
		int num2=5;
		System.out.println("2 또는 3의 배수인가? " + ((num2%2==0)||(num2%3==0)));
		
		// 변수 num1이 0인가?
		result =!(num1!=0);
		System.out.println("0인가? " + result);
		

	}

}

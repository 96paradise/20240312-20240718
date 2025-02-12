package chapter04; //3

public class UnaryAddMin {

	public static void main(String[] args) {
		//단항 연산자 - 피연산자가 1개   
		//A - 단항 연산자
		//ex) A>B - 이항연산자
		
		//부호 연산자
		//+ 연산자는 생략가능
		int n1=+1;
		int n2=-1;
		int n3=1;
		int n4=-n3;
		System.out.println(n4);    //* -1
		System.out.println(+n4);   //* -1
		
		//증가 감소 연산자
		//++, -- - 1씩 증가, 감소
		//prefix - val=++n;, val=--n;
		//postfix - val=n--;, val=n--;
		int n5=1;
		System.out.println(++n5); //2
		System.out.println(++n5); //3 
		System.out.println(++n5); //4
		System.out.println(++n5); //5   //* 1씩 증가
		System.out.println(--n5); //4
		System.out.println(--n5); //3
		System.out.println(--n5); //2   //* 1씩 감소
		
		System.out.println(n5++); //2
		System.out.println(n5++); //3
		System.out.println(n5++); //4
		System.out.println(n5);   //5
		System.out.println(n5);   //5
		System.out.println(n5--);   //5
		System.out.println(n5);   //4
		System.out.println(n5);   //4
		
		//prefix - 라인이 시작할 때 증가
		//postfix - 라인이 끝나고 나서 증가
		int n6=1;
		System.out.println(++n6); //2   //* prefix - 라인이 시작할 때 증가
		int n7=1;
		System.out.println(n7++); //1   //* postfix - 라인이 끝나고 나서 증가
		System.out.println(n7);   //2
		
		
		
		
		
	}

}

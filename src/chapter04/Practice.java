package chapter04;

public class Practice {

	public static void main(String[] args) {
		//구구단 만들기
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
//				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
//				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		
		for(int i=10;i<20;i++) {      //* 구구단 기준) i 기준값; i 최대값
			for(int j=1;j<20;j++)
				System.out.println(i+"x"+j+"="+i*j); //* 기호에 ""?
		}
		
		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하여라
		int sum = 0;
		for(int i = 0; i <= (100 / 3); i++) {
			sum += 3 * i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);
		
		
		
	}
		
}



package chapter02;

public class practice {

	public static void main(String[] args) {
		
		//* 똑같은 명칭 안됨, 단어 붙여서, 각각 변수 int 다 붙여야 함
		
		// 직사각형의 넓이를 구하여라 - 가로*세로
		int squareWidth=4, squareLength=8;
		System.out.println(squareWidth * squareLength);
		
		// 직사각형의 둘레를 구하여라 - (가로+세로)*2
		int squareW=3, squareL=7;
		System.out.println((squareW + squareL)*2);
		
		// 반지름을 이용하여 원의 둘레를 구하여라 - 2*반지름*원주율
		int radius=6;
		System.out.println(2*radius*3.14);
		
		// 삼각형의 넓이를 구하여라 - 밑변*높이/2
		int triangleBottomSide=3, triangleLength=5;
		System.out.println((triangleBottomSide * triangleLength) /2);
		
		// 삼각형의 길이를 구하여라 - 변의 길이+변의 길이+변의 길이
		int triangleSide=3;
		System.out.println(triangleSide*3);
		
		// 정사각형의 넓이를 구하여라 - 가로A*세로B
		int squareA=4, squareB=4;
		System.out.println(squareA*squareB);
		
		// 정오각형의 둘레를 구하여라 - 변의 길이*5
		int pentagonSide=5;
		System.out.println(pentagonSide*5);
		
		// 육각형 hexagon
		int hexagonSide = 6;
		System.out.println(hexagonSide*6);
		
		// 정칠각형의 둘레를 구하여라 - 변의 길이*7
		int heptagonSide=7;
		System.out.println(heptagonSide*7);
		
		// 정팔각형의 둘레를 구하여라 - 변의 길이*8
		int octagonSide=8;
		System.out.println(octagonSide*8);
		
		// 지급받은 3권의 교재 총 페이지 수를 구하여라 -책1+책2+책3
		int programingBook=74; 
		int developerBook=70; 
		int informationcapabilityBook=83;
		System.out.println(programingBook + developerBook + informationcapabilityBook);
		
	}
}
		
		
				

		

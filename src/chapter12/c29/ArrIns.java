package chapter12.c29;

import chapter12.c27.Computer;
import chapter12.c27.Product;
import chapter12.c27.Tv;

//여러 종류의 객체를 배열로 다루기
public class ArrIns {
	
	public static void main(String[] args) {
		String str="string";
		String[] strArr= {"s1","s2","s3"};
		ArrIns[] arr1=new ArrIns[3];
		//상속 관계에 있는 인스턴스들도 상위 배열 참조 변수에 담을 수 있다
		Product[] pArr=new Product[3]; //* Product 빨간줄 갖다대서 imput누르기
		//Product > Computer, Tv
		pArr[0]=new Product();
		pArr[1]=new Tv();              //* Product 빨간줄 갖다대서 imput누르기
		pArr[2]=new Computer();        //* Product 빨간줄 갖다대서 imput누르기

	}

}

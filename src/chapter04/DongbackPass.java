package chapter04; //9

public class DongbackPass {

	public static void main(String[] args) {
		//else if
		//4.5만원 환급
		//최대 4만 5천원을 환급
		int payMoney=50000;
		if(payMoney<=45000) {
			System.out.println("환급할 금액이 없습니다");
		}else if(payMoney<90000) {
			System.out.println("환급 금액: "+(90000-payMoney));
			int payBack=payMoney-45000;
			System.out.println("환급 금액: "+payBack);
		}else {
			System.out.println("환급 금액: 45000원");       //*? 환급 금액 2개나옴
		}

	}

}

package chapter12;

//다형성(polymorphism) //* 객체지향언어의 4가지 - 추상화 캡슐화 상속 다형성
public class Tv2 {
	private boolean power;
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void power() {
		power=!power;
	}

	public static void main(String[] args) {

	}

}

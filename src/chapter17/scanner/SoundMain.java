package chapter17.scanner;

public class SoundMain {
	
	public static void main(String[] args) {
		String myDoc1="고양이 소리입니다";
		String myDoc2="강아지 소리입니다";
		//"야옹" 출력
		Sound prn=new Sound1();
		prn.print(myDoc1);
		//"멍멍" 출력
		prn=new Sound2();
		prn.print(myDoc2);
	}

}

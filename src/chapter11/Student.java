package chapter11;

//다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오
public class Student {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int ban, int no, 
			int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng; 
		
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAverage() {
		return (kor+eng+math)/3;
	}
	public String info() {
		int getTotal=(kor+eng+math);
		System.out.println(getTotal);
		float getAverage=(kor+eng+math)/3;
		System.out.println(getAverage);
		return name+","+ban+","+no+","+kor+","+eng+","+math;
	}
	
	public static void main(String[] args) {
		Student s=new Student("홍길동",1,1,100,60,76);
		String student=s.info();
		System.out.println(student);
		
		
	}

}

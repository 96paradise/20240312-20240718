package chapter25;

public enum people {
	MAN(29),WOMAN(25);
	
	int age;
	people(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		return " I am "+age+" years old";
	}

	public static void main(String[] args) {
		System.out.println(people.MAN);
		System.out.println(people.WOMAN);
	}

}



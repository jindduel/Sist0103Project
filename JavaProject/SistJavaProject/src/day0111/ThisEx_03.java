package day0111;

/*
 * 1. this : 객체 생성 후 메모리에 생성된 자기 자신의 인스턴스를 의미
 * 인스턴스 변수와 로컬 변수명이 동일한 경우 this.인스턴스변수명
 * 2. 생성자에서 다른 오버로딩 생성자를 호출하는 경우 this(); 반드시 생선자의 첫줄
 */
class Test { 
	private String name;
	private int grade;
	
	//생성자
	public Test(String name) {
		this(name, 4);
	}
	
	public Test(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}
	
	
}

public class ThisEx_03 {
	public static void main(String[] args) {
		Test t1 = new Test("홍길동");
		
		System.out.println("이름은 " + t1.getName() + "이고 학년은 " + t1.getGrade() + "학년 입니다. ");
	}
}

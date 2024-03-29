package day0116;

class Outer {
	
	String name = "조혜영";
	int age = 22;
	
	
	//멤버 내부
	class Inner1 {
		//내부클래스에서는 외부클래스의 멤버변수 사용 가능
		public void disp() {
			System.out.println("** Inner1 내부클래스 **");
			System.out.println("이름 : " + name + ", 나이 : " + age + "세");
		}
	}
	
	class Inner2 {
		public void disp2() {
			System.out.println("** Inner2 내부클래스 **");
			System.out.println("이름 : " + name + ", 나이 : " + age + "세");
		}
	}
	
	//외부클래스 메소드
	public void write() {
		//외부메소드에서 내부 클래스 선언
		Inner1 in1 = new Inner1();
		in1.disp();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}
	
}

public class InnerObj_05 {
	public static void main(String[] args) {
		
		//외부 생성
		Outer out = new Outer();
		out.write();
		
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp();
		
		Outer.Inner2 in2 = new Outer().new Inner2();
		in2.disp2();
	}
}

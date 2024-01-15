package day0112;

import day0112_1.Sawon_05;

class My extends Sawon_05 {
	int age;
	
	public My(String name, String buseo, int age) {
		this.name = name; //부모 클래스가 패키지가 다를 경우 protected는 접근 가능
		this.buseo = buseo;
		this.age = age;
	}
	
	public void printMy() {
		System.out.println("** My에서 만든 메소드 **");
		System.out.println("사원명 : " + this.name);
		System.out.println("부서 : " + this.buseo);
		System.out.println("나이 : "+ this.age);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("나이 : "+ this.age);
		System.out.println("자식이 오버라이딩한 메소드");
	}
}

public class MainSawon_05 {
	public static void main(String[] args) {
		My m = new My("이영자", "인사부", 22);
		
		m.printMy();
		System.out.println();
		m.display();
	}
}

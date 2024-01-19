package day0111;

import java.nio.file.spi.FileSystemProvider;

//객체의 속성 : 인스턴스 변수		객체의 동적 : 클래스의 매서드
/*
 * Object(객체) : 실제로 존재하는 사물
 * class : 객체를 정의, 객체를 생성하기 위해 존재(설계도)
 * Instance : 클래스에서 만들어진 객체를 그 클래스의 인스턴스라고 함
 */

class Person {
	private String name;
	private int age;
	private String hp;
	private String add;
	
	public Person() {
		
	}
	public Person(String name, int age, String add, String hp) {
		this.name = name;
		this.age = age;
		this.add = add;
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
}

public class ProjectReview_01 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		//p1.name = ""; private 인스턴스 변수는 변수에 접근 x
		
		p1.setName("김민지");
		p1.setAdd("강남구");
		p1.setAge(22);
		p1.setHp("010-111-2222");
		
		String name = p1.getName();
		int age = p1.getAge();
		String add = p1.getAdd();
		String hp = p1.getHp();
		
		System.out.println("[개인정보]");
		System.out.println(name);
		System.out.println(age);
		System.out.println(add);
		System.out.println(hp);
		
		Person p2 = new Person("김소미", 22, "서울시", "010-111-1111");
		
		System.out.println("-------------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAdd());
		System.out.println(p2.getHp());
		
		
		
	}
}
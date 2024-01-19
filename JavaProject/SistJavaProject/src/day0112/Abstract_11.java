package day0112;
//추상 클래스
/*
 * 추상클래스는 new로 생성 불가
 * abstract 메소드는 abstract 클래스에서만 존재
 * abstract 클래스는 일반 메소드, 추상 메소드 둘 다 포함 가능
 */

abstract class Fruit {
	public static final String MESSAGE = "오늘은 추상 클래스 배우는 날~";
	
	//일반 메소드
	public void shoeTitle() {
		System.out.println("일반 메소드 입니다.");
	}
	
	//추상 메소드(미완의 메소드)..오버라이딩 목적
	abstract public void showMessage();
	
}

class Apple extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MESSAGE);
		System.out.println("Apple_Message");
		
	}
	
}

class Banana extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MESSAGE);
		System.out.println("Banana_Message");
	}
	
}

class Orange extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MESSAGE);
		System.out.println("Orange_Message");
	}
	
}

public class Abstract_11 {
	public static void main(String[] args) {
		//일반 생성 출력
		Apple apple = new Apple();
		apple.showMessage();
		System.out.println();
		
		Banana banana = new Banana();
		banana.showMessage();
		System.out.println();
		
		Orange orange = new Orange();
		orange.showMessage();
		System.out.println();
		
		
		//다형성
		Fruit fruit = null;
		
		fruit = new Apple();
		fruit.shoeTitle();
		fruit.showMessage();
		System.out.println();
		

		fruit = new Banana();
		fruit.shoeTitle();
		fruit.showMessage();
		System.out.println();
		

		fruit = new Orange();
		fruit.shoeTitle();
		fruit.showMessage();
		System.out.println();
		
		//추상 클래스 생성
		//Fruit fr = new Fruit();
	}
	
}

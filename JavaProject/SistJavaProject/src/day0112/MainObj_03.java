package day0112;

//부모 클래스의 멤버를 자식클래스가 선언없이 사용 가능
//private은 같은 패키지여도 상속 x
//자바는 단일 상속만 가능
//클래스명 extends 상속클래스명
//

public class MainObj_03 {
	public static void main(String[] args) {
		SubObj_03 su = new SubObj_03("김선호", 22, "강남구");
		
		su.printData();
	}
}

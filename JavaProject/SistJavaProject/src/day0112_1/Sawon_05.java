package day0112_1;

import javax.xml.crypto.KeySelector.Purpose;

public class Sawon_05 {
	protected String name;
	protected String buseo;
	
	//메소드
	public void display() {
		System.out.println("** 오버라이드를 통해 만든 메소드 호출 **");
		System.out.println("이름 : " + this.name);
		System.out.println("부서 : " + this.buseo);
	}
}

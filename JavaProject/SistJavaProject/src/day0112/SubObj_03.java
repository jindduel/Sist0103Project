package day0112;

public class SubObj_03 extends SuperObj_03 {
	String add;
	
	public SubObj_03(String name, int age, String add) {
		super(name, age); //부모 생성자, 반드시 첫줄이여야 함
		this.add = add;
	}
	
	public SubObj_03() {
		
	}
	
	public void printData() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("주소 : " + this.add);
	}
}

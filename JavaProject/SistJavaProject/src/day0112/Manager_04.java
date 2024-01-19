package day0112;

public class Manager_04 extends Employee_04 {
	String depart;

	public Manager_04(String name, int sal, String d) {
		super(name, sal); //부모 생성자 호출
		this.depart = d; //초기화
	}
	
	//오버라이딩 / 재정의된 메소드_ 하위클래스에서 부모클래스의 메소드르 수정해서 사용하는 것
	//상속이 전재, 메소드명이 동일, 메소드 리턴타입 동일
	@Override
	public String getEmployee() {
		return super.getEmployee() + ", " + depart;
	}
	
}

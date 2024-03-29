package day0112;
/*
 * ** 디폴트 생성자로 생성 **
 * 회사명 : 현대
 * 종류 : 전기차 
 * 자동차명 : 아이오닉5
 * 색상 : 블랙
 * 가격 : 35000000원
 * 
 * ** 명시적 생성자로 생성**
 * 회사명 : 현대
 * 종류 : 가솔린 
 * 자동차명 : 코나
 * 색상 : 화이트
 * 가격 : 25000000원
 */

class Car {
	private String carCompany; //제조회사
	private String carKind; //종류
	
	
	
	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarKind() {
		return carKind;
	}

	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}

	public Car() {
		this("현대", "전기차");
	}
	
	public Car(String company, String kind) {
		this.carCompany = company;
		this.carKind = kind;
	}
	
	public void printData(){
		System.out.println("회사명 : " + carCompany);
		System.out.println("종류 : " + carKind);
	}

	
}

class MyCar extends Car {

	private String carName;
	private String carColor;
	private int carPrice;
	
	
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public MyCar() {
		super();
		carName = "아이오닉5";
		carColor = "블랙";
		carPrice = 35000000;
	}

	public MyCar(String company, String kind, String name, String color, int price) {
		super(company, kind);
		this.carName = name;
		this.carColor = color;
		this.carPrice = price;
	}
	
	public void printData() {
		super.printData();
		System.out.println("자동차명 : " + carName);
		System.out.println("색상 : " + carColor);
		System.out.println("가격 : " + carPrice + "원");
	}
	
}

public class Inharit_08 {
	 public static void main(String[] args) {
		MyCar m1 = new MyCar();
		System.out.println("**디폴트 생성자로 생성**");
		m1.printData();
		System.out.println();
		
		MyCar m2 = new MyCar("기아", "가솔린", "코나", "화이트", 25000000);
		System.out.println("**명시적 생성자로 생성**");
		m2.printData();
		System.out.println();
		
		System.out.println("**부모 메소드 출력**");
		Car c1 = new Car();
		c1.printData();
	}
}

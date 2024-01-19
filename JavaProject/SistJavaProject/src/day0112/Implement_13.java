package day0112;

//interface는 상수와 추상메소드만 가질 수 있음
//class가 class : extends
//class가 interface : implement
//interface가 interface : extends
interface FoodShop {
	String SHOPNAME = "남소관"; //상수? final 생략
	
	public void order();
	public void bedal();
}

class Food2 implements FoodShop{

	@Override
	public void order() {
		//SHOPNAME = "왕돈까스"; 상수이므로 수정 x
		System.out.println("음식을 주문합니다. ");
	}

	@Override
	public void bedal() {
		System.out.println("음식을 배달합니다. ");
	}
	
}

class Food3 implements FoodShop {

	@Override
	public void order() {
		System.out.println("키오스크 주문");
	}

	@Override
	public void bedal() {
		System.out.println("쿠팡이츠 배달");
	}
	
}


public class Implement_13 {
	public static void main(String[] args) {
		FoodShop fs = new Food2();
		fs.order();
		fs.bedal();
		
		fs = new Food3();
		fs.order();
		fs.bedal();
		
		
	}
}

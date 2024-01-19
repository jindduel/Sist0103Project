package day0112;

class Emart {
	private String sangpum;
	private int su;
	
	public Emart() {
//		sangpum = "딸기";
//		su = 10;
		this("딸기", 10);
	}
	
	public Emart(String sang, int su) {
		this.sangpum = sang;
		this.su = su;
	}
	
	//
	public void printMart() {
		System.out.println("상품명 : " + sangpum);
		System.out.println("수량 : " + su);
	}
}

class KangnamEmart extends Emart {
	private int price;
	
	public KangnamEmart() {
		price = 10000;
	}
	
	public KangnamEmart(String sang, int su, int price) {
		super(sang, su);
		this.price = price;
	}
	
	//재정의
	@Override
	public void printMart() {
		System.out.println("단가 : " + price);
		super.printMart();
	}
}

public class Inheri_06 {
	public static void main(String[] args) {
		KangnamEmart k1 = new KangnamEmart();
		k1.printMart();
		
		KangnamEmart k2 = new KangnamEmart("수박", 5, 25000);
		k2.printMart();
		
	}
}

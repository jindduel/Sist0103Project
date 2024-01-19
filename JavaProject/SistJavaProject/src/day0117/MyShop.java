package day0117;

public class MyShop {
	private String sangpum;
	private int su;
	private int price;
	
	//디폴트 생성자
	public MyShop() {
		
	}
	
	//명시적 생성자
	public MyShop(String sang, int su, int price) {
		this.sangpum = sang;
		this.su = su;
		this.price = price;
	}
	
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}

package day0111;

class Shop {
	private String sangpum;
	private int price;
	private String sangColor;
	
	public Shop(String s, int p, String c) {
		sangpum = s;
		price = p;
		sangColor = c;
	}
	
	//제목
	public static void showTitle() {
		System.out.println("상품명\t가격\t색상");
		System.out.println("======================");
	}
	
	//생성한 갯수만큼 출력
	public void showShop() {
		System.out.println(sangpum + "\t" + price + "\t" + sangColor);
	}
}

public class ArrObTest_11 {
	public static void main(String[] args) {
		//4개 생성해서 출력
		Shop[] s = {
				new Shop("키보드", 20000, "블랙"),
				new Shop("마우스", 15000, "화이트"),
				new Shop("모니터", 200000, "블랙"),
				new Shop("장패드", 18000, "블루")
		};
		
		Shop.showTitle();
		for(Shop i : s) i.showShop();
		System.out.println("======================");
		
		Shop.showTitle();
		for(int i = 0; i < s.length; i++) s[i].showShop();
	}
}

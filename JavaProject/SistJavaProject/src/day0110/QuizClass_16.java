package day0110;

class Mart {
	private String sang;
	int su;
	int dan;
	
	static String SHOPNAME = "롯데마트";
	
	public void setSang(String sang) {
		this.sang = sang;
	}
	
	
	public String getSang() {
		return sang;
	}
	
	
}


public class QuizClass_16 {
	//생성 후 초기 값 주고 출력
	public static void main(String[] args) {
		Mart m1 = new Mart();
		
		 m1.setSang("초코파이");
		 m1.su = 10;
		 m1.dan = 4500;
		 
		 Mart m2 = new Mart();
			
		 m2.setSang("엄마손파이");
		 m2.su = 5;
		 m2.dan = 2500;
		 
		 System.out.println("***" + Mart.SHOPNAME + " 입고 물품***");
		 System.out.println("========================");
		 System.out.println("상품명 : " + m1.getSang());
		 System.out.println("수량 : " + m1.su + "개");
		 System.out.println("가격 : " + m1.dan + "원");

		 System.out.println("------------------------");
		 
		 System.out.println("상품명 : " + m2.getSang());
		 System.out.println("수량 : " + m2.su + "개");
		 System.out.println("가격 : " + m2.dan + "원");
		 
		 
	}
}

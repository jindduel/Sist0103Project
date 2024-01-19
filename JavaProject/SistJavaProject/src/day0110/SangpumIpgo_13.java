package day0110;

class Ipgo {
	private String sangName;
	private int sangPrice;
	
	//set 메서드
	public void setName(String name) {
		sangName = name;
	}
	
	public void setPrice(int price) {
		sangPrice = price; 
	}
	
	//get 메서드
	public String getName() {
		return sangName;
	}
	
	public int getPrice() {
		return sangPrice;
	}
}

public class SangpumIpgo_13 {
	
	public static void main(String[] args) {
		Ipgo ip1 = new Ipgo();
		
		ip1.setName("애플워치");
		ip1.setPrice(580000);
		
		String name = ip1.getName();
		int price = ip1.getPrice();
		
		Ipgo ip2 = new Ipgo();
		
		ip2.setName("에어팟");
		ip2.setPrice(320000);
		
		String name2 = ip2.getName();
		int price2 = ip2.getPrice();
		
		System.out.println(name + ", " + price + "원");
		System.out.println(name2 + ", " + price2 + "원");
	}
	
}

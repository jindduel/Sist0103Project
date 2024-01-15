package day0112;

import java.util.Scanner;

class Food { 
	/*
	 * [메뉴_1]
	 * 음식명 : 마르게리타 피자
	 * 가격 : 12000원
	 * 
	 * 2
	 * 카르보나라 스파게티
	 * 15000
	 * 
	 * 3
	 * 리코타 샐러드
	 * 9000
	 */
	private String foodName;
	private int foodPrice;
	
	static int no;
	
	//명시적 생성자
	public Food(String name, int price) {
		this.foodName = name;
		this.foodPrice = price;
	}
	
	public String getFoodName() {
		return foodName;
	}



	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}



	public int getFoodPrice() {
		return foodPrice;
	}



	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	
	public static void printTilte() {
		System.out.println("** 메뉴판 **");
		System.out.println("=============");
	}
	
	public void printList() {
		no++;
		System.out.println("[메뉴_" + no + "]");
		System.out.println("음식명 : " + getFoodName());
		System.out.println("가격 : " + getFoodPrice());
		System.out.println("-------------");
	}
	
}

public class ArrReview_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		Food[] f = new Food[n];
		
		for(int i = 0; i < f.length; i++) {
			System.out.print("메뉴를 입력해주세요. ");
			String menu = sc.nextLine();
			System.out.println("가격을 입력해주세요. ");
			int price = Integer.parseInt(sc.nextLine());
			
			f[i] = new Food(menu, price);
		}
		
//		Food[] f = {
//				new Food("요가매트", 25000),
//				new Food("아령", 30000),
//				new Food("레깅스", 45000),
//				new Food("나시", 22000),
//		};

		Food.printTilte();
		for(int i = 0; i < f.length; i++) f[i].printList();
 	}
}	

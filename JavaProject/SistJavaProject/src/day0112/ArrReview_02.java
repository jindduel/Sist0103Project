package day0112;

import java.util.Scanner;

/*
 * [쌍용 매장 입고 상품]
 * 번호 상품명   가격    색상 
 * ======================
 * 1   요가매트 25000원 핑크
 * 2   아령    30000원 블랙
 * 3   레깅스   45000월 베이지
 * 4   나시    22000원  화이트
 * 
 */
class Shop {
	String name;
	String color;
	int price;
	
	static int cnt;
	
	public Shop(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public static void printTitle() {
		System.out.println("번호\t상품명\t가격\t색상");
		System.out.println("===============================");
	}

	public void printList() {
		cnt++;
		System.out.println(cnt + "\t" + name + "\t" + price + "원\t" + color);
	}
}

public class ArrReview_02 {
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n = Integer.parseInt(sc.nextLine());
		
		Shop[] s = {
				new Shop("요가매트", 25000, "핑크"),
				new Shop("아령", 30000, "블랙"),
				new Shop("레깅스", 45000, "베이지"),
				new Shop("나시", 22000, "화이트"),
		};
		
//		Shop[] s = new Shop[n];
//		
//		for(Shop i : s) {
//			System.out.print("상품명을 입력해주세요. ");
//			String name = sc.nextLine();
//			System.out.print("가격을 입력해주세요. ");
//			int price = Integer.parseInt(sc.nextLine());
//			System.out.print("색상을 입력해주세요.");
//			String color = sc.nextLine();
//			
//			i = new Shop(name, price, color);
//		}
		
		Shop.printTitle();
		for(Shop i : s) i.printList();
		
		
	}
}
package day0104;

import java.util.Scanner;

public class QuizKeybordIn_16 {
	public static void main(String[] args) {
		/*
		 * 상품명을 입력하세요. 아이폰15
		 * 가격을 입력하세요. 1200000
		 * 수량을 입력하세요. 5개
		 * 
		 * 상품 입고
		 * =======================
		 * 입고 상품명 : 아이폰15
		 * 수량 : 5개
		 * 가격 : 1200000원
		 * 총 가격 : 6000000원
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		String name;
		int price, cnt;
		
		System.out.print("상품명을 입력하세요. ");
		name = sc.nextLine();
		System.out.print("가격을 입력하세요. ");
		price = sc.nextInt();
		System.out.print("수량을 입력하세요. ");
		cnt = sc.nextInt();
		
		System.out.println("상품 입고");
		System.out.println("=========================");
		System.out.println("입고 상품명 : " + name);
		System.out.println("수량 : " + cnt + "개");
		System.out.println("가격 : " + price / 10000 + "만원");
		System.out.println("총 가격 : " + (price / 10000 * cnt) + "만원");
	}
}
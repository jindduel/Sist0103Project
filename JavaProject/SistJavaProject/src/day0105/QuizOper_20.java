package day0105;

import java.util.Scanner;

public class QuizOper_20 {
	public static void main(String[] args) {
		/*
		 * (5개 이상 구매시 10% 할인)
		 * 상품명 : 키보드 
		 * 수량 : 5
		 * 가격 : 20000
		 * 
		 * ============================
		 * *5개 이상 구매 시 10% 할인됩니다.*
		 * 키보드 5개는 총 90000원 입니다.
		 * 할인된 금액 : 10000원
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int cnt, price, n = 0;
		
		System.out.print("상품명 : ");
		name = sc.nextLine();
		System.out.print("수량 : ");
		cnt = sc.nextInt();
		System.out.print("가격 : ");
		price = sc.nextInt();
		
		if(cnt >= 5) n = (cnt * price) / 10;
		
		System.out.println("=========================");
		System.out.println("*5개 이상 구매 시 10% 할인됩니다. ");
		System.out.println(name + " " + cnt + "개는 총 " + (cnt * price - n) + "원 입니다. ");
		System.out.println("할인된 금액 : " + n + "원");
		
		
		
		
		
	}
}

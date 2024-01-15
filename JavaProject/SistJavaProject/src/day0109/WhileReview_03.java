package day0109;

import java.util.Scanner;

public class WhileReview_03 {
	public static void main(String[] args) {
		/*
		 * 반복적으로 나이를 입력함 0 종료
		 * 나이 50이상 a변수 증가, 30이상 b변수 증가, 그 외 c변수 증가
		 * 각각 명수 출력
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		
		while(true) {
			System.out.print("나이를 입력해주세요. ");
			age = sc.nextInt();
			
			if(age == 0) break;
			
			if(age >= 50) cnt1++;
			else if (age >= 30) cnt2++;
			else cnt3++;
			
		}
		System.out.println();
		
		System.out.println("50대 이상 : " + cnt1 + " 명");
		System.out.println("30대 이상 : " + cnt2 + " 명");
		System.out.println("그 외 : " + cnt3 + " 명");
		
		
	}
}
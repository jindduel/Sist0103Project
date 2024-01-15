package day0108;

import java.util.Scanner;

public class Quiz_18 {
	
	public static void main(String[] args) {
		quiz_1();
		quiz_2();
		quiz_3();
	}
	
	public static void quiz_1() {
		//1. 반복해서 숫자를 입력하여 양수의 갯수와 음수의 갯수를 구하시오
		Scanner sc = new Scanner(System.in);
		
		int n;
		int cnt1 = 0, cnt2 = 0;
		

		System.out.println("숫자를 입력해주세요.");
		while (true) {
			n = sc.nextInt();
			
			if(n == 0) break;
			
			if(n > 0) cnt2++;
			else cnt1++;
			
		}
		
		System.out.println("음수 : " + cnt1 +  ", 양수 : " + cnt2);
		System.out.println("");
		
	}
	
	public static void quiz_2() {
		//2. 반복해서 점수를 입력하고 갯수 합계 평균 구하기
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, cnt = 0;
		int n;
		while(true) {
			System.out.print("점수 : ");
			n = sc.nextInt();
			
			if(n == 0) break;
			
			if(n < 0 || n > 100) {
				System.out.println("잘못 입력했습니다. ");
				continue;
			}
			
			sum += n;
			cnt++;
		}
		System.out.println();
		
		double avg = (double)sum / cnt;
		
		System.out.println("갯수 : " + cnt);
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("");
		
	}
	
	public static void quiz_3() {
		//
		
	}
}

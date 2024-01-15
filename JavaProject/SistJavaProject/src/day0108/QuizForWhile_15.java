package day0108;

import java.util.Scanner;

public class QuizForWhile_15 {
	public static void main(String[] args) {
		test4();
	}
	
	public static void test1() {
		//문제 1 : 1 ~ 100까지 3의 배수 갯수 출력
		int cnt = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) cnt++;
		}
		
		System.out.println("3의 배수 갯수 : " + cnt + "개");
	}
	
	public static void test2() {
		//문제 2 : 1 ~ 100짜기의 짝수 랍 구하기
		int i = 1;
		int sum = 0;
		while(true) {
			if(i % 2 == 0) sum += i;
			if(i >= 100) break;
			i++;
		}
		
		System.out.println("1 ~ 100까지 짝수 합 : " + sum);
	}
	
	public static void test3() {
		//문제 3 : 1 ~ 100까지의 홀수 합 구하기
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) sum += i;
		}
		
		System.out.println("1 ~ 100까지 홀수 합 : " + sum);
	}
	
	public static void test4() {
		/*
		 * 1번 점수 : 80
		 * .
		 * .
		 * .
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int arr[];
		int n, sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 점수 : ");
			n = sc.nextInt();
			
			if(n < 0 || n > 100) {
				System.out.println("잘못 입력했습니다. ");
				i--;
				continue;
			}
			
			sum += n;
			
		}
		
		
		System.out.println("총점 : " + sum + "점");
	}
}

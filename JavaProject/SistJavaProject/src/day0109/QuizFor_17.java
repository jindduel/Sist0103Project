package day0109;

import java.util.Scanner;

public class QuizFor_17 {
	public static void main(String[] args) {
		quiz1();
		quiz2();
		quiz3();
	}
	
	public static void quiz1() {
		// 팩토리얼 구하기
		// 숫자를 입력하여 해당 숫자에 대한 팩토리얼 구하기
		
		Scanner sc = new Scanner(System.in);
		int f = 1;
		
		System.out.print("수를 입력해주세요. ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		
		System.out.println(n + "! : " + f);
		System.out.println();
	}
	
	public static void quiz2() {
		// 두 수 x y를 입력 후 x의 y승 출력

		Scanner sc = new Scanner(System.in);
		int x, y;
		int n = 1;
		
		System.out.print("두 수를 입력해주세요. ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i = 0; i < y; i++) {
			n *= x;
		}
		
		System.out.println(x + "의 " + y + "승 : " + n);
		System.out.println();
	}

	public static void quiz3() {
		// 1 ~ 100까지의 숫자 중 짝수의 합과 홀수의 합을 나눠서 출력

		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) sum1 += i;
			else sum2 += i;
		}
			
		System.out.println("짝수 합 : " + sum1);
		System.out.println("홀수 합 : " + sum2);
		System.out.println();
			
	}
}

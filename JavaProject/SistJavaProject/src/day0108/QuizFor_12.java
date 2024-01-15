package day0108;

import java.util.Scanner;

public class QuizFor_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 출력 : 1 2 4 5 7 8 10 (continue 활용)");
		for (int i = 0; i <= 10; i++) {
			if(i % 3 == 0) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("2. 출력 : 홀수 값 : 1  ... 홀수 값 : 9");
		for (int i = 0; i <= 10; i++) {
			if(i % 2 == 1) System.out.print("홀수 값 : " + i + " ");
		}
		System.out.println("\n");
		
		System.out.println("3. 점수 입력 후 합계 출력 (0 입력시 종료)");
		int sum = 0;
		int n;
		
		while(true) {
			System.out.println("점수를 입력하세요. ");
			n = sc.nextInt();
			if(n == 0) break;
			if(n < 0 || n > 100) {
				System.out.println("다시 입력해주세요. (1 ~ 100)");
				continue;
			}
			sum += n;
		}
		System.out.println("합계 : " + sum + " 점");
	}
}
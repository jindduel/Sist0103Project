package day0108;

import java.util.Scanner;

public class Factorial_13 {
	public static void main(String[] args) {
		// 1 ~ 10까지의 팩토리얼 구하기
		
		int result = 1;
		for(int i = 1; i <= 10; i++) {
			result *= i;
			System.out.println(i + "! : " + result);
		}
		System.out.println("\n");
		
		// Q. 합계를 구할 숫자를 입력하면 1 ~ 입력한 숫자까지의 합을 구하시오
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자를 입력해주세요. ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) sum += i;
		
		System.out.println(n + "까지의 합계 : " + sum);
	}
}

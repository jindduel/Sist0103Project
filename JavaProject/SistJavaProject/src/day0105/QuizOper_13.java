package day0105;

import java.util.Scanner;

public class QuizOper_13 {
	public static void main(String[] args) {
		// 3개의 숫자를 입력하여 가장 큰 값을 구하시오.
		// if & 삼항
		/*
		 * 3개의 숫자를 입력하시오.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int max1, max2;
		
		System.err.println("세 개의 숫자를 입력하시오. ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b && a > c) max1 = a;
		else if (b > a && b > c) max1 = b;
		else max1 = c;
		
		max2 = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
		
		System.out.println("가장 큰 값은 " + max1 + "입니다.");
		System.out.println("가장 큰 값은 " + max2 + "입니다.");
		
		
		
		
	}
}

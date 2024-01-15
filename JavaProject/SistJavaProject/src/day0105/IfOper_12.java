package day0105;

import java.util.Scanner;

public class IfOper_12 {
	public static void main(String[] args) {
		// 삼항연산자(조건연산자)
		// 형식조건식 ? 참 : 거짓
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int max;
		
		System.out.print("두 개의 숫자를 입력하세요. ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("입력한 두 수는 " + x + ", " + y + "입니다. ");
		
//		if (x > y) max = x;
//		else max = y;
		
		max = x > y ? x : y;
		
		System.out.println("두 수 중 더 큰 값은 " + max + "입니다. ");
		
		System.out.println("첫번째 수가 더 " + (x > y ? "큽니다." : "작습니다. "));
		
		
	}
}

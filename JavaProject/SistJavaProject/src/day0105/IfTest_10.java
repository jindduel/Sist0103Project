package day0105;

import java.util.Scanner;

public class IfTest_10 {
	public static void main(String[] args) {
		// 숫자 하나를 입력하여 결과를 출력하시오.
		/*
		 * 좋아하는 숫자를 입력해주세요.
		 * 
		 * 
		 * 그 숫자는 홀수입니다.
		 * 다음에 만나요.
		 */
		
		Scanner sc = new  Scanner(System.in);
		
		int n;
		String msg;
		
		System.out.print("좋아하는 숫자를 입력해주세요. ");
		n = sc.nextInt();
		
		System.out.println("if");
		if(n % 2 == 0) System.out.println("그 숫자는 짝수입니다.");
		else System.out.println("그 숫자는 홀수입니다.");
		System.out.println("다음에 만나요.");
		
		//switch
		System.out.println("switch");
		switch (n % 2) {
		case 0: 
			System.out.println("그 숫자는 짝수입니다.");
			break;
		case 1:
			System.out.println("그 숫자는 홀수입니다.");
			break;
		default:
			
		}

	}
}

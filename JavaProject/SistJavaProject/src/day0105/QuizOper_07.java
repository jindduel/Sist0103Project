package day0105;

import java.util.Scanner;

public class QuizOper_07 {
	public static void main(String[] args) {
		// 여러분이 받은 알바비를 입력한 후 만원, 천원, 백원, 십원, 일원의 갯수를 출력
		/*
		 * 알바비는 ? 568712
		 * 
		 * 만원 : 56
		 * 천원 : 
		 * 백원 : 
		 * 십원 : 
		 * 일원 :
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알바비는? ");
		int x = sc.nextInt();
		
		System.out.println("만원 : " + (x / 10000));
		System.out.println("천원 : " + ((x % 10000) / 1000));
		System.out.println("백원 : " + ((x % 1000) / 100));
		System.out.println("십원 : " + ((x % 100) / 10));
		System.out.println("일원 : " + (x % 10));
	}
}

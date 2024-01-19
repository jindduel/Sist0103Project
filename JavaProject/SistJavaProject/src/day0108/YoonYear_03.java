package day0108;

import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class YoonYear_03 {
	public static void main(String[] args) {
		/*
		 * 1. 연도가 4의 배수이면 윤년
		 * 2. 100의 배수가 아니면 평년
		 * 3. 400의 배수이면 윤년
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.print("연도를 입력해주세요. ");
		year = sc.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 
			System.out.println("올해는 윤년입니다.");
		else 
			System.out.println("올해는 평년입니다. ");
		
		
	}
}

package day0105;

import java.util.Scanner;

public class SwitchMonth_18 {
	public static void main(String[] args) {
		//월을 입력받아 
		//2월은 28, 29일까지 있습니다.
		//4, 6, 9, 11 -> 30일까지 있습니다.
		//1, 3, 5, 7, 8, 10, 12 -> 31일까지 있습니다.
		//없는 달은 존재하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		
		int month;
		
		System.out.print("월을 입력해주세요. ");
		month = sc.nextInt();
		
		switch (month) {
		case 2:
			System.out.println("28 or 29일까지 있습니다. ");
			break;
		case 4, 6, 9, 11 :
			System.out.println("30일까지 있습니다. ");
			break;
		case 1, 3, 5, 7, 8, 10, 12 :
			System.out.println("31일까지 있습니다. ");
			break;
		default:
			System.out.println("해당 월은 존재하지 않습니다.");
			break;
		}
		
		
	}
}

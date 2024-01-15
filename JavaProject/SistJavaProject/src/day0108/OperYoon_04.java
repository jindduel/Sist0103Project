package day0108;

import java.util.Scanner;

public class OperYoon_04 {
	public static void main(String[] args) {
		//윤년 : year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
		//윤년? 평년? / 해당 달이 몇 일까지 있는지
		Scanner sc = new Scanner(System.in);
		
		int year, month, day;
		boolean flag;
		
		System.out.print("연도를 입력해주세요. ");
		year = sc.nextInt();
		System.out.print("월을 입력해주세요. ");
		month = sc.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("잘못입력했습니다.");
			return;
		}
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			flag = true;
		else 
			flag = false;
		
		if(month == 2) {
			if(flag) day = 29;
			else day = 28;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) day = 30;
		else day = 31;
		
		System.out.println(year + "년도는 " + (flag ? "윤년" : "평년") + "입니다.");
		System.out.println(year + "년 " + month + "월은 " + day + "일까지 있습니다.");
		
		
		
		
		
		
	}
}
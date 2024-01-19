package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizMyAgeInOut_08 {
	public static void main(String[] args) {
		/*
		 * 당신의 이름은? 이수연
		 * 당신이 태어난 연도는? 1988
		 * 당신이 사는 지역은? 경기
		 * 
		 * =====================
		 * [이수연 님의 개인정보]
		 * =====================
		 * 이름 : 이수연
		 * 태어난 연도 : 1988
		 * 나이 : **세
		 * 지역 : 경기
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		String name, add;
		int myYear, age;
		
		System.out.print("당신의 이름은? ");
		name = sc.nextLine();
		System.out.print("당신이 태어난연도는? ");
		myYear = Integer.parseInt(sc.nextLine());
		System.out.print("당신이 사는 지역은? ");
		add = sc.nextLine();

		int year = cal.get(cal.YEAR);
		age = year - myYear;
		
		System.out.println("=====================");
		System.out.println("[" + name + " 님의 개인정보]");
		System.out.println("=====================");
		System.out.println("이름 : " + name);
		System.out.println("태어난연도 : " + myYear + " 년생");
		System.out.println("나이 : " + age + " 세");
		System.out.println("지역 : " + add);
	}
}

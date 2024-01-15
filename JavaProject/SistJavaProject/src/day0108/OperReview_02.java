package day0108;

import java.util.Calendar;
import java.util.Scanner;

public class OperReview_02 {
	public static void main(String[] args) {
		// 띠 : 원숭이부터 시작
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		String name, n;
		int myYear, age, year;
		
		System.out.print("이름을 입력해주세요. ");
		name = sc.nextLine();
		System.out.print("태어난 연도를 입력해주세요. ");
		myYear = sc.nextInt();
		year = cal.get(cal.YEAR);
		age = year - myYear;
		
		n = myYear % 12 == 0 ? "원숭이" :
			myYear % 12 == 1 ? "닭" :
			myYear % 12 == 2 ? "개" :
			myYear % 12 == 3 ? "돼지" :
			myYear % 12 == 4 ? "쥐" :
			myYear % 12 == 5 ? "소" :
			myYear % 12 == 6 ? "호랑이" :
			myYear % 12 == 7 ? "토끼" :
			myYear % 12 == 8 ? "용" :
			myYear % 12 == 9 ? "뱀" :
			myYear % 12 == 10 ? "말" : "양";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("띠 : " + n + "띠");
		
	}
}

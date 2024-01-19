package day0104;

import java.util.Calendar;

public class CalAge_12 {
	public static void main(String[] args) {
		// 실행 단계에서 변수 입력하여 이름, 태어난 연도를 입력하여 나이를 출력
		
		//1. import
		//2. 변수
		//3. 계산
		//4. 출력
		
		Calendar calender = Calendar.getInstance();
		String name = args[0];
		int curYear = calender.get(calender.YEAR); //현재 년도
		int myYear = Integer.parseInt(args[1]);
		
		int myAge = curYear - myYear;
		
		System.out.println("이름 : " + name);
		System.out.println("태어난 년도 : " + myYear + " 년생");
		System.out.println("나이 : " + myAge);
		
		
		
	}
}

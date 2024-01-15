package day0109;

import java.util.Scanner;

public class StringIn_01 {
	public static void main(String[] args) {
		// 이름을 입력해서 김씨가 몇명인지 종료 입력시 종료
		Scanner sc = new Scanner(System.in);
		
		String name;
		int cnt = 0;
		
		while(true) {
			System.out.print("이름(종료 입력시 종료) : ");
			name = sc.nextLine();
			
			if(name.equals("종료")) break;
			
			if(name.startsWith("김")) cnt++;
			
		}
		
		System.out.println("김 씨 성을 가진 사람은 총 " + cnt + "명 입니다.");
		
	}
}

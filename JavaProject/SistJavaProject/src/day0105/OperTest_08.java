package day0105;

import java.util.Scanner;

public class OperTest_08 {
	public static void main(String[] args) {
		// 신체검사 시 필요한 정보(이름, 키, 몸무게) 입력시 표준 몸무게 출력 (키 - 100) * 0.9 / 표준 몸무게를 소숫점 한자리로 출력
		/*
		 * 이름을 입력해주세요. 
		 * 키를 입력해주세요. 
		 * 몸무게를 입력해주세요.
		 * 
		 * * 님의 표준몸무게는 *kg 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int x, y;
		double z;
		
		System.out.print("이름을 입력해주세요. ");
		name = sc.nextLine();
		System.out.print("키를 입력해주세요. ");
		x = sc.nextInt();
		System.out.print("몸무게를 입력해주세요. ");
		y = sc.nextInt();
		
		z = (x - 100) * 0.9;
		
		System.out.println("====================");
		System.out.printf("%s 님의 권장 표준 몸무게는 %.1fKg 입니다.", name, z);
		
	}
}	

package day0108;

import java.util.Scanner;

public class ForGugu_14 {
	public static void main(String[] args) {
//		for(int i = 2; i <= 9; i++) {
//			System.out.println("** " + i + "단 **");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//			System.out.println();
//		}
		
//		loop1 :
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				if(j >= 5) break loop1;
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		System.out.println("Q. 단을 입력하면 해당 단이 나오게 해주세요. (2단 ~ 9단)");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("단을 입력해주세요. ");
//			int n = sc.nextInt();
//			
//			if(n == 0) {
//				System.out.println("프로그램을 종료합니다. ");
//				break;
//			}
//			
//			if(n < 2 || n > 9) {
//				System.out.println("2 ~ 9 사이의 숫자를 입력해주세요.");
//				continue;
//			}
//			
//			System.out.println("[ " + n + "단 ]");
//			for(int i = 1; i <= 9; i++) System.out.println(n + " x " + i + " = " + (n * i));
//			
//			System.out.println("\n");
//		}
//		System.out.println();
		
		System.out.println("가로 방향으로 구구단 출력");
		//ex) [2단] [3단] [4단]
		for(int i = 1; i <= 9; i++) {
			if(i == 1) {
				for(int j = 2; j <= 9; j++) System.out.print("　　[ " + j + "단 ]　　　");
				System.out.println();
			}
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %2d   ", j, i, (j * i));
			}
			System.out.println();
		}
		
		
	}
}
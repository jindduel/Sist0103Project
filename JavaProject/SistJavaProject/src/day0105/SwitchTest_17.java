package day0105;

import java.util.Scanner;

public class SwitchTest_17 {
	public static void main(String[] args) {
		//
		
		Scanner sc = new Scanner(System.in);
		
		int a = 3;
		
		switch(a) {
			case 1: System.out.println("a is 1");
				break;
			case 2: System.out.println("a is 2");
				break;
			case 3: System.out.println("a is 3");
				break;
			case 4: System.out.println("a is 4");
				break;
			case 5: System.out.println("a is 5");
				break;
			default : System.out.println("a is 입력값 없음");
		}
		
		char b = 'C';
		
		switch(a) {
			case 'A': System.out.println("Apple");
				break;
			case 'B': System.out.println("Banana");
				break;
			default : System.out.println("사과 바나나가 아니다");
		}
		
		String msg = "Happy";
		switch (msg) {
		case "Hello": 
			System.out.println("msg는 Hello다.");
			break;
		case "Happy": 
			System.out.println("msg는 Happy다.");
			break;
		case "Hi": 
			System.out.println("msg는 Hi다.");
			break;
		default:
			System.out.println("인사 안함");
		}
	}
}

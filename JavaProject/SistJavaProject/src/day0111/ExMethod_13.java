package day0111;

import javax.xml.crypto.KeySelector.Purpose;

/*
 * 메소드 : 접근제한자(public) + 지정예약어(static) + 결과형값 리턴(void) + 메서드명()
 * 반복적인 코드를 줄여 코드 관리가 쉬움
 * 하나의 메소드는 한가지 기능만을 수행
 */


public class ExMethod_13 {
	
	public static boolean aaa() {
		return false;
	}
	
	public static int bbb() {
		return 11;
	}
	
	public static int ccc(int x, int y) {
		int z = x + y;
		return z;
	}
	
	//메소드는 오버로딩이 가능
	public static int sum(int a, int b) {
		System.out.println("1번째 sum 함수 호출");
		return a + b;
	}
	
	public static double sum(int a, double b) {
		System.out.println("2번째 sum 함수 호출");
		return a + b;
	}
	
	public static double sum(double a, int b) {
		System.out.println("3번째 sum 함수 호출");
		return a + b;
	}
	
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public static double square(double num) {
		return num * num;
	}
	
	public static void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다. ");
			return;
		}
		System.out.println("나눗셈의 결과 : " + num1 / num2);
	}
	
	public static void main(String[] args) {
		boolean a = aaa();
		System.out.println("a : " + a);
		
		int b = bbb();
		System.out.println("b : " + b);
		
		int c = ccc(20, 30);
		System.out.println("c : " + c);
		
		System.out.println(sum(3, 4));
		System.out.println(sum(3, 4.4));
		System.out.println(sum(3.5, 4));
		
		System.out.println("10 * 20 = " + mul(10, 20));
		System.out.println("4.5의 제곱 : " + square(4.5));
		
		divide(4, 2);
		divide(4, 0);
		
		
	}
}
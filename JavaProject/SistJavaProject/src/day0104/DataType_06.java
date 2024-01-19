package day0104;

public class DataType_06 {
	public static void main(String[] args) {
		//==기본 자료형 8개==
		
		//1. 논리형 
		//true, false
		boolean flag = false; 
		
		//2. 문자형 
		//반드시 하나의 문자
		//16바이트 유니코드값 표현
		//2바이트 문자 하나
		//기본적으로 정수형, 아스키코드 값 변경 가능
		//''로 표현
		char ch = '가'; 
		
		//3. 정수형
		byte a = 127; //1바이트 -128 ~ 127
		short b = 32000; //16bit
		int c = 1234; //32bit
		long d = 100L; //64bit 뒤에 L, l을 붙혀 long인지 int인지 구별
		
		//4. 실수
		float f = 3.12f; //32bit 뒤에 f를 붙힘 생략시 double
		double dou = 1.23; //64bit 소수점 가진 숫자
		
		//출력
		System.out.println("flag = " + flag);
		System.out.println("ch = " + ch);
		System.out.println("정수 a = " + a);
		System.out.println("정수 b = " + b);
		System.out.println("정수 c = " + c);
		System.out.println("정수 d = " + d);
		System.out.println("실수 f = " + f);
		System.out.println("실수 dou = " + dou);
		
	}
}

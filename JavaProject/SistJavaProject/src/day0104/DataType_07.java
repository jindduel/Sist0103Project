package day0104;

public class DataType_07 {
	public static void main(String[] args) {
		
		byte a = (byte)128;//디모션 : 더 작은 자료형으로의 변화느 값 손실
		byte b = 127;
		
		System.out.println(a);
		System.out.println(b);
		
		//강제형변환(cast연산자)을 올바르게 사용하는 경우
		int x = 7;
		int y = 4;
		
		System.out.println(x / y); //정수형끼리의 계산하면 정수형이 나옴
		System.out.println((double)x / y); //계산시 x를 double로 변환해서 계산하면 실수형이 나옴
		System.out.println(x / (double)y); //수식 중 한개만 실수형이여도 결과는 실수형
		
		//형변환
		double d = 100.0;
		int i = 100;
		int result = (int)d + i;
		double result2 = d + i;
		
		System.out.println("d = " + d);
		System.out.println("i = " + i);
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
		
		
	}
}

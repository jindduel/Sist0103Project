package day0104;

public class DataType_08 {
	public static void main(String[] args) {
		//묵시적형변환 : 자동으로 결정되는 타입
		//String + int = String
		//double + int = double
		//long + short = long
		//char + int = int
		
		char a = 'A'; //A의 아스키코드는 65
					  //char는 내부적으로 아스키코드 값으로 인식
		System.out.println(a + 32);
		System.out.println("Happy" + 5 + 6);
		System.out.println("Happy" +(5 + 6)); //괄호 먼저 계산
		System.out.println('A' + 3);
		System.out.println(2 + 'b');
		System.out.println('a' + 'b');
		
		
	}
}

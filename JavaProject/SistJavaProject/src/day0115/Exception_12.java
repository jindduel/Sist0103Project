package day0115;

public class Exception_12 {
	public static void main(String[] args) {
		//
		
		System.out.println("프로그램 시작");
		try { //예외가 발생할 수 있는 코드를 넣음
			int num = 3 / 0; //정수를 0으로 나누면 에러
		} catch (ArithmeticException e) {
			//예외 처리 코드
			//e.printStackTrace(); //자세한 예외 정보 출력
			e.getMessage();
		}
		System.out.println("프로그램 종료");
		
		
	}
}
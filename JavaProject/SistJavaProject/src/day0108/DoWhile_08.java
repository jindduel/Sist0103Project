package day0108;

public class DoWhile_08 {
	public static void main(String[] args) {
		//선 조건
		
		System.out.println("**While문 결과"); //조건이 맞지 않으면 아예 출력이 되지 않음
		int n = 1;
		while (n < 5) System.out.println(n++);
		
		System.out.println("**Do-While문 결과");
		n = 1;
		do {
			System.out.println(n++);
		} while(n <= 5); //조건이 맞지 않아도 먼저 1번 실행됨
	}
}

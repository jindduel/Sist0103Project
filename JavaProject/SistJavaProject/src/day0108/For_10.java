package day0108;

public class For_10 {
	public static void main(String[] args) {
		
		int i;
		for(i = 1; i <= 10; i++) System.out.print(i + " ");
		System.out.println("\n");
		System.out.println("for문을 빠져나온 i의 값 : " + i);
		System.out.println("\n");
		
		int a = 10;
		for(; a <= 50; a+=5) System.out.print(a + " ");
		System.out.println("\n");
		System.out.println("빠져나온 a 값 : " + a);
		System.out.println("\n");
		
		//1 ~ 10 중 짝수 출력
		for(int n = 1; n <= 10; n++) {
			if (n % 2 == 0) System.out.print(n + " ");
		}
		System.out.println("\n");
		
		for(int n = 1; n <= 10; n++) {
			if (n % 2 == 1) continue;
			System.out.print(n + " ");
		}
		System.out.println("\n");
		
	}
}

package day0109;

public class MathRandom_04 {
	public static void main(String[] args) {
		//자바 난수
		
		System.out.println("기본 랜덤 수 5개 발생");
		
		for(int i = 0; i < 5; i++) {
			double a = Math.random();
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("0 ~ 9 사이의 랜덤 수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = (int)(Math.random() * 10);
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("0 ~ 99 사이의 랜덤 수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = (int)(Math.random() * 100);
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("1 ~ 10 사이의 랜덤 수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = (int)(Math.random() * 10) + 1;
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("1 ~ 100 사이의 랜덤 수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = (int)(Math.random() * 100) + 1;
			System.out.println(a);
		}
		
	}
}
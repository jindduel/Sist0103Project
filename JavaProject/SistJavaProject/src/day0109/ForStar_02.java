package day0109;

public class ForStar_02 {
	public static void main(String[] args) {
		
		System.out.println("** 다중 for문으로 star(*) 출력하기 **");
		
		System.out.println("1번");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n2번");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n3번");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

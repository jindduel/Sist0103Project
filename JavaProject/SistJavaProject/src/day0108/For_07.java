package day0108;

public class For_07 {
	public static void main(String[] args) {
		//while for 비교
		
		//while
		System.out.println("**while문 10 ~ 0");
		int i = 10;
		
		while(i >= 0) System.out.print(i-- + " ");
		System.out.println();

		System.out.println("**while문 1 ~ 10");
		i = 1;
		while(i <= 10) System.out.print(i++ + " ");
		System.out.println();
		
		System.out.println("**while문 5 4 3 2 1");
		i = 5;
		while(i > 0) System.out.print(i-- + " ");
		System.out.println();
		
		//for
		System.out.println("**for문 10 ~ 0");
		for(i = 10; i >= 0; i--) System.out.print(i + " ");
		System.out.println();
		
		System.out.println("**for문 1 ~ 10");
		for(i = 1; i <= 10; i++) System.out.print(i + " ");
		System.out.println();
		
		
		System.out.println("**for문 1, 4, 7, 10");
		for(i = 1; i <= 10; i +=3) System.out.print(i + " ");
		System.out.println();
		
		System.out.println("**for문 5 4 3 2 1");
		for(i = 5; i > 0; i--) System.out.print(i + " ");
		System.out.println();
		
		System.out.println("**for문 HelloJava 5번 반복");
		for(i = 0; i < 5; i++) System.out.println("HelloJava");
		System.out.println();
		
	}
}
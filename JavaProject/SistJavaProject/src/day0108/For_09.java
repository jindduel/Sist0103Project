package day0108;

public class For_09 {
	public static void main(String[] args) {
		// 가로로 1 ~ 10
		for(int i = 1; i <= 10; i++) System.out.print(i + " ");
		System.out.println();
		
		// 가로로 10 ~ 1
		for(int i = 10; i >= 1; i--) System.out.print(i + " ");
		System.out.println();
		
		//배수
		for(int i = 0; i <= 50; i += 5) System.out.print(i + " ");
		System.out.println();
		
		//continue
		for(int i = 1; i <= 20; i++) {
			if(i % 5 == 0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}
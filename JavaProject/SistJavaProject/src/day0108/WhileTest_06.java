package day0108;

public class WhileTest_06 {
	public static void main(String[] args) {
		// 1 ~ 10 반복출력
		int n = 0;
		
		while(n < 10) {
			n++;
			System.out.printf("%4d", n);
		}
		
		System.out.println();
		
		n = 0;
		
		while(n < 10) {
			System.out.printf("%4d", ++n);
		}
		
		System.out.println();
		
		n = 0;
		while(true) {
			System.out.printf("%4d", ++n);
			if(n >= 10) break;
		}
		
	}
}
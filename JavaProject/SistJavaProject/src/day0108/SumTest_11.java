package day0108;

import javax.annotation.processing.SupportedSourceVersion;

public class SumTest_11 {
	public static void main(String[] args) {
		//반복문 안에서 합계 구하기
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) sum += i;
		
		System.out.println("1 ~ 10까지의 합 : " + sum);
		
		int n = 1;
		int tot = 0;
		
		while(n <= 10) tot += n++;
		
		System.out.println("1 ~ 10까지의 합 : " + tot);
			
		System.out.println("1 ~ 10 까지 2씩 증가, 함계");
		sum = 0;
		for(int i = 1; i <= 10; i+=2) sum += i;
		System.out.println("합 : " + sum);
		System.out.println();
			
	}
			
}

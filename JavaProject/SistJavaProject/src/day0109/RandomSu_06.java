package day0109;

import java.util.Scanner;

public class RandomSu_06 {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 난수 발생, 맞추기
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random() * 100) + 1;
		int n;
		int cnt = 0;
		
		while(true) {
			cnt++;
			
			System.out.print(cnt + " : ");
			n = sc.nextInt();
			
			if(n == rand) {
				System.out.println("정답은 " + rand + " 입니다. ");
				break;
			}
			
			if(n > rand) System.out.println(n + "보다 작습니다. ");
			else System.out.println(n + "보다 큽니다. ");
		}
		
	}
}

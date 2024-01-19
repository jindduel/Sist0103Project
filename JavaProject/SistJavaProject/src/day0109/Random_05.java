package day0109;

import java.util.Random;

public class Random_05 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("0 ~ 9 사이의 난수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = rand.nextInt(10);
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("0 ~ 99 사이의 난수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = rand.nextInt(100);
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("1 ~ 10 사이의 난수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = rand.nextInt(10) + 1;
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("64 ~ 90 사이의 난수 5개 발생");
		for(int i = 0; i < 5; i++) {
			int a = rand.nextInt(26) + 65;
			System.out.println((char)a);
		}
		System.out.println();
	}
}

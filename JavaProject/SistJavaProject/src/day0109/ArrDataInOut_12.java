package day0109;

import java.util.Scanner;

public class ArrDataInOut_12 {
	public static void main(String[] args) {
		//배열 생성 후 생성한만큼의 입력 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[5];
		int sum = 0;
		
		for(int i = 0; i < data.length; i++) {
			System.out.print((i + 1) + "번째 값 : ");
			data[i] = sc.nextInt();
			sum += data[i];
		}
		System.out.println();
		
		System.out.println("** 입력 값 확인 **");
		for(int i : data) System.out.print(i + " ");
		System.out.println("\n=================");
		System.out.println("합계 : " + sum);
		
		
	}
}

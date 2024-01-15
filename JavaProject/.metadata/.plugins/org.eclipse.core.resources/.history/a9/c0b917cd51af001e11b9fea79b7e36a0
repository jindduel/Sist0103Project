package day0110;

import java.util.Scanner;

public class ArraySearchNum_01 {
	public static void main(String[] args) {
		//배열 중에 숫자 찾기
		//있으면 번지수 없으면 없다 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] data = {2, 12, 99,65, 47, 87, 32, 55, 66, 49, 91, 120, 259};
		boolean sw;
		int n;
		
		while(true) {
			System.out.print("검색할 숫자 입력 : ");
			n = sc.nextInt();
			
			if(n == 0) break;
			
			sw = false;
			
			for(int i = 0; i < data.length; i++) {
				if(n == data[i]) {
					sw = true;
					System.out.println((i + 1) + "번째 값\n");
				}
			}
			
			if(!sw) System.out.println(n + "은 데이터에 없습니다. \n");
			
		}
	}
}

package day0110;

import java.util.Scanner;

public class ArraySearchName_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"홍길동" , "김길동", "최길동", "김재석", "홍재석", "강호동", "이호동", "유호동"};
		
		boolean sw = false;
		String s;
		
		while(true) {
			sw = false;
			
			System.out.print("찾는 이름을 입력해주세요. ");
			s = sc.nextLine();
			
			if(s.equals("0")) break;
			
			for(int i = 0; i < name.length; i++) {
				if(name[i].equals(s)) {
					sw = true;
					System.out.println((i+1) + "번째 값입니다. ");
				}
			}
			
			if(!sw) System.out.println(s + "은 데이터에 없습니다.");
		}
		
		System.out.println("종료");
	}
}
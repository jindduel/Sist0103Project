package day0105;

import java.util.Scanner;

public class Equal_15 {
	public static void main(String[] args) {
		//문자열 비교는 관계연산자로 이용x 
		//equals()라는 메서드를 이용
		
		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.println("영어단어를 입력해주세요. ");
		System.out.println("ex) happy, rose, dragon, angel, music");
		word = sc.nextLine();
		
		System.out.println("입력한 단어 : " + word);
		
		if(word.equals("angel")) System.out.println("천사");
		else if(word.equalsIgnoreCase("happy")) System.err.println("행복하다");
		else if(word.equalsIgnoreCase("rose")) System.err.println("장미");
		else if(word.equalsIgnoreCase("dragon")) System.err.println("용");
		else if(word.equalsIgnoreCase("music")) System.err.println("음악");
		else System.out.println("한글 단어가 등록되지 않았어요.");
		
		
	}
}

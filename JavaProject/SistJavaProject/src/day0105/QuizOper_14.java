package day0105;

import java.util.Scanner;

public class QuizOper_14 {
	public static void main(String[] args) {
		// 90점 : 매우 잘함 / 80점 : 잘함 / 70점 : 좀 더 노력 / 그 이하 : 꽝
		/* 
		 * 이름을 입력해주세요. 
		 * 김민아
		 * 자바 시험 점수를 입력해주세요. 
		 * 88
		 * 
		 * ============================
		 * 김민아 님의 시험 결과는 잘함 입니다.
		 * 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name, ifMsg, sMsg;
		int score;
		
		System.out.print("이름을 입력해주세요. ");
		name = sc.nextLine();
		System.out.print("자바 시험 점수를 입력해주세요. ");
		score = sc.nextInt();
		
		if(score >= 90) ifMsg = "매우 잘함";
		else if(score >= 80) ifMsg = "잘함";
		else if(score >= 70) ifMsg = "좀 더 노력";
		else ifMsg = "꽝";
		
		sMsg = score >= 90 ? "매우 잘함" : 
				score >= 80 ? "잘함" :
				score >= 70 ? "좀 더 노력" : "꽝";
				
				
		System.out.println("============================");		
		System.out.println(name + " 님의 시험 평가는 " + ifMsg + "입니다. ");
		System.out.println(name + " 님의 시험 평가는 " + sMsg + "입니다. ");
		System.out.println("============================");
		
		
		
		
	}
}

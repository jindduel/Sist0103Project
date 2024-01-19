package day0105;

import java.util.Scanner;

public class QuizOper_19 {
	public static void main(String[] args) {
		/*
		 * (평가는 90점 : 참 잘함! / 80점 : 좀 더 노력 / 나머지 : 불합격)
		 * 이름을 입력하세요. 
		 * 손흥민
		 * 국, 영, 수 점수를 입력하세요.
		 * 88
		 * 99
		 * 77
		 * 
		 * ========================
		 * [손흥민 님의 기말고사 성적]
		 * 총점 : **점
		 * 평균 : **.*점
		 * 평가 : 좀 더 노력하세요
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int score1, score2, score3;
		int  sum;
		double avg;
		
		
		System.out.print("이름을 입력하세요. ");
		name = sc.nextLine();
		
		System.out.println("국, 영, 수 점수를 입력해주세요.");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();
		
		sum = score1 + score2 + score3;
		avg = sum / 3.0;
		
		System.out.println("========================");
		System.out.println("[" + name + " 님의 기말고사 성적]");
		System.out.println("총점 : " + sum + "점");
		System.out.printf("평균 : %.1f 점\n", avg);
		System.out.print("평가 : ");
		
		
		if(avg >= 90) 
			System.out.println("참 잘함");
		else if(avg >= 80) 
			System.out.println("좀 더 노력");
		else 
			System.out.println("불합격");
		
		
	}
}

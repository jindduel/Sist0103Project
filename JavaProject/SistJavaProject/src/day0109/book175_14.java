package day0109;

import java.util.Scanner;

public class book175_14 {
	public static void main(String[] args) {
//		int[] score = {84, 90, 96};
//		int sum = 0;
//		
//		for(int i = 0; i < score.length; i++) sum += score[i];
//		System.out.println("총합 : " + sum);
//		
//		double avg = (double)sum / score.length;
//		System.out.println("평균 : " + avg);
		
		//학생명과 점수를 입력
		//입력해준 데이터, 합계, 평균, 등수 출력
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		int [] score;
		int [] rank;
		
		int people;
		int tot = 0;
		
		double avg;
		
		System.out.print("학생 수를 입력해주세요. ");
		people = Integer.parseInt(sc.nextLine());
		
		name = new String[people];
		score = new int[people];
		rank = new int[people];
		
		for(int i = 0; i < people; i++) {
			System.out.print("학생 이름 : ");
			name[i] = sc.nextLine();
			System.out.print("점수 : ");
			score[i] = Integer.parseInt(sc.nextLine());
			tot += score[i];
		}
		
		for(int i = 0; i < people; i++) {
			rank[i] = 1;
			for(int j = 0; j < people; j++) {
				if(score[i] < score[j]) rank[i]++;
			}
		}

		System.out.println();
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("===========================");
		for(int i = 0; i < people; i++) {
			System.out.println(i + "\t" + name[i] + "\t" + score[i] + "\t" + rank[i]);
		}

		avg = (double)tot / people;
		System.out.println("===========================");
		System.out.println("총점 : " + tot + " 점");
		System.out.println("평균 : " + avg + " 점");
		
	}
}

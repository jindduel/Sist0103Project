package day0104;

import java.util.Scanner;

public class KeyboardIn_15 {
	public static void main(String[] args) {
		//이름, 국, 영, 수 점수를 입력하고 결과 출력
		Scanner sc = new Scanner(System.in);
		
		//변수는 미리 선언하거나 입력할때 주어도 됨
		String stuName ;
		int kor, eng, mat;
		int tot;
		double avg;
		
		//입력
		System.out.println("학생명? ");
		stuName = sc.nextLine();
		System.out.println("국 영 수 점수를 입력하시오. ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		System.out.println("-----------------");
		System.out.println("학생명 : " + stuName);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);
	}
}

package day0108;

import java.util.Scanner;

public class OperReview_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math;
		
		
		System.out.print("이름을 입력해주세요. ");
		name = sc.nextLine();
		System.out.print("국 영 수 점수를 입력해주세요. ");
		kor = sc.nextInt();	
		eng = sc.nextInt();	
		math = sc.nextInt();	
		
		double avg = (kor + eng + math) / 3.0;
		
//		System.out.println("3과목의 점수 : " + kor + ", " + eng + ", " + math);
//		System.out.printf("평균 : %.2f\n", avg);
//		
//		System.out.println("*합격 조건 : 평균 60점 이상, 각 과목이 40점 이상");
//		
//		if(avg >= 60 && kor >= 40 && eng >= 40 && math >=40) {
//			System.out.println(name + "님은 합격입니다.");
//		}
//		else System.out.println(name + "님은 불합격입니다.");
		
		System.out.printf("평균 : %5.1f \n", avg);
		System.out.println("평가 : 80점 이상 : 매우 잘함, 70점 이상 : 좀 더 노력, 70미만 : 불합격");
		System.out.println("평가 : " + (avg >= 80 ? "매우 잘함" : avg >= 70 ? "좀 더 노력" : "불합격"));
		
	}
}

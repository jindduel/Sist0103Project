package day0104;

public class QuizDataType_10 {
	public static void main(String[] args) {
		// 변수는 args를 이용할 것
		/*
		 * 학생명 : 김선호 님
		 * 지역 : 부산 
		 * 나이 : 23 세
		 * 
		 * ====================
		 * 김선호님의 자바 정수는 88점  오라클 점수는 77점 총 164점입니다
		 */
		//1. 변수 선언
		//2. 계산
		//3. 출력
		
		String name = args[0];
		String city = args[1];
		int age = Integer.parseInt(args[2]);
		int java = Integer.parseInt(args[3]);
		int oracle = Integer.parseInt(args[4]);
		
		System.out.println("학생명 : " + name + " 님");
		System.out.println("지역 : " + city);
		System.out.println("나이 : " + age + " 세");
		System.out.println("\n====================");
		System.out.println(name + "님의 자바 점수는 " + java + "점  오라클 점수는 " + oracle + "점  총 " + (java + oracle) + "점 입니다.");
	}
}

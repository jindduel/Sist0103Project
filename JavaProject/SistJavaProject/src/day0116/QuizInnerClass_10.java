package day0116;

import java.util.Scanner;

class SawonOuter {
	private String sawonName;
	private int gibonPay, familySu, timeSu;
	
	public void process() {
		//데이터 입력
		InputInner i = new InputInner();
		i.inputData();
		
		//결과 출력
		SudangInner s = new SudangInner();
		s.writeSawonData();
	}
	
	class InputInner {
		public void inputData() {
			Scanner sc = new Scanner(System.in);
			System.out.print("사원명 입력 : ");
			sawonName = sc.nextLine();
			System.out.print("기본급 : ");
			gibonPay = sc.nextInt();
			System.out.print("초과근무시간 : ");
			timeSu = sc.nextInt();
			System.out.print("가족 수 : ");
			familySu = sc.nextInt();
		}
	}
	
	class SudangInner {
		public int getTimeSudang() {
			return timeSu * 30000;
		}
		
		public int getFamilySudang() {
			if(familySu <= 4) return 200000;
			else return 300000;
		}
		
		public int getTax() {
			return (int)(gibonPay * 0.03);
		}
		
		public int getTotalPay() {
			return gibonPay + getFamilySudang() + getTimeSudang() - getTax();
		}
		
		public void writeSawonData() {
			System.out.println("사원명\t기본급\t초과근무\t가족수\t시간수당\t가족수당\t세금\t총급여");
			System.out.println(sawonName + "\t" + gibonPay + "\t" + timeSu + "\t" + familySu + "\t" + 
								getTimeSudang() + "\t" + getFamilySudang() + "\t" + getTax() + "\t" + getTotalPay());
		}
	}
}

public class QuizInnerClass_10 {
	public static void main(String[] args) {
		SawonOuter s = new SawonOuter();
		s.process();
	}
}

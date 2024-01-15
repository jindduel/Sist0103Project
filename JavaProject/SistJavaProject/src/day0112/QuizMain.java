package day0112;

import java.util.Scanner;

class Quiz {
	public static String schoolName;
	String name;
	int java, oracle, html;
	int sum, avg, p;
	
	public Quiz(String name, int java, int oracle, int html) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
	}
	
	public int getTotal() {
		return java + oracle + html;
	}
	
	public double getAverge() {
		return getTotal() / 3.0;
	}
	
	public String getPyungga() {
		if(getAverge() >= 90) return "장학생";
		else if (getAverge() >= 80) return "합격";
		else return "불합격";
	}
	
	public static void printTitle() {
		System.out.println("학교명 : " + schoolName);
		System.out.println("이름\tJAVA\tORACLE\tHTML\t총점\t평균\t평가");
		System.out.println("====================================================");
	}
	
	public void printData() {
		//System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s", name, java, html, getTotal(), getAverge(), getPyungga());
		System.out.println(name + "\t" + java + "\t" + oracle + "\t" + html + "\t" + 
						getTotal() + "\t" + getAverge()  + "\t" + getPyungga());
	}
}


public class QuizMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학교명을 입력해주세요. ");
		Quiz.schoolName = sc.nextLine();
		System.out.print("인원수를 입력해주세요. ");
		int inwon = Integer.parseInt(sc.nextLine());
		
		Quiz[] q = new Quiz[inwon];
		
		for(int i = 0; i < inwon; i++) {
			System.out.print("학생명을 입력해주세요. ");
			String n = sc.nextLine();
			System.out.print("자바 점수를 입력해주세요. ");
			int j = Integer.parseInt(sc.nextLine());
			System.out.print("오라클 점수를 입력해주세요. ");
			int o = Integer.parseInt(sc.nextLine());
			System.out.print("html 점수를 입력해주세요. ");
			int h = Integer.parseInt(sc.nextLine());
			
			q[i] = new Quiz(n, j, o, h);
		}
		
		Quiz.printTitle();
		for(Quiz i : q) i.printData();
		
	}
}

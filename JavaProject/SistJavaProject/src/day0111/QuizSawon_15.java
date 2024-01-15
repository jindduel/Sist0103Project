package day0111;

import java.util.Scanner;

/*
 * [Sawon]
 * 
 * 
 * 총 사원 수 : 2
 * 사원명 : 손흥민
 * 월급여 : 2500000
 * 월수당 : 500000
 * ...
 * 
 * 
 * [쌍용_1월 급여 내역]
 * 사원명 기본급     수당     실수령액 
 * ===============================
 * 손흥민 2500000  500000  2700000
 * 황희찬 1500000  500000  1800000
 */
class Sawon {
	static String hName = "쌍용";
	String name;
	int money;
	int sudang;
	
	
	int getTotalPay() {
		int n = (int)((money + sudang) * 0.9);
		return n;
	}
	
	public static void printTitle() {
		System.out.println("[" + hName + " 01월 급여 내역]");
		System.out.println();
		System.out.println("사원명\t기본급\t수당\t실수령액");
		System.out.println("===============================");
	}
	
	
}

public class QuizSawon_15 {
	
	public static void writeSawon(Sawon[] sawon) {
		Sawon.printTitle();
		for(Sawon s : sawon) {
			System.out.println(s.name + "\t" + s.money + "\t" + s.sudang + "\t" + s.getTotalPay());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직원 수를 입력해주세요. ");
		int inwon = Integer.parseInt(sc.nextLine());
		
		Sawon[] sawon = new Sawon[inwon];
		
		for(int i = 0; i < inwon; i++) {
			sawon[i] = new Sawon();
			
			System.out.print("이름 : ");
			sawon[i].name = sc.nextLine();
			System.out.print("기본급 : ");
			sawon[i].money = Integer.parseInt(sc.nextLine());
			System.out.print("수당 : ");
			sawon[i].sudang = Integer.parseInt(sc.nextLine());
		}
		
		writeSawon(sawon);
	}
}
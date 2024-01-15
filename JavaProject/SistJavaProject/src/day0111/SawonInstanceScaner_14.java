package day0111;

import java.util.Scanner;

/*
 * [직원 1월 급여]
 * 사원명	기본급	자녀수 초과근무시간 가족수당 시간수당  총급여
 * ===============================================
 * 
 * 각각의 셋터 겟터
 * 가족수당 : max 2인 / 인당 5만원
 * 시간수당 : max 10시간 / 초과시간당 3만원 
 * 실수령액 : 기본급 + 가족수당 + 시간수당
 * 
 * 메인에서는 인원수 입력 후 해당 사원에 대한 이름, 기본급, 가족수, 시간 수 입력받고 결과값 출력
 */
class Emp{
	private String sName;
	private int gPay;
	private int fSu;
	private int tSu;
	
	public Emp(String name, int pay, int fsu, int tsu) {
		this.sName = name;
		this.gPay = pay;
		this.fSu = fsu;
		this.tSu = tsu;
	}
	
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getgPay() {
		return gPay;
	}

	public void setgPay(int gPay) {
		this.gPay = gPay;
	}

	public int getfSu() {
		return fSu;
	}

	public void setfSu(int fSu) {
		this.fSu = fSu;
	}

	public int gettSu() {
		return tSu;
	}

	public void settSu(int tSu) {
		this.tSu = tSu;
	}

	int getFamilySudang(){
		int n = 0;
		
		if(fSu >= 2) n = 100000;
		else n = fSu * 50000;
		
		return n;
	}
	
	int getTimeSudang() {
		int n = 0;
		
		if(tSu >= 10) n = 300000;
		else n = tSu * 30000;
		
		return n;
	}
	
	int getTotalPay() {
		int n = gPay + getFamilySudang() + getTimeSudang();
		return n;
	}
	
	public static void printTitle() {
		System.out.println("**쌍용 01월 직원 급여 현황**");
		System.out.println();
		System.out.println("사원명\t기본급\t자녀수\t초과근무\t가족수당\t시간수당\t총급여");
		System.out.println("==============================================================");
	}
}

public class SawonInstanceScaner_14 {
	
	public static void writeEmp(Emp[] emp) {
		Emp.printTitle();
		for(Emp e : emp) {
			System.out.println(e.getsName() + "\t" + e.getgPay() + "\t" + e.getfSu() + "\t" + e.gettSu() + "\t" 
							+ e.getFamilySudang() + "\t" + e.getTimeSudang() + "\t" + e.getTotalPay());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직원 수를 입력해주세요. ");
		int inwon = Integer.parseInt(sc.nextLine());
		
		Emp[] emp = new Emp[inwon];
		
		for(int i = 0; i < inwon; i++) {
			//emp[i] = new Emp();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("기본급 : ");
			int pay = Integer.parseInt(sc.nextLine());
			System.out.print("자녀수 : ");
			int fs = Integer.parseInt(sc.nextLine());
			System.out.print("초과근무시간 : ");
			int time = Integer.parseInt(sc.nextLine());
			emp[i] = new Emp(name, pay, fs, time);
			
//			emp[i].setsName(name);
//			emp[i].setgPay(pay);
//			emp[i].setfSu(fs);
//			emp[i].settSu(time);
		}
		
		writeEmp(emp);
		
	}
}

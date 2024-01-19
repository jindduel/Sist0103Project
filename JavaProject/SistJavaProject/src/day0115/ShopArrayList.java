package day0115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Shop {
	
	private String sangName;
	private int su, dan;
	
	public Shop(String name, int su, int dan) {
			this.sangName = name;
			this.su = su;
			this.dan = dan;
	}

	public String getSangName() {
		return sangName;
	}

	public void setSangName(String sangName) {
		this.sangName = sangName;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public int getTot() {
		int s = this.su * this.dan;
		return s;
	}
	
}

public class ShopArrayList {
	
	List<Shop> list = new ArrayList<Shop>();

	public void ipgo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		String sangName = sc.nextLine();
		System.out.print("수량 : ");
		int su = Integer.parseInt(sc.nextLine());
		System.out.print("단가 : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		Shop sang = new Shop(sangName, su, dan);
		list.add(sang);
		
		System.out.println("현재 입고된 상품 개수 : " + list.size() + "개 입니다. ");
	}
	
	public void jego() {
		System.out.println("** 상품 재고 현황 **");
		System.out.println("번호\t상품명\t상품가격\t수량\t총액");
		System.out.println("===========================================");
		for(int i = 0; i < list.size(); i++) {
			Shop s = list.get(i);
			System.out.println((i + 1) + "\t" + s.getSangName() + "\t" + s.getSu() + "\t" + s.getDan() + "\t" + s.getTot());
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShopArrayList sa = new ShopArrayList();
		int n;
		
		while (true) {
			System.out.println("1. 입고  2. 재고  0. 종료");
			n = Integer.parseInt(sc.nextLine());
			
			if(n == 1) sa.ipgo();
			else if(n == 2) sa.jego();
			else {
				System.out.println("시스템을 종료합니다. ");
				break;
			}
		}
	}
}

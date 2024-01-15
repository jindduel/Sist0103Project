package day0115;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_09 {
	
	List<Board_09> list =  new Vector<Board_09>();
	//제네릭 유형을 클래스로 지정했으므로 데이터를 꺼내고 받을대 클래스여야함
	
	//입력 메소드
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("작성자명 : ");
		String writer = sc.nextLine();
		System.out.print("제목 : ");
		String subject = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board_09 data = new Board_09(writer, subject, content);
		list.add(data);
		
		System.out.println("현재 데이터 갯수 : " + list.size() + " 개");
	}
	
	//출력 메소드
	public void outputData() {
		System.out.println("** IT 교재 목록 **");
		System.out.println("=====================");
		for(int i = 0; i < list.size(); i++) {
			Board_09 b = list.get(i);
			System.out.println("No. " + (i + 1) + "\t작성자 : " + b.getWriter());
			System.out.println("제목 : " + b.getWriter());
			System.out.println("내용 : " + b.getContent());
			System.out.println("---------------------");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VectorBoard_09 v = new VectorBoard_09();
		int n;
		
		
		while (true) {
			System.out.println("1. 입력  2. 출력  0. 종료");
			n = Integer.parseInt(sc.nextLine());
			
			if(n == 1) v.inputData();
			else if(n == 2) v.outputData();
			else {
				System.out.println("시스템을 종료합니다. ");
				break;
			}
		}
		
	}
}

package day0115;

import java.util.Scanner;

interface Command {
	public void write();
}

class Insert implements Command {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 입력합니다. ");
	}
	
}

class List implements Command  {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 출력합니다. ");
	}
	
}

class Modify implements Command  {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 수정합니다. ");
	}
	
}

class Delete implements Command  {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 삭제합니다. ");
	}
	
}

public class inheritBoard_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Command com = null;
		
		int n;
		
		while (true) {
			System.out.println("1. 추가  2. 출력  3. 수정  4. 삭제  5. 그 외 종료");
			System.out.println("=============================================");
			n = sc.nextInt();
			
			switch (n) {
				case 1 :
					com = new Insert();
					break;	

				case 2 :
					com = new List();
					break;

				case 3 :
					com = new Modify();
					break;

				case 4 :
					com = new Delete();
					break;
					
					
				default : 
					System.out.println("프로그램을 종료합니다. ");
					System.exit(0);
					break;
			}
			
			com.write();
		}
		
		
		
		
	}
}
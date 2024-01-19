package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWriter_04 {
	
	Scanner sc;
	FileWriter fw;
	static final String FILENAME = "C:\\SIST0103\\file\\member.txt";
	
	public FWriter_04() {
		sc = new Scanner(System.in);
	}
	
	public void dataWrite() {
		try {
			fw = new FileWriter(FILENAME, true);
			
			//키보드로 이름, 주소, 번호 입력 후 파일에 저장
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("주소 : ");
			String add = sc.nextLine();
			System.out.print("연락처 : ");
			String hp = sc.nextLine();
			
			System.out.println("**파일 저장! 파일을 확인하세요**");
			fw.write("회원명 : " + name + "\n");
			fw.write("주소 : " + add + "\n");
			fw.write("연락처 : " + hp + "\n");
			fw.write("----------------------------\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		FWriter_04 fw = new FWriter_04();
		
		fw.dataWrite();
	}
}

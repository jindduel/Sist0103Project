package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BufferReader : 버퍼를 사용해서 파일 읽기
//FileReader : 경로에 있는 파일 로드 - 반드시 Exception 발생


public class FileException_11 {
	
	public static void read() {
		String fileName = "C:\\SIST0103\\file\\memo.txt";
		BufferedReader br = null;
		FileReader fr = null; //문자 단위
		
		//읽기 위해 파일 열기
		try {
			fr = new FileReader(fileName);
			System.out.println("파일을 열었어요!!");
			
			br = new BufferedReader(fr);
			
			//여러줄을 읽어야하므로 while문으로 읽기
			while(true) {
				String s = br.readLine();
				
				//마지막줄인 경우 null
				if(s == null) break;
				
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다. : " + e.getMessage());
		} catch (IOException e) {
			//e.printStackTrace();
		} finally {
			try {
				br.close(); //생성한 반대 순으로 닫음
				fr.close();
				System.out.println("파일에 대한 자원을 모두 닫았어요!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		read();
		System.out.println("정상종료");
	}
}

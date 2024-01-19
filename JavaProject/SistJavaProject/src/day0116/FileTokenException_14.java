package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileTokenException_14 {
	
	public static void fileRead() {
		String fname = "C:\\SIST0103\\file\\info.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fname);
			br = new BufferedReader(fr);
			
			System.out.println("** 파일 읽기 결과 **");
			System.out.println("이름\t주소\t나이");
			System.out.println("--------------------");
			
			while(true) {
				String s = br.readLine();
				
				if(s == null) break;
				
//				String[] data = s.split(",");
//				
//				//배열 갯수만큼 출력
//				System.out.println(data[0] + "\t" + data[1] + "\t" + data[2]);
				
				StringTokenizer st = new StringTokenizer(s, ",");
				System.out.println(st.nextToken() + "\t" +st.nextToken() + "\t " + st.nextToken());
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		fileRead();
	}
}
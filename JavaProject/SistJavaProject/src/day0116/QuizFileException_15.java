package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizFileException_15 {
	//번호 과일면 수량 단가 총금액
	public static void fileRead(){
		String file = "C:\\SIST0103\\file\\fruitshop.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		int cnt = 0;
		int total = 0;
		int su, dan;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			System.out.println("  **과일 입고 목록 **");
			System.out.println("번호\t과일명\t수량\t단가\t총금액");
			System.out.println("========================================");
			
			while(true) {
				String str = br.readLine();
				
				if(str == null) break;
				
				
				cnt++;
				//String[] data = str.split(",");
//				String[] data = str.replace("\uFEFF", "").split(",");
//			
//				//배열 갯수만큼 출력
//				System.out.print(cnt + "\t");
//				for(String s : data) System.out.print(s + "\t");
//				total = Integer.parseInt(data[1]) * Integer.parseInt(data[2]);
//				System.out.println(total + "원");
				StringTokenizer st = new StringTokenizer(str, ",");
				
				System.out.print(cnt + "\t" + st.nextToken().replace("\uFEFF", "") + "\t");
				su = Integer.parseInt(st.nextToken());
				dan = Integer.parseInt(st.nextToken());
				total = su * dan;
				
				System.out.println(su + "\t" + dan + "\t" + total + "원");
				
				
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

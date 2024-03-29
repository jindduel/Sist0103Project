package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException_12 {
	
	//점수 총 갯수, 합계, 평균
	public static void scoreRead() throws FileNotFoundException, IOException {
		String fileName = "C:\\SIST0103\\file\\score.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		int cnt = 0;
		int total = 0;
		double avg = 0;
		
		//파일 읽고 버퍼에 넣기
		fr = new FileReader(fileName);
		System.out.println("파일을 정상적으로 읽었습니다. ");
		
		br = new BufferedReader(fr);
		
		while(true) {
			String s = br.readLine();
			if(s == null) break;
			
			//문자열 점수 int로 변환 후 계산
			cnt++;
			total += Integer.parseInt(s);
		}
		
		//평균 구하기
		avg = (double)total / cnt;
		
		System.out.println("총 갯수 : " + cnt);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		
		br.close();
		fr.close();
		
	}
	
	public static void main(String[] args) {
		try {
			scoreRead();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("정상 종료");
	}
}

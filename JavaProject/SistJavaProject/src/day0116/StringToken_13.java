package day0116;

import java.util.StringTokenizer;

public class StringToken_13 {
	public static void main(String[] args) {
		// 문자열을 특정 기호로 분리하는 방법
		String str = "red,yellow,cyan,gray,pink";
		
		System.out.println("String 객체의 split을 이용한 분리");
		String[] arrColors = str.split(",");
		System.out.println("총 " + arrColors.length + "개");
		
		for(String s : arrColors) System.out.print(s + " ");
		System.out.println("\n");
		

		System.out.println("String 객체의 StringTokenizer을 이용한 분리");
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("총 " + st.countTokens() + "개");
		
		while(st.hasMoreTokens()) System.out.print(st.nextToken() + " ");
		System.out.println("\n");
	}
}

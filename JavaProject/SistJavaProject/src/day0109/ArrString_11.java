package day0109;

public class ArrString_11 {
	public static void main(String[] args) {
		String[] str1 = {"텀블러", "키보드", "핸드폰", "칫솔", "우산"};
		String[] strColor = {"red", "pink", "blue", "yellow", "gray", "white"};
		
		int cnt;
		
		//str1은 1번째 : 텀블러
		System.out.println("str1_출력1_for");
		for(int i = 0; i < str1.length; i++) System.out.println((i + 1) + "번째 : " + str1[i]);
		System.out.println();

		System.out.println("str1_출력2_foreach");
		for(String i : str1) System.out.println(i);
		System.out.println();
		
		//strColor 0번지 색 : red
		System.out.println("strColor_출력1_for");
		for(int i = 0; i < str1.length; i++) System.out.println((i + 1) + "번지색 : " + strColor[i]);
		System.out.println();

		System.out.println("strColor_출력2_foreach");
		for(String i : strColor) System.out.println(i);
		System.out.println();
		
		
	}
}

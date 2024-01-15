package day0109;

public class ArraysString_09 {
	public static void main(String[] args) {
		
		String[] str = new String[4];
		
		str[0] = "김구라";
		str[1] = "유재석";
		str[2] = "하하";
		str[3] = "광수";
		
		System.out.println("출력1_for");
		for(int i = 0; i < str.length; i++) System.out.println(i + " : " + str[i]);
		
		System.out.println("출력2_foreach");
		for(String i : str) System.out.println(i);
	}
}

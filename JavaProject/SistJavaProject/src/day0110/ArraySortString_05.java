package day0110;

public class ArraySortString_05 {
	public static void main(String[] args) {
		String[] data = {"이승미", "홍수아", "김민선", "강호동", "전지현", "송혜교", "이효리"};
		
		System.out.println("**정렬 전 출력**");
		for(int i = 0; i < data.length; i++) System.out.print(data[i] + " ");
		System.out.println("\n");
		
		System.out.println("a".compareTo("b"));
		
		for(int i = 0; i < data.length - 1; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i].compareTo(data[j]) > 0) {
					String tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		
		System.out.println("**정렬 후 출력**");
		for(int i = 0; i < data.length; i++) System.out.print(data[i] + " ");
		System.out.println("\n");
	}
}
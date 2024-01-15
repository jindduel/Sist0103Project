package day0109;

public class Arrays_08 {
	public static void main(String[] args) {
		// 기본형 배열은 객체로 인식
		
		int[] arr, arr2;
		arr = new int[3];
		arr2 = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("=====================");
		
		System.out.println("for ~ each문"); //for(자료형 변수명: 배열명)
		for(int i : arr) System.out.println(i);
		
		for(int i : arr2) System.err.println(i);
	}
}
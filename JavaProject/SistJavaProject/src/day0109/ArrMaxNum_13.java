package day0109;

public class ArrMaxNum_13 {
	public static void main(String[] args) {
		int[] arr = {12, 4, 123, 45, 54, 88, 99, 65, 32, 98, 155};
		int max = arr[0];
		int min = arr[0];
		
		System.out.println("갯수 : " + arr.length);
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
			else if(min > arr[i]) min = arr[i];
		}
		
		System.out.println("최대값은 " + max + "입니다. ");
		System.out.println("최소값은 " + min + "입니다. ");
	}
}

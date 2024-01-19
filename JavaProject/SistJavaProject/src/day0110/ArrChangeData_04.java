package day0110;

public class ArrChangeData_04 {
	public static void main(String[] args) {
		int[] arr = {4, 8, 9, 12, 78, 98, 23, 22, 5, 3};
		
		System.out.println("**원 데이터**");
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println("\n");
		
		System.out.println("**거꾸로 데이터**");
		for(int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println("\n");
		
		System.out.println("**오름차순 정렬**"); //Arrays.sort(arr); 정렬
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println("\n");
		
		
	}
}

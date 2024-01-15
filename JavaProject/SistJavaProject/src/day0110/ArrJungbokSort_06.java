package day0110;

import java.util.Arrays;
import java.util.Random;

public class ArrJungbokSort_06 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		//임의의 수를 발생 중복일 경우 다시 받음
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 44) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--; 
					break;
				}
			}
		}
		
		//Arrays.sort(arr);
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i : arr) System.out.print(i + " ");
		System.out.println();
	}
}

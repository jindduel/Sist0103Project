package day0110;

public class ArraysChange_03 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		System.out.println("a = " + a + ", b = " + b);
		
		int tmp = a;
		a = b;
		b = tmp;

		System.out.println("a = " + a + ", b = " + b);
		System.out.println();
		
		int[] n = {5, 8, 4};
		
		for(int i : n) System.out.println(i + " ");
		System.out.println();
		
		System.out.println("0번이랑 2번 교환 후 출력");
		
		int tmp2 = n[0];
		n[0] = n[2];
		n[2] = tmp2;
		
		for(int i : n) System.out.println(i + " ");
	}
}
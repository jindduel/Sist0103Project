package day0104;

public class DataType_09 {
	public static void main(String[] args) {
		// args를 이용한 연산
		
		int java = Integer.parseInt(args[0]);
		int jsp = Integer.parseInt(args[1]);
		int spring = Integer.parseInt(args[2]);
		
		int tot = java + jsp + spring;
		int count = 3;
		
		double avg1 = tot / count;
		double avg2 = (double)tot / count;
		
		System.out.println(avg1);
		System.out.println(avg2);
		
		//printf를 이용
		//총점 99
		
		System.out.printf("java = %d, jsp = %d, sprinf = %d\n", java, jsp, spring);
		System.out.println("총점 = " + tot);

		System.out.printf("평균 = %.2f", avg1);
	}
}	

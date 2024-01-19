package day0109;

public class QuizInOutRank_15 {
	public static void main(String[] args) {
		String[] name = {"홍수연", "김수연", "최수연", "민수연"};
		int[] kor = {90, 88, 100, 78};
		int[] eng = {90, 68, 100, 66};
		int[] mat = {44, 55, 100, 66};
		
		int[] sum = new int[4];
		int[] rank = new int[4];
		double[] avg = new double[4];
		
		/*
		 * 각 학생들의 점수에 대한 총점 평균 등수를 구하여 출력
		 */
		//1. 총점 평균
		for(int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
			avg[i] = (double)sum[i] / 3;
		}
		
		//2. 등수
		for(int i = 0; i < name.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < name.length; j++) {
				if(avg[i] < avg[j]) rank[i]++;
			}
		}
		
		//3. 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===========================================================");
		for(int i = 0; i < name.length; i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", 
					i + 1, name[i], kor[i], eng[i], mat[i], sum[i], avg[i], rank[i]);
		}
		
	}
}

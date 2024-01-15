package day0105;

public class OperTest_03 {
	public static void main(String[] args) {
		// 증감연산자 ++, --
		
		int a, b;
		a = b = 5;
		
		//단항일 경우에는 증감연산자를 앞에 붙히나 뒤에 붙히나 같음
		++a;
		b++;
		
		System.out.println("a = " + a + ", b = " + b);
		
		//수식에서는 전치, 후치가 결과값이 틀림
		int m, n;
		m = n = 0;
		a = b = 5;
		
		m = a++; //후치일 경우 대입 후 증가
		System.out.println("m = " + m + ", a = " + a);
		
		n = ++b; //전지일 경우 증가 후 대입
		System.out.println("n = " + n + ", b = " + b);
		
	}
}

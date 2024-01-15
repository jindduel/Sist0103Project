package day0110;

/* 생성자 (constructor) : 객체 생성 시 자동 호출 되는 메서드
 * 1. 일반 메서드와 차이점 : 리턴형이 없다
 * 2. 반드시 클래스 명과 동일
 * 3. Overloading이 가능 (여러 개의 생성자 만들 수 있음)
 * 4. 생성자가 없을 경우 기본 생성자로 생성 가능
 * 5. 멤버값들이 주로 초기화를 담당
 * 
 */
class Numb{
	int num; // 0
	
	//디폴트 생성자
	public Numb() {
		System.out.println("디폴트 생성자 호출");
	}
	//인자있는 생성자
	public Numb(int num) {
		this.num = num;
		System.out.println("인자있는 생성자 호출");
	}
	
	//메서드
	public int getNumber() {
		num = 50;
		return num;
	}
}

public class ConstNum_11 {
	public static void main(String[] args) {
		Numb n1 = new Numb();
		Numb n2 = new Numb(30);
		
		System.out.println(n2.num);
		
		Numb n3 = new Numb();
		System.out.println(n3.getNumber());
		
	}	
}

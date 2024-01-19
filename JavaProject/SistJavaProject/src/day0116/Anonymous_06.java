package day0116;

//익명 내부 클래스 : 클래스 선언과 객체 생성을 동시에 하는 이름 없는 클래스(일회용)
//이벤트 발생 시 생성했다가 끝나면 메모리 제거 (효율적 관리)

abstract class AbstEx {
	abstract public void draw();
}

class OuterEx {
	AbstEx ab = new AbstEx() {
		
		@Override
		public void draw() {
			System.out.println("익명 내부 클래스");			
		}
	};
}

public class Anonymous_06 {
	public static void main(String[] args) {
		OuterEx out = new OuterEx();
		
		out.ab.draw();
	}
}

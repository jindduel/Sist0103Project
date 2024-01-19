package day0116;

abstract class AbstObj {
	abstract public void dataIn();
	abstract public void dataOut();
}

class SubAbst extends AbstObj {

	@Override
	public void dataIn() {
			System.out.println("상속_데이터입력");
	}

	@Override
	public void dataOut() {
		System.out.println("상속_데이터출력");
	}
	
}

public class Anonymous_09 {
	
	AbstObj ab1 = new AbstObj() {
		
		@Override
		public void dataOut() {
			System.out.println("익명내부클래스_데이터출력");
			
		}
		
		@Override
		public void dataIn() {
			System.out.println("익명내부클래스_데이터입력");
		}
	};
	
	public static void main(String[] args) {
		//익명내부클래스
		Anonymous_09 an = new Anonymous_09();
		an.ab1.dataIn();
		an.ab1.dataOut();
		
		//상속클래스
		SubAbst sub = new SubAbst();
		sub.dataIn();
		sub.dataOut();
	}
}

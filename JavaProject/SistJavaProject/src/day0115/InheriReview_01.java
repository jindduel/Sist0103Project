package day0115;

interface InterAA {
	public void play();
}

interface InterBB {
	public void draw();
}

class InterImple implements InterAA, InterBB{

	@Override
	public void draw() {
		System.out.println("나는 그림을 그린다. ");
	}

	@Override
	public void play() {
		System.out.println("나는 게임을 한다. ");
	}
	
}

public class InheriReview_01 {
	public static void main(String[] args) {
		InterImple i = new InterImple();
		
		i.draw();
		i.play();
	}
}

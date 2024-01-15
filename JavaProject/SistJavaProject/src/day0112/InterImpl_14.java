package day0112;

interface InterA {
	public void singasong();
	public void draw();
}

interface InterB extends InterA {
	public void playgame();
	public void write();
}

class Imple implements InterB{

	@Override
	public void singasong() {
		System.out.println("노래하기");
	}

	@Override
	public void draw() {
		System.out.println("그림그리기");
	}

	@Override
	public void playgame() {
		System.out.println("게임하기");
	}

	@Override
	public void write() {
		System.out.println("글쓰기");
	}
	
}

public class InterImpl_14 {
	public static void main(String[] args) {
		
		Imple inter = new Imple();
		
		inter.singasong();
		inter.draw();
		inter.playgame();
		inter.write();
		
		InterB inb = new Imple();
		inb.singasong();
		inb.draw();
		inb.playgame();
		inb.write();
		
	}
}

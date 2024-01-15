package day0115;

abstract class Game{
	abstract public void play();
	abstract public void stop();
}

class Kim extends Game{

	@Override
	public void play() {
		System.out.println("kim 게임시작");
	}

	public void stop() {
		System.out.println("kim 게임중단");
	}
	
}

class Lee extends Game {

	@Override
	public void play() {
		System.out.println("lee 게임시작");
	}

	@Override
	public void stop() {
		System.out.println("lee 게임중단");
	}
	
}

class Choi extends Game{

	@Override
	public void play() {
		System.out.println("choi 게임시작");
	}

	@Override
	public void stop() {
		System.out.println("choi 게임중단");
	}
	
}

public class AbstracRwveiw_02 {
	public static void main(String[] args) {
		/*Game g = null; 
		
		g = new Kim();
		g.play();
		g.stop();
		
		g = new Lee();
		g.play();
		g.stop();
		
		g = new Choi();
		g.play();
		g.stop();*/
		
		Game[] game = new Game[3];
		game[0] = new Kim();
		game[1] = new Lee();
		game[2] = new Choi();
		
		for(int i = 0; i < game.length; i++) {
			game[i].play();
		}
		System.out.println("======================");
		
		for(int i = game.length - 1; i >= 0; i--) {
			game[i].stop();
		}
	}
}
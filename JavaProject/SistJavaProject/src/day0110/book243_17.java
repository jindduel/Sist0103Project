package day0110;

class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		setSpeed(100);
		System.out.println(model + "가 달립니다. (시속 : " + speed + "km/h)");
	}
}

public class book243_17 {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}

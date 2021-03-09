package java_practice;

public class Car {
	int speed;
	int distance;
	String color;
	public void speedUp() { //메소드1
		speed +=10;
	}
	public void breakDown() {//메소드2
		speed -=5;
	}
	public int checkSpeend(){//메소드3
		return speed;
	}
}

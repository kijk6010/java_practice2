package java_practice;

public class Car {
	int speed;
	int distance;
	String color;
	public void speedUp() { //�޼ҵ�1
		speed +=10;
	}
	public void breakDown() {//�޼ҵ�2
		speed -=5;
	}
	public int checkSpeend(){//�޼ҵ�3
		return speed;
	}
}

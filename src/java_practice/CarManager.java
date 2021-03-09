package java_practice;

public class CarManager {
	public static void main(String[] args) {
		Car dogCar = new Car(); //°´Ã¼ »ý¼º
		
		dogCar.distance=100;
		dogCar.speed=20;
		dogCar.color="blue";
		dogCar.speedUp();
		dogCar.breakDown();
		System.out.print(dogCar.checkSpeend());
	}
}

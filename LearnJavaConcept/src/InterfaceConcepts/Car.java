package InterfaceConcepts;

public class Car implements Vehicle {

	int speed;
	int gear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.speedUp(100);
		car.applybreak(30);
		car.changeGear(3);
	}

	@Override
	public void changeGear(int a) {
		System.out.println("In" + a + "speed of car is " + speed*a);
	}

	@Override
	public void speedUp(int a) {
		speed = speed + a;
		System.out.println("Total speed is:" + speed);
	}
 
	@Override
	public void applybreak(int a) {
		speed = speed - a;
		System.out.println("Total speed after applying break:" + speed);
	}

}

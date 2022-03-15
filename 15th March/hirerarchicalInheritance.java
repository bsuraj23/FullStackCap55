
public class hirerarchicalInheritance {
	public static void main(String[] args) {
		System.out.println("This is an example of Heirarchial Inheritance \n");
		Brake b=new Brake();
		b.vehicle();
		b.stop();
	}
}


class Car{
	void vehicle() {
		System.out.println("Car is a vehicle");
	}
}
class Wheel extends Car{
	void move() {
		System.out.println("I help the car move");
	}
}
class Brake extends Car{
	void stop() {
		System.out.println("I stop the car");
	}
}
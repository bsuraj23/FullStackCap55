package Assignment15Mar;

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

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		System.out.println("This is an example of Heirarchial Inheritance \n");
		Brake b=new Brake();
		b.vehicle();
		b.stop();
		//b.move(); //Compile Time error
	}
}

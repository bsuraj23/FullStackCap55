package JavaHandsOn;
abstract class Vehicle{
	abstract void driving();
}
class Bike extends Vehicle{
	public void driving() {
		System.out.println("Driving a bike");
	}
}
class Car extends Vehicle{
	public void driving() {
		System.out.println("Driving a car");
	}
}
public class ExAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Bike();
		v.driving();
		v=new Car();
		v.driving();
	}

}

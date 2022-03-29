package JavaHandsOn;
class ExVehicle{
	 void driving() {
			System.out.println("Driving a vehicle");
	 }
}
class ExBike extends ExVehicle{
	public void driving() {
		System.out.println("Driving a bike");
	}
}
class ExCar extends ExVehicle{
	public void driving() {
		System.out.println("Driving a car");
	}
}
public class ExPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExVehicle v=new ExVehicle();
		v.driving();
		v=new ExBike();
		v.driving();
		v=new ExCar();
		v.driving();
	}

}

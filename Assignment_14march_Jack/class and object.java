package ClassandObject;

public class Bicycle {

		  // state or field
		  private int gear = 5;

		  // behavior or method
		  public void braking() {
		    System.out.println("Working of Braking");
		  }
}
public class main{
	public static void main(String[] args) {

		Bicycle sportsBicycle = new Bicycle();
        sportsBicycle.braking();
	}
}
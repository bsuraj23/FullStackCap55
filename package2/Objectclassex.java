package package2;

class Lamp{
	 
	  boolean isOn;
	// method to turnon the light
	  
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }
	// method to turnoff the light
	  
	  void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }
}

public class Objectclassex {

	public static void main(String[] args) {
		
		 	Lamp led = new Lamp();       //led is an object of Lamp classs
		    Lamp halogen = new Lamp();	 //halogen is an other object of Lamp class

		    // turn on the light by
		    // calling method turnOn()
		    led.turnOn();

		    // turn off the light by
		    // calling method turnOff()
		    halogen.turnOff();
		

	}

}

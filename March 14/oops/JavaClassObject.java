
class Lamp {
  
  boolean isOn;

  
  void turnOn() {
    isOn = true;
    System.out.println("Is the Light ON? " + isOn);

  }
}
public class JavaClassObject{
  public static void main(String[] args) {
    
    Lamp led = new Lamp();
    led.turnOn();
  }
}

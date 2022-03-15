package Java;

public abstract class Abstraction {
	public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	  class Zoo extends Abstraction {
		  public void animalSound() {
		    // The body of animalSound() is provided here
		    System.out.println("The pig says: wee wee");
		  }
		}
	

	public static void main(String[] args) {
		Zoo z = new Zoo(); // Create a zoo object
	    z.animalSound();
	    z.sleep();
	  }
		
	  }

	
		

	



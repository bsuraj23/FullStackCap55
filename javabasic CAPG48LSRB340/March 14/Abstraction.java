abstract class Program {

	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}

public class Abstraction extends Program  {

	public static void main(String[] args) {
		 // create an object of AbstractionEx
		Abstraction obj = new Abstraction();

	    // access method of abstract class
	    // using object of AbstractionEx class
	    obj.display();
	}

}

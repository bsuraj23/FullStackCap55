package package2;

abstract class Language {

	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}

public class AbstractionEx extends Language  {

	public static void main(String[] args) {
		 // create an object of AbstractionEx
		AbstractionEx obj = new AbstractionEx();

	    // access method of abstract class
	    // using object of AbstractionEx class
	    obj.display();
	}

}

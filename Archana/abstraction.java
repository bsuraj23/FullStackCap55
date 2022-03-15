
abstract class Language {

	  // method of abstract class
	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}

public class abstraction extends Language {

	  public static void main(String[] args) {

	   abstraction obj = new abstraction();
	    obj.display();
	  }
	}
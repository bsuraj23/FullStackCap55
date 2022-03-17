import java.util.ArrayList;
import java.util.Iterator;

public class Iteratr {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Iterator<String> it = cars.iterator();

    System.out.println("Printing 1st element");
    
    System.out.println(it.next());
    System.out.println("\nPrinting remaining elements");
    
    while (it.hasNext())  
	{  
		String i = it.next();  
		System.out.println(i);  
	}  

  }
}

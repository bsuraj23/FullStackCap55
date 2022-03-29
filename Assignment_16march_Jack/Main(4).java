package deletearray;

import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("skoda");
    cars.add("audi");
    cars.add("bmw");
    cars.add("volkswagen");
    cars.remove(0);
    System.out.println(cars);
  } 
}

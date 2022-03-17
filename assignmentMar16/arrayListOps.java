package assignmentMar16;

import java.util.ArrayList;

public class arrayListOps {
	 
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
 
        cars.add("Hyundai");
        cars.add("Kia");
        cars.add("Maruthi");
        cars.add("Ford");
 
        System.out.println("Elements of ArrayList are: \n"+cars);
        
        cars.remove(0);
        System.out.println(" \n"+cars);
    }
}
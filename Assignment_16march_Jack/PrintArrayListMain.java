import java.util.ArrayList;
 
public class PrintArrayListMain {
 
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();
 
        arl.add("kia");
        arl.add("bmw");
        arl.add("Tesla");
        arl.add("audi");

	System.out.println("Array list before removing");
 
        System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i) + " ");
        }
System.out.println("Elements of ArrayList after removing :");

        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i) + " ");
        }


	
    }
}
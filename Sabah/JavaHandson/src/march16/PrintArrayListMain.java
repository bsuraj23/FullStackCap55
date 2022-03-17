package march16;
import java.util.ArrayList;
public class PrintArrayListMain {
	   public static void main(String[] args) {
	        ArrayList<String> arl = new ArrayList<>();
	 
	        arl.add("BMW");
	        arl.add("Toyota");
	        arl.add("Tesla");
	        arl.add("KIA");
	 
	        System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < arl.size(); i++) {
	            System.out.println(arl.get(i) + " ");
	        }
	    }
	}



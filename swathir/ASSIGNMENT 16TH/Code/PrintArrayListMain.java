import java.util.ArrayList;
 
public class PrintArrayListMain {
 
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();
 
        arl.add("Nandhini");
        arl.add("nandh");
        arl.add("nandii");
        arl.add("nandhini");
 
        System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i) + " ");
        }
    }
}
import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> tata = new ArrayList<>();

        tata.add("Punch");
        tata.add("Altroz");
        tata.add("Nexon");
        tata.add("Harrier");
        tata.add("Safari");

        System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < tata.size(); i++) {
            System.out.println((i + 1) + " : " + tata.get(i));
        }
    }
}

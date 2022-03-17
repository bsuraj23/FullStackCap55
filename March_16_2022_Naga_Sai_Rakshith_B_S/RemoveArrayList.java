import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        ArrayList<String> tata = new ArrayList<String>();
        tata.add("Indica");
        tata.add("Punch");
        tata.add("Altroz");
        tata.add("Nexon");
        tata.add("Harrier");
        tata.add("Safari");
        System.out.println("Before removing:");
        for (String name : tata)
            System.out.println(name);
        tata.remove(0);
        System.out.println("Before removing:");
        for (String name : tata)
            System.out.println(name);

    }
}

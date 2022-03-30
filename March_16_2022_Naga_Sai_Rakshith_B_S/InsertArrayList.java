import java.util.ArrayList;

public class InsertArrayList {
    public static void main(String[] args) {
        ArrayList<String> tata = new ArrayList<String>();
        tata.add("Punch");
        tata.add("Indica");
        tata.add("Nexon");
        tata.add("Harrier");
        tata.add("Safari");
        tata.set(1, "Altroz");
        for (String name : tata)
            System.out.println(name);

    }

}

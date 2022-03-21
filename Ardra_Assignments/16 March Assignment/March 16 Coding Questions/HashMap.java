import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<Integer, String>();
        map.put(1,"vara");
        map.put(2,"raja");
        map.put(3,"barghav");
        map.put(5,"abdul");
        map.put(3,"ravali");
        map.put(4,"jothi");
        map.put(null,"indu");
        map.put(null,"rama");//values will be overridden if key is repeated


        System.out.println(map.get(3));
        System.out.println(map);
    }
}

import java.util.ArrayList;
public class Arraylistproblems {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("CodeSpeedy");
        list.add("ArrayList");
        list.add("Java");
        System.out.println(list);
        list.remove(2);
        System.out.println("after removing:");
        System.out.println(list);
        
    }
    
}
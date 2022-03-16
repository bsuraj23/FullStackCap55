import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        System.out.println("After adding elements:");
        list.add("CodeSpeedy");
        list.add("ArrayList");
        list.add("Java");
        list.add("Welcome");
        list.add("Session");
        System.out.println(list);
        list.remove(2);
        list.remove(3);
        System.out.println("After removing:");
        System.out.println(list);
        list.clear();
        System.out.println("After Clearing:");
        System.out.println(list);
	}
}

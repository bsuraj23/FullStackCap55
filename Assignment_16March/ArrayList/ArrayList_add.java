import java.util.ArrayList;
public interface ArrayList_add {
        public static void main(String[] args) {
            ArrayList<String> list1= new ArrayList<String>();
            list1.add("hello");
            list1.add("world");
            System.out.println(list1);

            ArrayList<String> list2= new ArrayList<String>();
            list2.add("Assignment");
            list2.add("Three");
            list2.addAll(list2);
            System.out.println(list2);
            System.out.println(list2);
        }
    }


import java.util.LinkedList;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println("Initial List : "+list);
        list.addFirst("z");
        System.out.println("An element is added First : "+list);
        list.addLast("f");
        System.out.println("An element is added Last : "+list);

        list.removeFirst();
        System.out.println("remove first element : "+list);

        list.removeLast();
        System.out.println("remove last element : "+list);

        list.pollFirst();
        System.out.println("poll first :"+ list);

        list.peek();
        System.out.println("peek :"+list);

        list.removeAll(list);
        System.out.println("remove all "+list);

        list.pollFirst();
        System.out.println("poll first "+list);
    }
}
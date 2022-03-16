import java.util.ArrayList;
import java.util.Iterator;

//different ways to iterate a list
public class ArrayListforloop {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println("******************");





        //normal for loop

        for(int i=0; i<list.size(); i++) {
            //list.size - number of elements
            //list.get(i)- 0 to 4..
            System.out.println(list.get(i));
        }
        System.out.println("*******************");






        //using advance for loop
        for(Integer item : list) {   //list is passed here and datatype, and each element is consider as item
            System.out.println(item);
        }
        System.out.println("***************");







        //java8
        //-> arrow function... input ->logic
        list.forEach(item->System.out.println(item));
        //each element is pick up... iterate and print it
        System.out.println("*****************");




        //using while loop
        int i=0;
        while(i<list.size()) {
            System.out.println(list.get(i));
            i++;
        }
        System.out.println("***************");


        //using iterator method
        //using iterator method {list.iterator}
        Iterator it = list.iterator();
        while(it.hasNext()) {   //if it is having any element it will iterate
            System.out.println(it.next()); //print element using next method
        }
        System.out.println("***************");
    }

}

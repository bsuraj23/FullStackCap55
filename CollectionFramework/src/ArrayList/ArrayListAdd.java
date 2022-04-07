package ArrayList;
import java.util.ArrayList;
public interface ArrayListAdd {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
				list.add("archana");
				list.add("abc");
				
		
				System.out.println(list);
				ArrayList<String> list2= new ArrayList<String>();  
				list2.add("one");
				list2.add("two");
				list.addAll(list2);
				System.out.println(list);
				System.out.println(list2);
	}
	

}

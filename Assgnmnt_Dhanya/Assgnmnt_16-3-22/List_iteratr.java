import java.util.ArrayList;
import java.util.ListIterator;  
public class List_iteratr 
{
	public static void main(String[] args)
	{  
		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("d");  
		arrlist.add("dd");  
		arrlist.add("ddd");  
		arrlist.add("dddd");  
		arrlist.add("ddddd");  
		System.out.println(arrlist);    // [d, dd, ddd, dddd, ddddd]  
  
		ListIterator<String> iterator = arrlist.listIterator(2);  
		System.out.println("\nPrinting elements from 2nd position");  
		
		while (iterator.hasNext())  
		{  
			String i = iterator.next();  
			System.out.println(i);  
		}  
	}
}

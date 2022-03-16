package Col_LinkList;

import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ArrL=new LinkedList<String>();
		
		
		ArrL.add("Prashant");
		ArrL.add("Akshy");
		ArrL.add("Raj");
		System.out.println(ArrL);
		
		ArrL.addFirst("First");
		System.out.println("Add First : " +ArrL);
		
		ArrL.addLast("Last");
		System.out.println("Add Last : "+ArrL);
		
		ArrL.remove("Raj");
		System.out.println("Removing Raj : "+ArrL);
		
		ArrL.removeFirst();
		System.out.println("Removing First element : "+ArrL);
		
		ArrL.removeLast();
		System.out.println("Removing Last element : "+ArrL);
		
		
		ArrL.add(2,"atIndex2");
		System.out.println("adding at Index 2 : "+ArrL);
		
		ArrL.set(2,"ainz");
		System.out.println("Setting new value at Index 2 : "+ArrL);
	}

}

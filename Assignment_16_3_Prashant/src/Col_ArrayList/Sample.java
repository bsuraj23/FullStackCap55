package Col_ArrayList;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ArrL=new ArrayList<String>();
		
		
		ArrL.add("Prashant");
		ArrL.add("Akshy");
		ArrL.add("Raj");
		System.out.println(ArrL);
		
		ArrL.remove("Raj");
		System.out.println("Removing Raj : "+ArrL);
		
		ArrL.add(2,"atIndex2");
		System.out.println("adding at Index 2 : "+ArrL);
		
		ArrL.set(2,"ainz");
		System.out.println("Setting new value at Index 2 : "+ArrL);
	}

}

package m16;

import java.util.ArrayList;
import java.util.List;

public class listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");
		 list.add("Litchi");
		 //Iterating the List element using for-each loop  
		 for(String fruit:list)  
		  System.out.println(fruit);  
		  
		}  

	}



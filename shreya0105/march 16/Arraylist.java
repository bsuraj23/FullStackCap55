package m16;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.remove( "Steve");
	  
	      //displaying elements
	      System.out.println(alist);
	   }  

	}



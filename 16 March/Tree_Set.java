package Assigment16Mar;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

	 public static void main(String args[]){  
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Rajesh");  
		  al.add("Ajay");  
		  System.out.println(al); //prints in ascending order
		  al.remove("Ajay");
  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		}  
	}
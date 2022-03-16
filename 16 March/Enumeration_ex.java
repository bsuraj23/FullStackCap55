package Assigment16Mar;

public class Enumeration_ex {

	public enum Season { WINTER, SPRING, SUMMER, FALL }  

	public static void main(String[] args) {  

	for (Season s : Season.values()){  
	System.out.println(s);  
	}
	
	System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
	System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
	  
	}
} 


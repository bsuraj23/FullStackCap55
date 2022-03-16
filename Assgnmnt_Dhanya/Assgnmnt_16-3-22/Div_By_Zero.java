
public class Div_By_Zero {
	   public static void main(String args[]) { 
	      try { 
	         int a[] = new int[5];
	         a[5] = 30/0;  
	      }  
	      catch(ArithmeticException e)
	      {
	    	  System.out.println("ArithmeticException caught");
	      }  
	      catch(ArrayIndexOutOfBoundsException e)
	      {
	    	  System.out.println("ArrayIndexOutOfBoundsException caught");
	      }  
	      catch(Exception e)
	      {
	    	  System.out.println("Other exceptions");
	      }
	      System.out.println("rest of the code...");  
	   }  
	} 

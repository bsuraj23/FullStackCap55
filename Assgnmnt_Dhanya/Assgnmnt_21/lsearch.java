
public class lsearch {
	public static void main(String[] args)
	   {
	      int[] arr = {15, 25, 35, 55, 75, 95};
	      int f=0; 
	      int key = 55;
	      for (int i = 0; i < arr.length; i++)
	      {
	    	  
	          if (arr[i] == key)
	          {
	             // pos = i;
	        	  System.out.println(key+" found in "+(i+1)+"th position.");
	        	  f=1;
	              break;
	          }
	  	}
	      if(f==0)
	      {
	    	  System.out.println(key+" not found in the given array.");
	      }
	   }

}

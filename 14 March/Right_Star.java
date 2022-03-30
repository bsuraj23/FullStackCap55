package Assignment14Mar;

public class Right_Star {

	public static void main(String[] args) {
	      int row=5, i, j;
	      for(i=0; i<row; i++)
	      {
	    	  for(j=2*(row-i);j>=0;j--)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(j=0;j<=i;j++)
	    	  {
	    		  System.out.print("* ");
	    	  }
	    	  System.out.println();
	   }
}
}

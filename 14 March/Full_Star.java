package Assignment14Mar;

public class Full_Star {

	   public static void main(String[] args)
	   {
	      int row=5, i, space, j;
	      for(i=0; i<row; i++)
	      {
	         for(space=i; space<row; space++)
	            System.out.print(" ");
	         for(j=0; j<(i+1); j++)
	            System.out.print("* ");
	         System.out.print("\n");
	      }
	   }
	}
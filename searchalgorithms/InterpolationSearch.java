package searchalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InterpolationSearch {



	   public static int interpolation_Search(int a[], int n, int key) 
	 { 
	  
	  int low = 0, high = (n - 1); 
	  while (low <= high && key >= a[low] && key <= a[high]) 
	 
	   { 
	      if (low == high) 
	     { 
	        
	      if (a[high] == key)
	        return 1; 
	    
	         else
	         return -1;
	      
	     } 
	    
	    int position = low + (((high-low) / (a[high]-a[low]))*(key - a[low])); 
	 
	    if (a[position] == key) 
	      {
	          return 1; 
	      }
	     
	    else if (a[position] < key) 
	      {
	          low = position + 1;
	      }
	     
	    else if(a[position] > key)
	      {
	          high = position - 1;
	      }
	  } 
	  
	  return -1; 
	 } 
	   public static void main( String[] args) 
	 { 
	  
	     Scanner scan = new Scanner(System.in);
	        int a[] = new int[100];
	        
	        System.out.println("Enter number of elements :");
	          
	          int n = scan.nextInt();
	        
	        int i;
	        
	          for(i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }
	    
	      System.out.println("Enter key to be search :");
	       
	            int key = scan.nextInt();
	        
	         Arrays.sort(a,0,n-1);
	        
	     if(interpolation_Search(a,n,key)!=-1)
	   {
	          System.out.println("Element is present in array");
	   }
	      
	      else
	        System.out.println("Element is not present in array");
	  } 
	}
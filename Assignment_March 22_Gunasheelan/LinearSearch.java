package searching;

import java.util.Scanner;  

class LinearSearch   
{  
  public static void main(String args[])  
  {  
    int i, n, key, arr[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    arr = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (i = 0; i < n; i++)  
      arr[i] = in.nextInt();  
   
    System.out.println("Enter value to find");  
    key = in.nextInt();  
   
    for (i = 0; i < n; i++)  
    {  
      if (arr[i] == key)     /* Searching element is present */  
      {  
         System.out.println(key + " is present at the location " + (i + 1) + ".");  
          break;  
      }  
   }  
   if (i == n)  /* Element to search isn't present */  
      System.out.println(key + " is not present in the array.");  
  }  
}  
package data;

import java.util.Scanner;  

class LinearSearch   
{  
  public static void main(String args[])  
  {  
    int c1, n1, s, array[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n1 = in.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter those " + n1 + " elements");  
   
    for (c = 0; c < n1; c++)  
      array[c1] = in.nextInt();  
   
    System.out.println("Enter value to find");  
    s = in.nextInt();  
   
    for (c1 = 0; c1 < n1; c1++)  
    {  
      if (array[c1] == s)     /* Searching element is present */  
      {  
         System.out.println(s + " is present at location " + (c1 + 1) + ".");  
          break;  
      }  
   }  
   if (c1 == n1)  
      System.out.println(s + " isn't present in array.");  
  }  
}  
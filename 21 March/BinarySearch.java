package Assignment21Mar;

import java.util.Scanner;

//Spacecomplexity=O(1)
//TimeComplexity=O(log n)
class BinarySearch{  
	 public static void binarySearch(int arr[], int first, int last, int key){  
	   int mid = (first+last)/2;  
	   while( first<=last ){  
	      if (arr[mid]<key){  
	        first=mid+1;     
	      }
	      else if (arr[mid]==key){  
	        System.out.println("Element is found at index: " + (mid+1));  
	        break;  
	      }
	      else{  
	         last=mid-1;  
	      }  
	      mid=(first+last)/2;  
	   }  
	   if (first>last){  
	      System.out.println("Element not found");  
	   }  
	 }  
	 public static void main(String args[]){  
	        Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter size of array: ");
	        int size=sc.nextInt();
		 	int arr[] = new int[size];  
		 	
		 	System.out.println("Enter elements of array: ");
		 	for(int i=0;i<size;i++)
		 	{
		 		arr[i]=sc.nextInt();
		 	}
		 	System.out.println("Enter key to be searched: ");
	        int key=sc.nextInt();  
	        int last=arr.length-1;  
	        binarySearch(arr,0,last,key);     
	 }  
	} 

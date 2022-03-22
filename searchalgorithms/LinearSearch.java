package searchalgorithms;

import java.util.Scanner;

public class LinearSearch {
	
	public static int search(int arr[],int k) {
		int length=arr.length;
		for(int i=0;i<length;i++) {
			if(arr[i]==k)
			{
				return i;
			}
		}
		return -1;
			
		
	}

	public static void main(String[] args) {
		int arr[]= {10,2,3,4,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int k=sc.nextInt();
		int result=search(arr,k);
		if(result==-1)
		{
			System.out.println("Element is not present in the array");

		}
		else
		{
			System.out.println("Element found at index "+result);
		}

	}

}

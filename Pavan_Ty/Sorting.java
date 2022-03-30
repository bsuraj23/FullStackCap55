package com.search;

public class Sorting {
	public void bubblesort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
		public void printArray(int arr[]) {
			int n=arr.length;
			for(int i=0;i<n;++i) {
				System.out.println(arr[i]);
			}
				System.out.println();
			
		
	}
		public static void main(String[] args) {
			Sorting obj=new Sorting();
			int arr[]= {65,74,85,18,26,19,80};
			obj.bubblesort(arr);
			obj.printArray(arr);
			
		}

}
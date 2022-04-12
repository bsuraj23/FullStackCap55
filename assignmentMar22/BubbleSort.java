package assignmentMar22;

import java.util.Arrays;

public class BubbleSort {
	 public void bubbleSort(int[] arr) {  
		 int n = arr.length;  
	     int temp = 0;  
	     for(int i=0; i < n; i++){  
	        for(int j=1; j < (n-i); j++){  
	           if(arr[j-1] > arr[j]){  
	        	   temp = arr[j-1];  
	        	   arr[j-1] = arr[j];  
	        	   arr[j] = temp;  
	        	   }
	           }  
	        }
	     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {20, 12, 10, 15, 2};
		System.out.println("Bubble Sort: ");
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(data);
	}
}

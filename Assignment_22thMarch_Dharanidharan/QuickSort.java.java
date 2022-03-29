package capgemini;
import java.util.*;
class QuickSorting{ 
    int partition(int integerArray[], int l, int h) { 
        int pi = integerArray[high];  
        int i = (low-1);
        for (int j=l; j<h; j++) { 
            if (integerArray[j] <= pi) { 
                i++; 
                // swap integerArray[i] and integerArray[j] 
                int temp = intArray[i]; 
                integerArray[i] = integerArray[j]; 
                integerArray[j] = temp; 
            } 
        } 
        int temp = integerArray[i+1]; 
        integerArray[i+1] = integerArray[high]; 
        integerArray[high] = temp; 
   
        return i+1; 
    } 
   
   
  //sorting the array partitions recursively
    void quick_sort(int integerArray[], int l, int h) { 
        if (low < high) { 
            int pi = partition(intArray, l, h);  
            quick_sort(integerArray, l, pi-1); 
            quick_sort(integerArray, pi+1, h); 
        } 
    } 
}
 
class QuickSorting1{
    public static void main(String args[]) {
        int integerArray[] = {3,-2,21,9,0,4,-6}; 
        int n = integerArray.length; 
        System.out.println("Original Array: " + Arrays.toString(integerArray));
        //calling quicksort using QuickSort object
        QuickSort obj = new QuickSort(); 
        obj.quick_sort(integerArray, 0, n-1); 
        //printing the sorted array
        System.out.println("\nSorted Array: " + Arrays.toString(integerArray)); 
    } 
}
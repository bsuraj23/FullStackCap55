package dataStructure;
import java.util.*;
class QuickSort { 
   
    int partition(int intArray[], int least, int high) { 
        int p = intArray[high];  
        int i = (least-1);
        for (int j=least; j<high; j++) { 
            
            if (intArray[j] <= p) { 
                i++; 
             
                int temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
        } 
   
        
        int temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
   
        return i+1; 
    } 
   
   

    void quick_sort(int intArray[], int least, int high) { 
        if (least < high) { 
            
            int p = partition(intArray, least, high); 
   
           
            quick_sort(intArray, least, p-1); 
            quick_sort(intArray, p+1, high); 
        } 
    } 
}
 
class QuickSort1{
    public static void main(String args[]) {
        
        int intArray[] = {5,-1,3,9,1,6,-2}; 
        int n = intArray.length; 
        
        System.out.println("Original : " + Arrays.toString(intArray));
       
        QuickSort obj = new QuickSort(); 
        obj.quick_sort(intArray, 0, n-1); 
      
        System.out.println("\nSorted : " + Arrays.toString(intArray)); 
    } 
}
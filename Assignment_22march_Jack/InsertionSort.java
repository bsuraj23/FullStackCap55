package data;

public class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n1 = array.length;  
        for (int j = 1; j < n1; j++) {  
            int n2 = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > n2) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = n2;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {10,14,36,22,44,11,48,12};    
        System.out.println("Before Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}
package data;

public class SelectionSort{  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int small = arr[index];   
            arr[index] = arr[i];  
            arr[i] = small;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {92,24,31,2,43,61,58,12};  
        System.out.println("Before Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);
         
        System.out.println("After  Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  

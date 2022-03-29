package sorting;

public class SelectionSort{  
    public static void selectionSort(int[] a1){  
        for (int i = 0; i < a1.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a1.length; j++){  
                if (a1[j] < a1[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int small = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smaller;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] a2 = {20,18,25,33,56,77};  
        System.out.println("Before Selection Sort");  
        for(int i:a2){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(a2);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:a2){  
            System.out.print(i+" ");  
        }  
    }  
}  

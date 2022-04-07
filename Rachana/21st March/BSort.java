

public class BSort {

    static void bubbleBSort(int[] arr, int n)
    {
        if (n == 1)                     
        {
            return;
        }

        for (int i=0; i<n-1; i++)      
        {
            if (arr[i] > arr[i+1])      
            {                          
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleBSort(arr, n-1);           
    }

    void display(int[] arr)                
    {
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        BSort ob = new BSort();
        int[] arr = {6, 4, 5, 12, 2, 11, 9};
        bubbleBSort(arr, arr.length);
        ob.display(arr);
    }
}
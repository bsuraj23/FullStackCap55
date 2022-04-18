
class ISort
{
    static void insertionISort(int[] arr, int n)
    {
        if (n <= 1)                            
        {
            return;
        }

        insertionISort( arr, n-1 );        

        int last = arr[n-1];                        
        int j = n-2;                                

        while (j >= 0 && arr[j] > last)                 
        {
            arr[j+1] = arr[j];                          
            j--;
        }
        arr[j+1] = last;                            
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
        int[] arr = {22, 21, 11, 15, 16};

        insertionISort(arr, arr.length);
        ISort ob = new ISort();
        ob.display(arr);
    }
}

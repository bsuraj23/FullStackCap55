package capgemini;

public class HeapSorting {

 public void sort(int array[]) {
   int n = array.length;

   for (int i = n / 2 - 1; i >= 0; i--) {
     heapify(arr, n, i);
   }

   for (int i = n - 1; i >= 0; i--) {
     int temp = arr[0];
     arr[0] = arr[i];
     arr[i] = temp;

     heapify(arr, i, 0);
   }
 }

 void heapify(int array[], int n, int i) {
   int largest = i;
   int l = 2 * i + 1;
   int r = 2 * i + 2;

   if (l < n && arr[l] > arr[largest])
     largest = l;

   if (r < n && arr[r] > arr[largest])
     largest = r;

   if (largest != i) {
     int swap = array[i];
     array[i] = array[largest];
     array[largest] = swap;

     heapify(array, n, largest);
   }
 }

 static void printArray(int array[]) {
   int n = array.length;
   for (int i = 0; i < n; ++i)
     System.out.print(array[i] + " ");
   System.out.println();
 }

 public static void main(String args[]) {
   int array[] = { 2,4,6,12,8};

   HeapSort hs = new HeapSort();
   hs.sort(array);

   System.out.println("Sorted array is");
   printArray(array);
 }
}

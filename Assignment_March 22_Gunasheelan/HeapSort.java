package sorting;

public class HeapSort {

 public void sort(int a1[]) {
   int n = a1.length;

   // Build max heap
   for (int i = n / 2 - 1; i >= 0; i--) {
     heap(a1, n, i);
   }

   // Heap sort
   for (int i = n - 1; i >= 0; i--) {
     int temp = a1[0];
     a1[0] = a1[i];
     a1[i] = temp;

     // Heapify root element
     heap(a1, i, 0);
   }
 }

 void heap(int a1[], int n, int i) {
   // Find largest among root, left child and right child
   int large = i;
   int l = 2 * i + 1;
   int r = 2 * i + 2;

   if (l < n && arr[l] > arr[large])
     large = l;

   if (r < n && arr[r] > arr[large])
     large = r;

   // Swap and continue heapifying if root is not largest
   if (large != i) {
     int swap = a1[i];
     a1[i] = a1[large];
     a1[large] = swap;

     heap(a1, n, large);
   }
 }

 // Function to print an array
 static void printArray(int a2[]) {
   int n = a2.length;
   for (int i = 0; i < n; ++i)
     System.out.print(a2[i] + " ");
   System.out.println();
 }

 // Driver code
 public static void main(String args[]) {
   int a3[] = { 10, 6, 5, 13, 20, 3 };

   HeapSort h = new HeapSort();
   h.sort(a3);

   System.out.println("Sorted array is");
   printArray(a3);
 }
}

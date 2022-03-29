import java.util.*;
class Main {
    int partition(int intArray[], int low, int high) {
        int pi = intArray[high];
        int i = (low-1);
        for (int j=low; j<high; j++) {
            if (intArray[j] <= pi) {
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
    void quick_sort(int intArray[], int low, int high) {
        if (low < high) {
            int pi = partition(intArray, low, high);
            quick_sort(intArray, low, pi-1);
            quick_sort(intArray, pi+1, high);
        }
    }
}
class QuickSort{
    public static void main(String args[]) {
        int intArray[] = {3,1,-9,8,9,-2,-1};
        int n = intArray.length;
        System.out.println("Original Array: " + Arrays.toString(intArray));
        Main obj = new Main();
        obj.quick_sort(intArray, 0, n-1);
        System.out.println("\nSorted Array: " + Arrays.toString(intArray));
    }
}
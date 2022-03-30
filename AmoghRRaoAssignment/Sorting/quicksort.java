package AmoghRRaoAssignment.Sorting;

import java.util.Arrays;
import java.util.Scanner;
//SpaceComplexity=O(n)
//TimeComplexity=O(n*log(n))

class Qsort {

    // method to find the partition position
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    static void qsort_method(int array[], int low, int high) {
        if (low < high) {

            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            qsort_method(array, low, pi - 1);

            // recursive call on the right of pivot
            qsort_method(array, pi + 1, high);
        }
    }
}

class QuickSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] data = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }

        Qsort.qsort_method(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(data));
    }
}
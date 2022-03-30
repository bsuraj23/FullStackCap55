package Assignment21Mar;

import java.util.Arrays;
import java.util.Scanner;

//SpaceComplexity=O(n)
//TimeComplexity=O(n^2)
class BubbleSort{

Scanner input = new Scanner(System.in);

void bubbleSort(int array[]) {
 int size = array.length;

 System.out.println("Choose Sorting Order:");
 System.out.println("1 for Ascending \n2 for Descending");
 int sortOrder = input.nextInt();

 for (int i = 0; i < size - 1; i++)

   for (int j = 0; j < size - i - 1; j++)

     // sort the array in ascending order
     if (sortOrder == 1) {
       if (array[j] > array[j + 1]) {

         int temp = array[j];
         array[j] = array[j + 1];
         array[j + 1] = temp;
       }
     }

     // sort the array in descending order
     else {
       if (array[j] < array[j + 1]) {

         int temp = array[j];
         array[j] = array[j + 1];
         array[j + 1] = temp;
       }
     }

}

public static void main(String args[]) {

 int[] data = { -2, 45, 0, 11, -9 };

BubbleSort bs = new BubbleSort();

 bs.bubbleSort(data);
 System.out.println("Sorted Array in Ascending Order:");

 System.out.println(Arrays.toString(data));
}
}
package assignmentMar22;

public class binarySearch {
	int BinarySearch(int arr[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return BinarySearch(arr, l, mid - 1, x);
            return BinarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String args[]){
        binarySearch ob = new binarySearch();
        int arr[] = { 20, 30, 40, 50, 60 };
        int n = arr.length;
        int x = 30;
        int result = ob.BinarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}

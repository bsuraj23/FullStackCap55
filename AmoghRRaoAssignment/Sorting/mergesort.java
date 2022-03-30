package AmoghRRaoAssignment.Sorting;

class mergesort {

    void merge(int a[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0;
        j = 0;
        k = beg;

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void sort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(a, beg, mid);
            sort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    void printArray(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String args[]) {
        int a[] = { -34, 235, 234, 1312, 234, 56, 2, 23, 76, 12 };
        int n = a.length;
        mergesort m1 = new mergesort();
        System.out.println("Before sorting array elements are - ");
        m1.printArray(a, n);
        m1.sort(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        m1.printArray(a, n);
        System.out.println("");
    }

}
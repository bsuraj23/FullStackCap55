package capgemini;

class BinarySearch{  
    public static int binarySearch(int arr[], int f, int l, int key){  
        if (l>=f){  
            int mid = first + (l - f)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, f, mid-1, key);//searching in left subarray  
            }else{  
            return binarySearch(arr, mid+1, l, key);//searching in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {10,30,20,60,40};  
        int key = 30;  
        int l=arr.length-1;  
        int result = binarySearch(arr,0,l,key);  
        if (result == -1)  
            System.out.println("Element is not found");  
        else  
            System.out.println("Element found at index: "+result);  
    }  
}  
package data;
class BinarySearch{  
    public static int binarySearch(int arr[], int f, int l, int k){  
        if (l>=f){  
            int mid = f + (l - f)/2;  
            if (arr[mid] == k){  
            return mid;  
            }  
            if (arr[mid] > k){  
            return binarySearch(arr, f, mid-1, k);  
            }else{  
            return binarySearch(arr, mid+1, l, k); 
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int k = 30;  
        int l=arr.length-1;  
        int result = binarySearch(arr,0,l,k);  
        if (result == -1)  
            System.out.println("Element is not found");  
        else  
            System.out.println("Element is found : "+result);  
    }  
}  
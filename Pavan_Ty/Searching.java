package com.search;


public class Searching {
	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {15,40,20,90,100,80};
		int key=80;
		System.out.println(key+" is found at "+linearSearch(arr,key));
	}

}
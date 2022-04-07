package com.sorting;

public class Main {
    public static void main(String args[]) {
        int[] data = {20, 12, 10, 15, 2};
        System.out.println("Selection Sort: ");
        SelectionSort ss = new SelectionSort();
        ss.selection(data);
        System.out.println("Bubble Sort: ");
        BubbleSort bs = new BubbleSort();
        bs.bubble(data);
    }
}
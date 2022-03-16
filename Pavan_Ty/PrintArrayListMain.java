package com.arraylist;

import java.util.ArrayList;

public class PrintArrayListMain {

   public static void main(String[] args) {
       ArrayList<String> array = new ArrayList<>();

       array.add("windows");
       array.add("android");
       array.add("mac");
       array.add("linux");
       array.add("ubantu");

       System.out.println("Elements of list are:");
       for (int i = 0; i < array.size(); i++) {
           System.out.println(array.get(i) + " ");
       }
   }
}
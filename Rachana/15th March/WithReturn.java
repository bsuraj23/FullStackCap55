package com.collections;

import java.util.Scanner;

class Box 
{
    double width;
    double height;
    double depth;
    double volume() 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter width : ");
        double width = s.nextDouble();
        System.out.print("enter height : ");
        double height = s.nextDouble();
        System.out.print("enter depth: ");
        double depth = s.nextDouble();
        return width * height * depth;
    }
}
public class WithReturn 
{
    public static void main(String args[]) 
    {
        Box cuboid = new Box();
        double vol;
	vol = cuboid.volume();
        System.out.println("Volume is " + vol);
    }
}
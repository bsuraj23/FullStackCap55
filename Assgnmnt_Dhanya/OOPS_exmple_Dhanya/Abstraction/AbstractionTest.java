interface Shape {
    public void draw();
    public double getArea();
 } 

class Circle implements Shape {
    private double radius;
     
    public Circle(double r) { 
       this.radius = r; 
    } 
    public void draw() { 
       System.out.println("Drawing Circle"); 
    } 
    public double getArea() { 
       return Math.PI*radius*radius; 
    } 
 }
 
 class Rectangle implements Shape {
    private double length;
    private double width;
     
    public Rectangle(double length, double width) { 
       this.length = length; 
       this.width = width; 
    } 
    public void draw() { 
       System.out.println("Drawing Rectangle"); 
    } 
    public double getArea() { 
       return length*width; 
    } 
 }

public class AbstractionTest { 
     public static void main (String args[]) {
         // Shape object referring to circle.
         Shape circle = new Circle(10);
         circle.draw(); 
         System.out.println("Area of given circle = "+circle.getArea());
         // Shape object referring to rectangle.
         Shape rect = new Rectangle(10,10);
         rect.draw(); 
         System.out.println("Area of given rectangle = "+rect.getArea());
     }
 }
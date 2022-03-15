
 abstract class AbstractTest
{ 
  abstract void calculate(int a, int b);  
 } 
 class Addition extends AbstractTest
{ 
  void calculate(int a, int b)
  { 
    int x = a + b; 
    System.out.println("Sum: " +x); 
   } 
} 
 class Subtraction extends AbstractTest
{ 
  void calculate(int a, int b)
  { 
    int y = a - b; 
    System.out.println("Subtract: " +y); 
  } 
} 
 class Multiplication extends AbstractTest
{ 
  void calculate(int a, int b)
  { 
    int z = a * b; 
    System.out.println("Multiply: " +z); 
  } 
} 
public class AbstractionEx
{ 
 public static void main(String[] args) 
 { 
   Addition a = new Addition(); 
   Subtraction s = new Subtraction(); 
   Multiplication m = new Multiplication(); 
    
    a.calculate(10, 45); 
    s.calculate(20, 15); 
    m.calculate(100, 20); 
  } 
}
class Student 
{ 
 private String name; 
 public String getName() 
 { 
    return name; 
 } 
 public void setName(String studentName) 
 { 
   name = studentName; 
  } 
}

public class Encapsulation
{ 
 public static void main(String[] args) 
 { 
    Student obj = new Student();
     obj.setName("Amit");  
    String studentName = obj.getName(); 
    System.out.println(studentName); 
  } 
}
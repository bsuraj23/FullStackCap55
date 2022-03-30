public class ParametersAndReturnType{
    //method without parameters and return type
    public static void display(){
        System.out.print("Hi! I am ");
    }
    //method with parameters and without return type
    public static void firstName(String fName){
        System.out.println(fName+".");
    }
    //method without parameters and with return type
    public static int age(){
        return 21;
    }
    //method with parameters and with return type
    public static String fullName(String fName, String lName){
        return fName+" "+lName;
    }
    public static void main(String args[]) {
      String fName = "Akshy";
      String lName = "S";
      display();
      firstName(fName);
      System.out.print("I am "+age());
      System.out.println(" and my full name is " +fullName(fName,lName)+".");
      
    }
}
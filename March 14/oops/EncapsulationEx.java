
class EncapsTest{
    private int ssn;
    private String empName;
    private int empAge;

   
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}
public class EncapsulationEx{
    public static void main(String args[]){
         EncapsTest obj = new EncapsTest();
         obj.setEmpName("Jubil");
         obj.setEmpAge(21);
         obj.setEmpSSN(101);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
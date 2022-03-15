package March_14_2022.OOPS;

class Addition{
    public void add(){
        System.out.println(5+10);
    }
    public void add(int num){
        System.out.println(num+10);
    }
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
}

public class OOPS_Polymorphism {
    public static void main(String[] args){
        Addition obj = new Addition();
        obj.add();
        obj.add(6);
        obj.add(6,11);
    }
}

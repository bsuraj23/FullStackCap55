package parameters;

public class parameters {
	public static void main(String  args[])
    {
		Sample2333  SampleObj23 = new Sample2333();
        System.out.println(SampleObj23.add());
        System.out.println(SampleObj23.add(1,2));
        System.out.println(SampleObj23.add());
    }
}
class Sample2333
{
	int a=90;
	byte b= 89;
	String name = "Sriram";
	//without parameter and with return type
	int add(){
		String name = "abc";
		int c= 23+23;
		System.out.println("I am without parameter and with return value function");
		return c ;
	};
	//with parameter and with return type
    int add(int a, int b){
        int c= a+b;
        System.out.println("I am with parameter and with return value function");
        return c;
    };
    //with parameter without return type
    void add(String name) {
    	System.out.println("I am with parameter and without return value function" +name);
    };
    //without parameter without return type
}

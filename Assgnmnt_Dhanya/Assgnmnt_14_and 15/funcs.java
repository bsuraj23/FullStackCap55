
class Sample
{
	/*int a=90;
	byte b= 89;
	double f=57.9;

	String name = "Dhanya";*/
//non parameter
	/*void add()
	{
		int c= 23+23;
		System.out.println("I am a non parametered  without return type , c = "+c);

	}*/
	void add(double f)
	{
		double c= f;
		System.out.println("I am parametered without return type, c = "+c);

	}
	int add(){
   //comment
		//String name = "sdfkgsdf";
		int c= 23+23;
		System.out.println("I am a non parametered and with return value function");
		return c ;
	}
    int add(int a, int b){
        //comment
        int c= a+b;
        System.out.println("I am parametered with return value function");
        return c;
    }
    /*boolean add(String str){
        //comment
        System.out.println("Hellow " +str  +"can you hear me ?");
        return false;
    }
*/

}

public class funcs {
	public static void main(String  args[])
    {
           Sample s = new Sample();
           System.out.println(s.add()+"\n");
           System.out.println(s.add(3,5)+"\n");
           s.add(67.9);
           //s.add();
    }

}

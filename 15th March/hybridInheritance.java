
public class hybridInheritance {
	   public static void main(String args[]){
			System.out.println("This is example of Hybrid Inheritance \n");
			D obj = new D();
			obj.disp();
		   }
}

class C
{
   public void disp()
   {
	System.out.println("C");
   }
}

class A extends C
{
   public void disp()
   {
	System.out.println("class A extended C");
   }
}

class B extends C
{
   public void disp()
   {
	System.out.println("class B extended C");
   }
	
}

class D extends A
{
   public void disp()
   {
	System.out.println("class D extended A(extension of C)");
   }
}
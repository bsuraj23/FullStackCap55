1.Abstraction

package Abstractclass;
public abstract class FirstHuman {
	public abstract void eat();//only declaration should be done inside abstract class
	public void walk()
	{
		
	}

}
public class Man extends FirstHuman{
	public void eat() {//method definition 
		System.out.println("in eat");
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstHuman f=new Man();
		f.eat();

	}

}

2.class and object

package ClassandObject;

public class Cycle {

		  // state or field
		  private int gear = 5;

		  // behavior or method
		  public void braking() {
		    System.out.println("Working of Braking");
		  }
}
public class main{
	public static void main(String[] args) {

		cycle sportscycle = new cycle();
        sportscycle.braking();
	}
}
3.Encapsulation

package Encapsulation;

public class Encdemo {
	public static void main(String[] args) {
		Student n1=new Student();
		Student n2=new Student();
		n1.setRollno(8795633);
		n2.setRollno(6543327);
		n1.setName("Yamuna");
		n2.setName("Sahana");
		System.out.println(n1.getRollno());
		System.out.println(n2.getRollno());
		System.out.println(n1.getName());
		System.out.println(n2.getName());
		
	}
}
4.package Encapsulation;

public class Encap {
	private String name;  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name ; 
	}  
}
public class main{
	public static void main(String[] args) {
		Student a=new Student();   
		a.setName("sita");    
		System.out.println(a.getName());  
	}
}

5.Inheritance

package Inheritance;
public class Calci {
    public int add(int i,int j) {
  	  return i+j;
    }
}
public class CalciAdv extends Calculator {
	public int sub(int i,int j) {
		return i-j;
	}

}

public class CalciVeryAdv extends CalciAdv {
    public int mul(int i,int j) {
   	 return i*j;
    }
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CalciVeryAdv c=new CalciVeryAdv();
        int n1=c.add(2,4);
        int n2=c.sub(3,2);
        int n3=c.mul(2,3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
	}

}

6.Polymorphism

package Polymorphism;

class Example {
	public void render() {
	    System.out.println("Render Polygon...");
	  }
}
class Ex1 extends Sample{
	public void render() {
	    System.out.println("Render Square...");
	  }
}
class Ex2 extends Sample{
	public void render() {
	    System.out.println("Render Circle...");
	  }
}
class Main{
	public static void main(String[] args) {
		Sample1 obj1=new Ex1();
		obj1.render();
		Sample2 obj2=new Ex2();
		obj2.render();
	}
}

7.package StarProgram;

import java.util.Scanner;

	class Program{
		public void Rightangled(int r) {
			int n = r;
		    //Outer Loop for number of Rows
		    for(int i=0;i<n;i++)
		    {
		        // printing '*' in each column.
		        for(int j=0;j<=i;j++)
		        {
		          System.out.print("* ");
		        }
		        System.out.println();
		    }
			
		}
		
	public void Fullstar(int r) {
		int n=r;
		for(int i=0;i<n;i++)
	    {
	        for(int k=i;k<n;k++)
	        System.out.print(" ");

	        // printing '*' in each column.
	        for(int j=0;j<=i;j++)
	        {
	          // We print '*' for each row.
	          System.out.print("* ");
	        }

	        System.out.println();
	    }
	}

	public void Leftstar(int k) {
		int a, b;
	    for (a = 0; a < k; a++) {
	        for (b = 2 * (k - a); b >= 0; b--) {
	            System.out.print(" ");
	        }
	       for (b = 0; b <= a; b++) {

	            System.out.print("* ");
	        }

	     
	        System.out.println();
	    }
	}
	}


	public class Starprog {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			int i=1;
				do {
					System.out.println("Enter 1:for right angle triangle 2:for left angled 3:for full star 0:to exit code");
					
					int ch=sc.nextInt();
					if (ch==0) {
						i=0;
					}
					
					Program p = new Program();
					
					switch(ch) {
					case 1:System.out.println("Enter number of rows ");
							int rows=sc.nextInt();
							p.Rightangled(rows);
							break;
					case 2:System.out.println("Enter number of rows ");
							int rows1=sc.nextInt();
							p.Leftstar(rows1);
							break;
					case 3:System.out.println("Enter number of rows ");
							int rows2=sc.nextInt();
							p.Fullstar(rows2);
							break;
			
					
					}
					
					
					
				}while(i!=0);
		
				
				
			
			
			
			

		}


}


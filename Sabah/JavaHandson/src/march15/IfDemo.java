package march15;

public class IfDemo {
	// Java program to illustrate If statement
	
	    public static void main(String  args[])
	    {
	           Sample4555 SampleObj23 = new Sample4555();
	      //  System.out.println(SampleObj23.add()  );
	       // System.out.println(SampleObj23.add(1,2)  );
	        System.out.println(SampleObj23.add("Sabah ")  );
	    }


	}

	class Sample4555
	{
	int a=90;
	byte b= 89;

	String name = "Rhea";
	//non praprmeter
	int add(){
	   //comment
	    String name = "aabbcc";
	   int c= 23+23;
	   System.out.println("I am a non parametered and with return value function");
	   return c ;
	};
	    int add(int a, int b){
	        //comment
	        int c= a+b;
	        System.out.println("I am parametered and with return value function");
	        return c;
	    };
	    boolean add(String str){
	        //comment
	        System.out.println("Hello " +str  +"how are you ?");
	        return false;
	    };


	}



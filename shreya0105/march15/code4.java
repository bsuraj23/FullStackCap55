package m15;
//function with parameter and with return type//
public class code4 {
String nam="jerry";
	
	int multiply(int a,int b) {
		
		return a*b;
		
	}
	
	String names(String name) {
		String n=name+nam;
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		code4 obj4=new code4();
		System.out.println(obj4.multiply(7,4));
		System.out.println(obj4.names("Tom"));
		

	}

	}



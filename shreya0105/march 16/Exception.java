package m16;

public class Exception {
	void division(int a,int b)
	{
	int c=5/0;
	System.out.println("Division has been successfully done");
	System.out.println("Value after division: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception ex=new Exception();
		ex.division(10,0);
		}

	}



package capgamini;

public class Functions {

	public static void main(String[] args) {
		ParameterandReturnType obj=new ParameterandReturnType();
		obj.possibility1();
		System.out.println("without parameter and with return type"+obj.possibility2());
		obj.possibility3(2);
		System.out.println("with parameter and with boolean type"+obj.possibility4(1));

	}

}


class ParameterandReturnType {
	public void possibility1() {
		System.out.println("without parameter and without return type");
	}
	public boolean possibility2() {
		int a=3;
		if(a==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public void possibility3(int a) {
		if(a==2) {
			//System.out.println("the value of a is: "+a);
			System.out.println("with parameter and without return type");
		}
	}
	public boolean possibility4(int a) {
		if(a==1) {
			return true;
		}
		else {
			return false;
		}
	}

}

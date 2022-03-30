public class ParaFunc {

	public static void main(String[] args) {
		ParameterReturnType obj=new ParameterReturnType();
		obj.case1();
		System.out.println("without parameter and with return type " +obj.case2());
		obj.case3(2);
		System.out.println("with parameter and with boolean type " +obj.case4(1));

	}

}


class ParameterReturnType {
	public void case1() {
		System.out.println("without parameter and without return type");
	}
	public boolean case2() {
		int x=3;
		if(x==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public void case3(int x) {
		if(x==2) {
			
			System.out.println("with parameter and without return type");
		}
	}
	public boolean case4(int x) {
		if(x==1) {
			return true;
		}
		else {
			return false;
		}
	}

}

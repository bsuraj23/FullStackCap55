package package1;

public class WithReturnWithPara {
	int add(int a,int b) {
		int r=a+b;
		return r;
	}

	public static void main(String[] args) {
		
		WithReturnWithPara obj=new WithReturnWithPara();
		System.out.println(obj.add(2, 4));
		

	}

}

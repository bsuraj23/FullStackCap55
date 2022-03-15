package package1;

public class WithReturnWithoutPara {
	
	int add() {
		int result=5+6;
		return result;
	}

	public static void main(String[] args) {
		WithReturnWithoutPara obj=new WithReturnWithoutPara();
		System.out.println(obj.add());

	}

}

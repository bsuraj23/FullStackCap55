package Abstraction;

abstract class GetName{
	abstract void name();
}

class Data extends GetName{
	private String name="A Prashant";
	private int Roll=344;
	void name() {
		System.out.println(name);
	}
	void roll() {
		System.out.println(Roll);
	}
}


public class Sample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetName obj=new Data();
		obj.name();
		//obj.roll();  //Error:  Hidden From GetName class
	}

}

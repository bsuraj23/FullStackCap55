package training;

public class ExParameters {

	static int add(int a,int b) {
		return a+b;
	}
	static int add() {
		return 0;
	}
	static void add(double l,double m) {
		System.out.println(l+m);
	}
	static void add1() {
		System.out.println("0");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,3);
		add();
		add(5,6.0);
		add1();
	}

}

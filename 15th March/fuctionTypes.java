
public class fuctionTypes {
	public static void main(String[] args) {
		Sample obj=new Sample();
		System.out.println(obj.add1());
		obj.add();
		obj.add1(35,55);
		System.out.println(obj.add(20,30));

	}

}
class Sample
{
	void add() {
		System.out.println("No parameter and No return type");
		}
	int add1() {
		int c=40+90;
		System.out.println("No parameter with return type");
		return c;
		}
	void add1(int a,int b) {
		int c=a+b;
		System.out.println("parameter and No return type");
		}
	int add(int a,int b) {
		int c=a+b;
		System.out.println("parameter and return type");
		return c;
		}
}
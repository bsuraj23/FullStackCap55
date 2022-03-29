package JavaHandsOn;

class Shape{
	int sides;
}
class Square extends Shape{
	int length;
}
public class ExInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		sq.sides=4;
		sq.length=5;
		System.out.println("The given square has "+sq.sides+" sides with length of : "+sq.length);
	}

}

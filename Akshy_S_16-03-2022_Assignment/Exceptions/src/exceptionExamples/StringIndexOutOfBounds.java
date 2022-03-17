package exceptionExamples;

public class StringIndexOutOfBounds {

	public static void main(String[] args) {
		String s = "Welcome";
		try {
			System.out.println(s.charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index range crosssed");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index range crosssed");
		}
		catch(Exception e){
			System.out.println("Other Exception");
		}
	}

}

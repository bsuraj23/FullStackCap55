package exceptionExamples;

public class NullTernary {

	public static void main(String[] args) {
		String s = "Welcome to java";
		//String s = null;
		String msg = (s==null)?"object ref is null":s.substring(2, 6);
		System.out.println(msg);
	}

}

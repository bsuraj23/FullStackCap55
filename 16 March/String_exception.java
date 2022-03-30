package Assigment16Mar;

public class String_exception {

	public static void main(String[] args) {
		try {
			String s="welcome";
			System.out.println(s.charAt(22));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exceeding array boundary");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exceeding String index boundary");
		}
		catch(Exception e)
		{
			System.out.println("Other exception");
		}

	}

}
package exceptionExamples;

public class NullEqualsCall {

	public static void main(String[] args) {
		//String s = "Welcome";
		String s = null;
		try {
			if(s.equals("Welcome")) {
				System.out.println("Same");
			}
			else {
				System.out.println("Not same");
			}
		}
		catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("NullPointer");
		}
			
	}

}

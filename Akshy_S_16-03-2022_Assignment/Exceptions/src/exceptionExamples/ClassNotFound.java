package exceptionExamples;


public class ClassNotFound {

	public static void main(String[] args) {
		try {
			Class.forName("exceptionExamples.add");
		}
		catch(ClassNotFoundException e){
			System.out.println("Class doesnot exists");
		}
	}

}

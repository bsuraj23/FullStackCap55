package parameter;
//with parameter and return type
public class Parameter2 {
	public static void main(String[] args) {
		 int a = 5;
	        int b = 1;
	        
	 
	        // Calling the function with 2 parameters
	        int result=calc(a, b);
	        System.out.println(result);
	}
	        public static Integer calc(int x, int y)
	        {
	            int sum = x + y;
	           return sum;
	        }
	

}

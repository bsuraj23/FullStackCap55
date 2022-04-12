public class swapNum {
	public static void main(String args[]) {
		
		int num1=20,num2=5;
		System.out.println("Integer1="+num1+", Integer2="+num1);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Integer1="+num1+", Integer2="+num1);
	}
}

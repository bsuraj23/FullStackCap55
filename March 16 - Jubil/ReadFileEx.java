import java.io.*;
import java.util.Scanner;
public class ReadFileEx {
 
	public static void main(String[] args) throws Exception{
		
		Scanner input=new Scanner(new File("java.txt"));
		System.out.println();
		
        while(input.hasNextInt())
        {
        	System.out.print(input.nextInt() + " ");
        	
        }
        System.out.println();
        
	}
 
}
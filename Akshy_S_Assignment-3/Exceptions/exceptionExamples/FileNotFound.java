package exceptionExamples;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFound {

	public static void main(String[] args) {
	    try {
	        FileReader f = new FileReader("filename.txt");
	        //FileReader f = new FileReader("filenameNotPresent.txt");
	        Scanner sc = new Scanner(f);
	        while(sc.hasNextLine()) {
	        	String s = sc.nextLine();
	        	System.out.println(s);
	        }
	        sc.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("File not found");
	      }
	}
}

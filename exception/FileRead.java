package exception;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileRead {


		public static void main(String[] args) {
			
			try {
			 // creating object of FileReader
		    FileReader reader = new FileReader("C:\\Users\\User\\eclipse-workspace\\Exceptionhandling\\src\\com\\capgi\\exception\\file.txt");
		      System.out.println("file found");
		      BufferedReader br = new BufferedReader(reader);
		      
			    // declaring empty string 
			    String data =null;
			      
			    // while loop to read data 
			    // and printing them
			    while ((data = br.readLine()) != null) 
			    {
			        System.out.println(data);
			    }
			      
			    // closing the object
			    br.close();
			  
			
			}catch(FileNotFoundException e) {
				
				System.out.println("File not found");
				
				
			}catch(Exception e) {
				
				System.out.println("other");
			}	
		     
		   

	}
}


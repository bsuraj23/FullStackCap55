import java.io.File;  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Files {
  public static void main(String[] args) {
	  try {
	      File myObj = new File("file1.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
    try {
        File myObj = new File("file1.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    File myObj1 = new File("file1.txt");
    
    if (myObj1.exists()) {
      System.out.println("File name: " + myObj1.getName());
      System.out.println("Absolute path: " + myObj1.getAbsolutePath());
      System.out.println("Writeable: " + myObj1.canWrite());
      System.out.println("Readable " + myObj1.canRead());
      System.out.println("File size in bytes " + myObj1.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}


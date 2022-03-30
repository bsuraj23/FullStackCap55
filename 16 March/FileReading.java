package Assigment16Mar;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class FileReading {
  public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Users\\Lenovo\\eclipse-workspace\\input.txt");
      Scanner sc = new Scanner(myObj);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        System.out.println(data);
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
package Assignment21Mar;

import java.io.File;
import java.net.FileNameMap;
import java.nio.file.Files;

class FileExtension {

public static void main(String[] args) {
    File file = new File("input.txt");

    String fileName = file.toString();
   

    int index = fileName.lastIndexOf('.');
    if(index > 0) {
      String extension = fileName.substring(index + 1);
      System.out.println("File extension is " + extension);
    }
  }
}
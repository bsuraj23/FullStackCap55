package Assigment16Mar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_exception {

public static void main(String[] args) {
		
		File f=new File("file.txt");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			while(fis.read()!=-1) {
				System.out.println(fis.read());
			}}
			catch(FileNotFoundException e)
			{
				System.out.println("Text file not found");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally{
	            try{
	                fis.close();
	            }catch (IOException e){
	                e.printStackTrace();
	            }
		}
}
	}

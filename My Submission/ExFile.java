package JavaHandsOn;
import java.io.*;

public class ExFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Mahee\\Desktop\\DataBaseDemo");
		System.out.println("The details of file :");
		System.out.println("File name is : "+f.getName());
		System.out.println("File Absolute path is : "+f.getAbsolutePath());
		System.out.println("File Parent is : "+f.getParent());
		
		
	}

}

package Read_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("C:\\Users\\apras\\Desktop\\New folder\\Assignment_16_3_Prashant\\Welcome.txt");
			int i;    
	        while((i=fr.read())!=-1)    
	        System.out.print((char)i);    
	        fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

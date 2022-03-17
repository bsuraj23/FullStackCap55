import java.io.FileWriter;
// Also importing IOException class to
// throw exception if occurs
import java.io.IOException;

// Class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// The file writing and creating process may give
		// some IOException, that's why it is mandatory to
		// use try block

		// Try block to check for exception/s
		try {

			// Creating a FileWriter object which will
			// create a new file and if already available
			// it will open it
			FileWriter fw = new FileWriter("gfg.txt");

			

			
			fw.write("We love GeeksForGeeks");

			fw.close();

			// Print and display message
			System.out.println("\nFile write done");
		}

		// Catch block to catch if exception/s occurs
		catch (IOException e) {

			// Print and display message
			System.out.println(
				"There are some IOException");
		}
	}
}

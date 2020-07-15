package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {

	public static void main(String[] args) {
		// Define the file path we want to read
		String filename = "c:\\SDETuniversity\\workspace\\JavaTraining\\src\\files\\FileToRead.txt";
		String text = null;
		
		// Create the file in JAVA
		File file = new File(filename);
		
		// Open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			// Read the file
			text = br.readLine();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: file not found" + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data" +  filename);  
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
				
	}

}

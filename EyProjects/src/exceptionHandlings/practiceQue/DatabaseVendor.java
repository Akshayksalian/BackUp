package exceptionHandlings.practiceQue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DatabaseVendor {
	public static void main(String[] args) {
	
		String path = "D:\\JavaAndReact\\hell.txt";
		
		try {
			checkFile(path);
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void checkFile(String path) throws FileNotFoundException{
		
		try (FileReader fr = new FileReader(path)) {
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


package readAndWrite.practice;

import java.io.FileReader;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		
		FileReader fw = null;
		try {
			 fw = new FileReader("D:\\AkshayIsGood.txt");
			fw.close();
		} catch(IOException e) {
			e.getMessage();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

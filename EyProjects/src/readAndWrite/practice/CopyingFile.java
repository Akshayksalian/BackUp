package readAndWrite.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyingFile {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		
		String fileLoc = s.nextLine(); // D:\\Picture\\bull.jpg
		String destination = s.nextLine(); // D:\\Picture\\New bull.jpg
		
		try {
			FileInputStream fis = new FileInputStream(fileLoc);
			FileOutputStream fos =  new FileOutputStream(destination);
			int b;
			while((b = fis.read())!=-1) {
				fos.write(b);
			}
			fos.close();
			fis.close();
			s.close();
			System.out.println("copied successful");
		} catch (IOException e) {
			e.printStackTrace();
		} 		
	}
}

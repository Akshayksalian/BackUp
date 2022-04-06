package readAndWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFile {

	public static void main(String[] args) throws IOException {
		
		// Byte streams.
		FileInputStream fis =null;
		FileOutputStream fos = null;
		
		try {
			// source path
			fis = new FileInputStream("D:\\Picture\\bull.jpg");
			// source destination.
			// New bull is the file name
			fos = new FileOutputStream("D:\\Picture\\New bull.jpg");
			int b;
			// Byte reader will read each and every single byte at a time until its -1. (This kind of reading is not an efficient reading stream).
			while((b = fis.read())!=-1) {
				// writing.
				fos.write(b);
			}
			System.out.println("copied successful");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis!=null) {
				fis.close();
			}
			if(fos!=null) {
				fos.close();
			}
			
		}

	}

}

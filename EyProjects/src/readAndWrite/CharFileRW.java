package readAndWrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFileRW {
	public static void main(String[] args) throws IOException {
		
		// Character Streams.
		FileReader fr = null;
		FileWriter fw = null;
	
		try {
			fr = new FileReader("D:\\JavaAndReact\\hello.txt");
			fw = new FileWriter("D:\\JavaAndReact\\New hello.txt");
			int c;
			while((c=fr.read())!=-1) {
				fw.write(c);
			}
			System.out.println("Copied successfully");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr!=null)
				fr.close();
			if(fw!=null)
				fw.close();
		
		}
	}
}
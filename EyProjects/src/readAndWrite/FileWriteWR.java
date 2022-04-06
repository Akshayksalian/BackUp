package readAndWrite;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteWR {
	public static void main(String[] args) {
		
		WriteFileContent("D:\\JavaAndReact\\bufferWriter.txt");
		WriteFileChar("D:\\JavaAndReact\\bufferWriter2.txt");
		
	}
	
	// Using BufferedWriter
	private static void WriteFileContent(String fileName) {
		
		// Using try-with-resources.
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));){
			bw.write("Writing one line");
			bw.newLine();
			bw.write("SecondLine");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static void WriteFileChar(String fileName) {
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream(fileName));
			bs.write("Write one line".getBytes());
			bs.write("\r\n".getBytes());
			bs.write("Second Line".getBytes());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(bs != null) {
				try {
					bs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

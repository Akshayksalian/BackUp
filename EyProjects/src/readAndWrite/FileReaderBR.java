package readAndWrite;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBR {


	public static void main(String[] args) {
		
		String s;
		
		// Try resource is used
		// Character Streams so BufferedReader.
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\JavaAndReact\\hello.txt"));){
			while((s=br.readLine()) != null) {
				System.out.println(s);
			}
			System.out.println("Completed");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		int i;
		
		// Byte streams so BufferedInputStreams 
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\JavaAndReact\\hello.txt"));){
			while((i=bis.read()) != -1) {
				System.out.println(i);
			}
			System.out.println("Completed");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}

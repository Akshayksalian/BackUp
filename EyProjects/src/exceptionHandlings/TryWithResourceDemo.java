package exceptionHandlings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		
		/*
		 * In this try With Resource it will automatically close the used libraries.
		 */
		
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"))){
			String strLine;
			while((strLine = br.readLine()) != null) {
				System.out.println("Line is - "+strLine);
			}
		} catch(IOException i) {
			System.out.println(i.getMessage());
//			i.printStackTrace();				(This will give that red line errors)
		}
	}

}

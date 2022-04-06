package readAndWrite.practice;

import java.io.*;
import java.util.*;

public class ReadFile {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			s.close();
		
			br = new BufferedReader(new FileReader(str));
			
			int count=0;
			while(br.readLine()!=null) {
				count++;
			}
			
			System.out.println(count);
				
		} catch(IOException e) {
			e.getMessage();
		} finally {
			try {
				if(br!=null)
				br.close();
			} catch (IOException i) {
				i.printStackTrace();
			}
		}

	}

}

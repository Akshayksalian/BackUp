package string;

import java.util.*;

public class dateTrim {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Month = ");
		String str = s.nextLine();
		s.close();
		
		str.trim();
		
		int start = str.indexOf("/");
		int end = str.lastIndexOf("/");
		
		System.out.println("Month : "+str.substring(start+1,end));
		
		
		
	}

}

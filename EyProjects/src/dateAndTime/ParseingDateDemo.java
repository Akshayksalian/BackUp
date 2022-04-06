package dateAndTime;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
	
/*
 *	Converting from string format to Date Object. 
 */

public class ParseingDateDemo {
	public static void main(String[] args) {
		try {
		parse("dd/MM/yyyy","20/8/2000");
		parse("dd/MM/yyyy HH:mm:ss","23/02/2022 11:55:23");
		// Error will there because time format has not been put correctly.
		parse("dd/MM/yyyy HH/mm/ss","23/02/2022 11:55:23");	
		} catch(ParseException e) {
			System.out.println("Error while parsing "+e.getMessage());
		}
	}
	
	private static void parse(String pattern,String dateTime) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date dt = sdf.parse(dateTime);
		System.out.println(dt);
	}
}

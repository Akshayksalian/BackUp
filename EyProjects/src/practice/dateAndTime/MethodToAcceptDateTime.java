package practice.dateAndTime;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MethodToAcceptDateTime {

	public static void main(String[] args) {
		
		try {
		convertingStringToDate(acceptingDate("20/08/2000"));
		} catch (ParseException e) {
			System.out.println("wrong fromat");
		}

	}
	
	private static void convertingStringToDate(String str) throws ParseException{

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(str);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		System.out.println("Date is "+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Month is "+c.get(Calendar.MONTH));
		System.out.println("Year is "+c.get(Calendar.YEAR));
		
		SimpleDateFormat sd3 = new SimpleDateFormat("dd/MM/yyyy 'and' E MMM dd,yyyy");
		String strDate3 = sd3.format(d);
		System.out.println(strDate3);
	}
	private static String acceptingDate(String s) {
		return s;
	}

}

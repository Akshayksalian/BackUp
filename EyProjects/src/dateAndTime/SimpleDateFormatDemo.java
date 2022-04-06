package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		
		GregorianCalendar gc1 = new GregorianCalendar(2000,Calendar.AUGUST,20,17,20,34);
		Date date1 = gc1.getTime();
		
		// To change the formats.
		// M should be capital for months and small for minutes.
		SimpleDateFormat sd1 = new SimpleDateFormat("dd/MM/yyyy");
		String strDate1 = sd1.format(date1);
		System.out.println(strDate1);
		
		// we can add strings in between.
		// z gives which standard time it is in. example : ISD
		// zzzz say which standard time it is in words.
		SimpleDateFormat sd2 = new SimpleDateFormat("MM/dd/yyyy 'T' HH:mm:ss zzzz");
		String strDate2 = sd2.format(date1);
		System.out.println(strDate2);
		
		// MMM gives month in text but not the full wordings.
		// MMMM gives the month in words.
		// a gives whether its pm or am.
		// E for which day it is : Example : Sunday 
		// EEEE for full day in words.
		SimpleDateFormat sd3 = new SimpleDateFormat("MMM/dd/yyyy 'T' HH:mm:ss EEEE a");
		String strDate3 = sd3.format(date1);
		System.out.println(strDate3);
	}
}

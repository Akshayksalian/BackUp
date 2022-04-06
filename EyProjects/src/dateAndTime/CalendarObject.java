package dateAndTime;
import java.util.*;
public class CalendarObject {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.getTimeZone());
		System.out.println(c.getCalendarType());
		
		// Custom Date and Time Creation.
		GregorianCalendar gc1 = new GregorianCalendar(2000,Calendar.AUGUST,20,17,20,13);
		Date date1 = gc1.getTime();
		
		System.out.println("My birth Day is "+gc1.get(Calendar.DATE));
		// January starts from 0 .
		System.out.println("My birth Month "+gc1.get(Calendar.MONTH));
		System.out.println("My birth Year "+gc1.get(Calendar.YEAR));
		System.out.println("My birth Hour "+gc1.get(Calendar.HOUR));
		System.out.println("In 24 hrs format "+gc1.get(Calendar.HOUR_OF_DAY));
		System.out.println("Leap year ? "+gc1.isLeapYear(2000));
		
		System.out.println("My Date is "+date1);
		
		GregorianCalendar gc2 = new GregorianCalendar(2018,Calendar.JUNE,21,05,07,16);
		Date date2 = gc2.getTime();
		
		
		// 0 is equal less than 0 is before the time. greater than after the time.
		System.out.println(gc1.compareTo(gc2));  
		System.out.println(date2);
		
		GregorianCalendar gc3 = new GregorianCalendar();
		Date date3 = gc3.getTime();
		System.out.println(gc1.after(gc3));
		System.out.println(gc1.before(gc3));
		System.out.println(date3);
		System.out.println(gc1.equals(gc3));
		
	}
}

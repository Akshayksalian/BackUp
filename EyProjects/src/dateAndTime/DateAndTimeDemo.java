package dateAndTime;
import java.util.*;
public class DateAndTimeDemo {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		// millisecond calculated from 1st January 1970.
		System.out.println(date.getTime());
	}

}

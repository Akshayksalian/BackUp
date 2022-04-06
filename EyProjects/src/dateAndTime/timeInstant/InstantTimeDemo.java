package dateAndTime.timeInstant;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstantTimeDemo {
	public static void main(String[] args) {
	
		LocalDate ld = LocalDate.now();
		System.out.println("Date : "+ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Date and Time "+ldt);
		
//		LocalDateTime l1 = LocalDateTime.of(20,08,2000);
		
	}
}

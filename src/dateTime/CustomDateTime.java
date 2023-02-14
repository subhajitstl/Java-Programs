package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CustomDateTime {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2023, 01, 17);
		LocalDate d2 = LocalDate.of(2023, Month.JANUARY, 17);
		
		System.out.println("Todays date " + (d1));
		System.out.println("Todays date " + (d2));
		
		LocalTime t1=LocalTime.of(20, 00);
		LocalTime t2=LocalTime.of(20,30,50);
		
		System.out.println("Todays Time " + (t1));
		System.out.println("Todays date " + (t2));
		
		LocalDateTime dt1=LocalDateTime.of(d1, t1);
		LocalDateTime dt2=LocalDateTime.of(d2, t2);
		
		System.out.println("Todays Date and Time " + (dt1));
		System.out.println("Todays Date and Time " + (dt2));
		
		
		

	}

}

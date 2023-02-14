package dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeDifference {

	public static void main(String[] args) {
		LocalDate d1= LocalDate.of(1963, 10, 03);
		Period p1 = Period.between(d1, LocalDate.now());
		System.out.println("The difference is " + p1.getYears() + " years " + p1.getMonths() + " month " + p1.getDays() + " days ");
		
		
		LocalTime t1= LocalTime.of(20, 22);
		Duration d2 = Duration.between(t1, LocalTime.now());
		System.out.println(d2);
		System.out.println(d2.toHours());
		System.out.println(d2.toMinutes());
		

	}

}

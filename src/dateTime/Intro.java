package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Todays Date: " + LocalDate.now());
		System.out.println("Todays Time: " + LocalTime.now());
		System.out.println("Todays date and time: " + LocalDateTime.now());
		
		
		//plus/minus
		//Chronounit
		
		LocalDate d1 = LocalDate.now().plusDays(30);
		LocalTime d2 = LocalTime.now().plusHours(79);
		
		System.out.println("Todays Date plus 10 days: " + d1);
		System.out.println("Todays Time plus 79 hrs: " + d2);
		
	}

}

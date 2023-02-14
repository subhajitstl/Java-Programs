package dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormater {

	public static void main(String[] args) {
		String str = "17/01/2023";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-yyyy][MMM-dd-yyyy][dd-MM-yy]");
		
		LocalDate d1 = LocalDate.parse(str,formatter);
		
		System.out.println("Todays date " + d1);

	}

}

package string_Operations;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//using StringBuffer class
		
		Scanner Sc = new Scanner(System.in);
		
		//INPUT STRING
		System.out.println("ENTER A STRING");
		String str = Sc.nextLine();
		
		//USING StringBuilder TAKE INPUT OF str
		StringBuilder sb = new StringBuilder(str);
		
		//REVERSE sb 
		System.out.println(sb.reverse());
				
	
	}

}

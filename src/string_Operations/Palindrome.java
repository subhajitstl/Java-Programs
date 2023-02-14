package string_Operations;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String ReverseStr = "";
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String str= Sc.nextLine();
		
		for(int i=str.length()-1; i>=0; i--) {
			ReverseStr = ReverseStr + str.charAt(i);
		}
		
		
		if (str.toLowerCase().equals(ReverseStr.toLowerCase())){
			System.out.println( str + " Is a palindrome string");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}

package string_Operations;

import java.util.Scanner;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String str= Sc.nextLine();
		
		str=str.replaceAll("[AEIOUaeiou]", "");
		System.out.println("STRING AFTER REMOVAl: " +str);
		
		
			

	}

}

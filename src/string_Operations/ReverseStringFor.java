package string_Operations;

import java.util.Scanner;

public class ReverseStringFor {

	public static void main(String[] args) {
		//using iterative method
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("ENTER A STRING");
		String str = Sc.nextLine();
		String temp="";
	
		for(int i=0; i<=str.length()-1;i++) {
			temp = str.charAt(i) + temp;
			}
		System.out.println("Reverse String is " + temp);

	}

}



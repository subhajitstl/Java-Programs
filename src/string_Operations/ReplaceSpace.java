package string_Operations;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Stirng");
		String str = sc.nextLine();
		
		String ch ="_";
		
		str=str.replace(" ",ch);
		System.out.println(str);
		
	}

}

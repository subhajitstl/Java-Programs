package string_Operations;
import java.util.Scanner;

public class PrintSubString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str= sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
}

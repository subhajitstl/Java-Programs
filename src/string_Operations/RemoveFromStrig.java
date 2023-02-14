package string_Operations;
import java.util.Scanner;
public class RemoveFromStrig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		str = str.replaceAll("[0123456789]","");
		
		System.out.println(" String after replacement: " +str);
		
		
	}

}

package string_Operations;

public class ReplaceOperation {

	public static void main(String[] args) {
		
		/**
		 * Replace - Normal
		 * ReplaceAll - Regex
		 */
		
		String str1="Sterl200ite";
		String str2="200";
		String str3="";
		System.out.println(str1.replace(str2, str3));
		
		
		String a="Ster@323!!li()&%te";
		
		String pattern1="[^A-Za-z]";
		System.out.println(a.replaceAll(pattern1, ""));
		
		
		String pattern2="[^A-Za-z0-9]";
		System.out.println(a.replaceAll(pattern2, ""));
	}

}

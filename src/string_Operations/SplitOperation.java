package string_Operations;

import java.util.Iterator;

public class SplitOperation {

	public static void main(String[] args) {
		String str1="Sterl2000ite";
		String str2="2000";
		String[] arr=str1.split(str2);
		for(String x: arr) {
		System.out.print(x);
		}
	}

}

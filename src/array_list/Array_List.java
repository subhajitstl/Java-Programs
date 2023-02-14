package array_list;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("red");
		arr.add("blue");
		arr.add("Green");
		arr.add("White");
		arr.add("black");
		arr.add("Brown");
		arr.add("Brown");
		System.out.println(arr);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(2));
		
		arr.set(0, "Pink");
		System.out.println(arr.get(0));
		
		arr.remove(0);
		System.out.println(arr);
		
		System.out.println("Index of White " +arr.indexOf("White"));
		
		System.out.println("Index of Brown " +arr.indexOf("Brown"));
		
		System.out.println("If Beige Colour present or not" + arr.contains("Beige"));
		
		System.out.println("New list" + arr.subList(2, 4));
		
		System.out.println("Is array Emplty" + arr.isEmpty());
		
		System.out.println("Size of the array" +arr.size());
		System.out.println("-----------------------------------------------------");
		
		for(String x :arr) {
			System.out.println(x);
		}
		

	}

}

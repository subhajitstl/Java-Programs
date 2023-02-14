package sets;

import java.util.*;


public class IteratorMethod {

	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		System.out.println("Data Without iteration " +set1);
		
		//iteration method
		Iterator newData=set1.iterator();
		while(newData.hasNext()) {
			System.out.println("Data after Iteration "+newData );
		}
		
		
	}

}

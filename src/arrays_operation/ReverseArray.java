package arrays_operation;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= new int[5] ;
		
		System.out.println("Enter "+arr.length+" integer values");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Reverse array" +arr[i]);
		}

	}

}

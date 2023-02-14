package arrays_operation;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc=new Scanner(System.in);
		int [] arr= new int[5] ;
		
		System.out.println("Enter "+arr.length+" integer values");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of array " + sum);

	}

}

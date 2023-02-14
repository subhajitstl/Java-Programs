package arrays_operation;

import java.util.Scanner;

public class SortArray {
	

	public static void main(String[] args) {
		int temp=0;
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[5] ;
		
		System.out.println("Enter " +arr.length+ " no of integer in array");
		
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		
		//sorting
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			    }
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println("Array after sorting" +arr[i]);
		}
	}

}

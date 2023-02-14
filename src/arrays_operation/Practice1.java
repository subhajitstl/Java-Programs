package arrays_operation;

public class Practice1 {
	public static void main(String[] args) {
		
		//Write a program to reverse an array//
		int[] arr = {10,20,30,40,50,60};
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Array in correct order " +arr[i]);
		}
		System.out.println("________________________");
		for(int i=arr.length-1; i>=0;i--) {
			System.out.println("Array in reverse order: " + arr[i]);
			
		}
	}

}

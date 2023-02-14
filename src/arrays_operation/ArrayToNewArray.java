package arrays_operation;

public class ArrayToNewArray {

	public static void main(String[] args) {
		//array 1
		int[] arr1 = {1,2,3,4,5};
		//assign length of arr1 to arr2
		int arr2[] = new int[arr1.length];
		
		//copying element of arr1 to arr2
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		//Displaying original arry
		System.out.println("Array of given data");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();
		
		//Displaying copied array
		System.out.println("Array after coping");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i] + " ");
		}
		
		
		
		
		
		

	}

}

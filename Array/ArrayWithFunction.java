package Array;

import java.util.Scanner;

public class ArrayWithFunction {

	public static void Print(int [] arr) {
		
		// arr.length Gives Array Size .
//		 System.out.println(arr.length);
		
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Input Size
	// Create an Array
		// Take User Input for Each Block.
		Scanner s= new Scanner(System.in);
		
		int size= s.nextInt();
		
		int [] arr= new int[size];
		
		for(int i=0; i<size;i++) {
			arr[i]= s.nextInt();
		}

		Print(arr);
		
		
	}

}

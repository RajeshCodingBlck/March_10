package Recursion_revision;

public class PrintArray {

	
	public static void PrintArray(int [] arr, int n) {
		
		if(n==0) {
			return;
		}
		
		PrintArray(arr, n-1);
		System.out.println(arr[arr.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5,6};
      PrintArray(arr, arr.length);
	}

}

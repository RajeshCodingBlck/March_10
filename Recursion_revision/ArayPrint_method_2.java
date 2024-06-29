package Recursion_revision;

public class ArayPrint_method_2 {

	//  i se Start hone vale array ko Print karenga.
	public static void PrintArray(int [] arr, int i) {
		
		if(i== arr.length) {
			return ;
		}
		
		System.out.println(arr[i]);
		PrintArray(arr, i+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,3,4,5,6};
     PrintArray(arr,0);
	}

}

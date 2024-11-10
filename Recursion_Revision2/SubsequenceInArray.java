package Recursion_Revision2;

public class SubsequenceInArray {

	public static void PrintSubsequence(int [] arr,
			int i, String ans) {
		
		if(i==arr.length) {	
			System.out.println(ans);
			return;
		}
		
		
		PrintSubsequence(arr,i+1, ans+ arr[i]);
		PrintSubsequence(arr, i+1, ans+"");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4};
      PrintSubsequence(arr, 0, "");
	}

}

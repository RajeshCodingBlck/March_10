package Searching;

public class Linear_Search {

	
	public static boolean linearSearch(int [] arr, int target_value) {
		
		for(int i=0; i<arr.length;i++) {
			 if(arr[i]==target_value) {
				 return true;
			 }	 
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,3,7,2,10,3,2,5};
      int target_value=10;
      System.out.println(linearSearch(arr, target_value));
      
	}
}

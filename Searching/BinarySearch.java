package Searching;

import java.util.Arrays;

public class BinarySearch {
   
	public static boolean BinarySearch(int [] arr, int target_value) {
	
	// Agar Mughe BS Lagana he to , Search Space Sorted hona Jaruri he.
	// currently our Search Space is Array.
		Arrays.sort(arr);
		int low=0; 
		int high=arr.length-1;
		while(low<=high) {
			
			int mid= (low+high)/2;
			
			if(arr[mid]==target_value) {
				return true;
			}else if(arr[mid]> target_value) {
				high=mid-1;
			}else {
				low=mid+1;
			}	
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3,2,1,4,2,10,11,13};
      int target_value= 5;
      
      System.out.println(BinarySearch(arr, target_value));
	}

}

package Searching;

import java.util.Arrays;

public class BinarySearch2 {
	public static int BinarySearch(int [] arr, int target_value) {
		
		// Agar Mughe BS Lagana he to , Search Space Sorted hona Jaruri he.
		// currently our Search Space is Array.
			Arrays.sort(arr);
			int low=0; 
			int high=arr.length-1;
			
			int Potential_candidate=-1;
			while(low<=high) {
				
				int mid= (low+high)/2;
				
				if(arr[mid]==target_value) {
					Potential_candidate=mid;
					high=mid-1;
				}else if(arr[mid]> target_value) {
					high=mid-1;
				}else {
					low=mid+1;
				}	
			}
			return Potential_candidate;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,1,2,2,2,2,2,4,4,5};
      int target_value=4;
      System.out.println(BinarySearch(arr,target_value));
      
	}

}

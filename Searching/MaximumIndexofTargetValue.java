package Searching;

public class MaximumIndexofTargetValue {
    
	public static int helper(int [] arr, int target) {
		
		int low=0;
		int high=arr.length-1;
		int potential_candidate=-1;
		while(low<=high) {	
			int mid=(low+high)/2;
			if(arr[mid]==target) {
	
				potential_candidate=mid;
				low=mid+1;
				
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return potential_candidate;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,2,2,2,3,3,4,10,17};
       System.out.println(helper(arr, 18));
	}

}

package Array_Question;

public class MinimumSubarraySum {

	public static int MinimumSubarraySum(int [] arr) {
		
		int overall_min= Integer.MAX_VALUE;	
		int currsum=0;	
		for(int i=0; i<arr.length;i++) {	
			currsum+=arr[i];
			overall_min= Math.min(overall_min, currsum);
			
			if(currsum>0) {
				currsum=0;
			}
		}
		return overall_min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {2,1,3,5,4};
      
      System.out.println(MinimumSubarraySum(arr));
	}

}

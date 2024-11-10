package DynamicProgramming;

public class MaximumSubarraySum {
	class Solution {
	    public int maxSubArray(int[] nums) {
	      
	     int n= nums.length;
	     int [] dp= new int[n];
	     dp[0]=nums[0];
	     for(int i=1;i<n;i++){
	         dp[i]=Math.max(dp[i-1]+nums[i], nums[i]);
	     }
	     int ans=Integer.MIN_VALUE;
	      for(int i=0; i<n;i++){
	          ans= Math.max(dp[i], ans);
	      }
	        return ans;
	    }
	}
}
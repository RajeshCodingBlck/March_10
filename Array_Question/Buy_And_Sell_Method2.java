package Array_Question;

public class Buy_And_Sell_Method2 {

	// https://leetcode.com/submissions/detail/1261294390/
	class Solution {
	    public int maxProfit(int[] arr) {
	        
	      int n=arr.length;
	      int [] left_min= new int[n];
	        
	      left_min[0]=Integer.MAX_VALUE;
	       
	       for(int i=1;i< n;i++){
	           
	           left_min[i]= Math.min(left_min[i-1], arr[i-1]);
	       }
	        
	       int overall_max=0;
	      
	        for(int i=1; i<n;i++){
	            
	            int curr_profit= arr[i]-left_min[i];
	            overall_max=Math.max(curr_profit, overall_max);
	        }
	        
	        return overall_max;
	        
	        
	    }
	}
}

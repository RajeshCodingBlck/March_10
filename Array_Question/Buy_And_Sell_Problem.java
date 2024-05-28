package Array_Question;

public class Buy_And_Sell_Problem {
	
//	https://leetcode.com/submissions/detail/1261275377/
	class Solution {
	    public int maxProfit(int[] arr) {
	        
	       int overall_max=0; 
	      for(int buy=0;buy<arr.length-1;buy++){
	          
	          for(int sell=buy+1; sell<arr.length;sell++){
	              
	   // System.out.print("cut is from "+ buy +" , "+sell+" ");
	                
	      int curr_profit=  arr[sell]-arr[buy];
	      overall_max= Math.max(curr_profit, overall_max);
	              
	      //  System.out.println(curr_profit);
	          }
	      }
	        
	        return overall_max;
	    }
	}
	
	
	
}

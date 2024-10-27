package DynamicProgramming;

public class UniquePath2 {
	class Solution {
	     public int helper(int curr_r, int curr_c, int des_r, int des_c, int [][] dp, int [][] arr){
	         
	        if(curr_r> des_r || curr_c> des_c ){ // -ve Base Case
	            return 0;
	        }
	        if(arr[curr_r][curr_c]==1){
	            return 0;
	        }
	        if(curr_r== des_r && curr_c==des_c){
	             return 1;
	        }
	        
	        
	        
	        if(dp[curr_r][curr_c] !=-1){
	            return dp[curr_r][curr_c];
	        }
	        
	        // Right Move
	         int ans1= helper(curr_r, curr_c+1, des_r, des_c, dp, arr);
	        // Down Move
	        int ans2=helper(curr_r+1, curr_c, des_r, des_c, dp,arr);
	        int meraAns= ans1+ans2;
	        dp[curr_r][curr_c]=meraAns;
	        return  meraAns;
	    }
	    public int uniquePathsWithObstacles(int[][] arr) {
	        
	        int m=arr.length;
	        int n= arr[0].length;
	         int [][] dp= new int[m][n];
	         for(int i=0; i<m;i++){
	             for(int j=0;j<n;j++){
	                 dp[i][j]=-1;
	             }
	         }
	        return helper(0,0, m-1, n-1, dp, arr);
	    }
	}
}

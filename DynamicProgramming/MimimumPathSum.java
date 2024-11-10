package DynamicProgramming;

public class MimimumPathSum {
   
	class Solution {
	    
	    public int helper(int curr_r, int curr_c, int des_r,
	                      int des_c, int [][] grid, int [][]dp ){
	        
	        // -veBase Case
	        if(curr_r>des_r || curr_c>des_c){ //-ve Base
	            return  (int)1e7;
	        }
	        if(curr_r==des_r && curr_c==des_c){
	            return grid[curr_r][curr_c];
	        }
	        
	        if(dp[curr_r][curr_c] !=-1){
	            return dp[curr_r][curr_c];
	        }
	        
	       // Right Side Move
	       int ans1= helper(curr_r, curr_c+1, des_r, des_c, grid, dp);
	        // Down Side Move
	       int ans2= helper(curr_r+1, curr_c, des_r, des_c, grid, dp);
	        
	       int meraAns=  Math.min(ans1, ans2)+grid[curr_r][curr_c];
	        dp[curr_r][curr_c]=meraAns;
	        return meraAns;
	    }
	    public int minPathSum(int[][] grid) {
	      
	        int n= grid.length;
	        int m= grid[0].length;
	        int [] [] dp= new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0; j<m;j++){
	                dp[i][j]=-1;
	            }
	        }
	        return helper(0,0, grid.length-1, grid[0].length-1, grid, dp);
	    }
	}
}

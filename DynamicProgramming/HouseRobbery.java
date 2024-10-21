package DynamicProgramming;

public class HouseRobbery {
     
	class Solution {
	    
	    public int helper(int [] nums, int i, int [] brain){
	        
	           if(i>= nums.length){
	              return 0; 
	           }
	        // ith ghar ka kaam
	        
	          if(brain[i] != -1){
	              return brain[i];
	          }
	        
	        // 1) chori karenge
	           int ans1= nums[i]+ helper(nums, i+2, brain);
	           
	        // 2) Nahi chori nahi karenge
	           int ans2=0+helper(nums, i+1 , brain); 
	           int meraAns= Math.max(ans1, ans2);
	            brain[i]= meraAns;
	           return meraAns;
	    }
	    public int rob(int[] nums) {
	        
	        int [] brain= new int[nums.length+1];
	        
	        for(int i=0; i<brain.length;i++){
	            brain[i]=-1;
	        }
	        return helper(nums, 0, brain);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

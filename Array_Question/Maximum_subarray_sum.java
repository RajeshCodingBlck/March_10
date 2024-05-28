package Array_Question;

// leetCode Code...
class Solution {
    public int maxSubArray(int[] nums) {
        
        
        int overall_max_sum=Integer.MIN_VALUE;
     
        for(int s=0; s<nums.length;s++){           
            for(int e=s; e<nums.length;e++){               
                int currSubarraySum=0;
                for(int k=s; k<=e;k++){     
                    currSubarraySum+=nums[k];    
                }
                
                overall_max_sum= Math.max(currSubarraySum, overall_max_sum);
            }
        }
        
        return overall_max_sum;
    }
}
public class Maximum_subarray_sum {

}

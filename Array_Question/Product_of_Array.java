package Array_Question;

public class Product_of_Array {

	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        
	        int n=nums.length;
	        int [] ans= new int[n];
	        
	      for(int i=0; i<n;i++){
	          int product=1;
	          for(int j=0; j<n;j++){
	                
	              if(i==j){
	                  continue;
	              }            
	              product=product*nums[j];
	              
	          }        
	          ans[i]=product;
	      }
	        
	       return ans;
	    }
	}
}

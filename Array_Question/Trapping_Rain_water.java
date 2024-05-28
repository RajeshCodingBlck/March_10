package Array_Question;

public class Trapping_Rain_water {

	class Solution {
	    public int trap(int[] height) {
	        
	     int n= height.length;
	    
	    int [] left_max= new int[n];
	    left_max[0]=height[0];
	        
	    for(int i=1; i<n;i++){
	        
	        left_max[i]= Math.max(left_max[i-1], height[i]);
	    }
	    
	     int [] right_max= new int[n];
	     right_max[n-1]  = height[n-1];
	        
	      for(int i=n-2; i>=0; i--){
	          right_max[i]= Math.max(right_max[i+1], height[i]);
	          
	      }
	        
	       int total_water_contain=0;
	      
	    for(int i=0; i<n;i++){
	        
	  int curr_water_level= 
	      Math.min(left_max[i], right_max[i])-height[i];
	    total_water_contain+= curr_water_level;
	        
	}
	        return total_water_contain;    
	    }
	}

}

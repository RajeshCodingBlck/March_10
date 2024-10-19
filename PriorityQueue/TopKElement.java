package PriorityQueue;

import java.util.PriorityQueue;

public class TopKElement {

	public static int findKthLargest(int[] nums, int k) {
	       
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        
        PriorityQueue<Integer> pq= new PriorityQueue();
        
        int n= nums.length;
        for(int i=0; i<n;i++){
            
            if(pq.size()<k){
                pq.add(nums[i]);
            }else{
              
                pq.add(nums[i]);
                pq.remove();
              }
        }
        
        return pq.peek();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

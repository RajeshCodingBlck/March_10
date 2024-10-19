package PriorityQueue;

import java.util.PriorityQueue;

public class RopeProblem {
   
	 public long minCost(long[] arr) {
	        
	        PriorityQueue<Long> pq= new PriorityQueue();
	        for(long val : arr){
	            pq.add(val);
	        }
	        
	        long overallAns=0;
	        while(pq.size()>1){
	            
	            long rope1= pq.remove();
	            long rope2= pq.remove();
	            
	            long cost= rope1+rope2;
	            long newLength= rope1+rope2;
	            overallAns+=cost;
	            pq.add(newLength);
	        }
	        return overallAns;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

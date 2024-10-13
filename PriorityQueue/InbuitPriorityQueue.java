package PriorityQueue;

import java.util.PriorityQueue;

public class InbuitPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PriorityQueue<Integer> pq= new PriorityQueue();
     
      // add the Items
      pq.add(12);
      pq.add(13);
      pq.add(1);
      pq.add(14);
      
      System.out.println(pq);
      
      // get 
      System.out.println(pq.peek());
      
      // remove
      pq.remove(); // remove the peek element
      
      System.out.println(pq.peek());
      
//      // Size
      System.out.println(pq.size());
//      
//      // iterate on PriorityQueue
      while(pq.size()>0) {
    	  System.out.println(pq.peek());
    	  pq.remove();
      }
      
     
	}

}

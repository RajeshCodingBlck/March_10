package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class cmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		 
		if(o1> o2) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
public class HeapSort {
     
	public static void Sort(int [] arr) {
		
		PriorityQueue<Integer> pq= new PriorityQueue(new cmp());
		
		for(int i=0;i<arr.length;i++) {
			pq.add(-1*arr[i]);
		}
		int index=0;
		while(pq.size() !=0) {
			arr[index]= -1*pq.peek();
			pq.remove();
			index++;
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {10,4,3,2,1,10,100};
        Sort(arr);
        for(int val : arr) {
        	System.out.print(val +" ");
        }
        
	}

}

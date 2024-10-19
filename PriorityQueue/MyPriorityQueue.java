package PriorityQueue;

import java.util.*;

public class MyPriorityQueue {
    
	ArrayList<Integer> arr;
	MyPriorityQueue(){
		arr= new ArrayList();
	}
	
	private int parentIndex(int ci) {	
		return (ci-1)/2;
	}
	
	private int leftChildIndex(int pi) {
		return 2*pi +1;
	}
	private int rightChildIndex(int pi) {
		return 2*pi+2;
	}
	
	public int  size() {
		return arr.size();
	}
	
	// add Function
	public void add(int val) {
		
		// CBT
		arr.add(val);
		upHeapify(arr.size()-1);
	}

	private void upHeapify(int ci) {
		// TODO Auto-generated method stub
		
		if(ci==0) {
			return;
		}
		int parentIndex= parentIndex(ci);
		
		if(arr.get(parentIndex)> arr.get(ci)) {
			 swap(ci, parentIndex);
			 upHeapify(parentIndex);
		}else {
			return ;
		}
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp= arr.get(i);
		arr.set(i,arr.get(j) );
		arr.set(j, temp);
	}
	
	public int peek() throws Exception {
		if(size()==0) {
			// throw Exception
		   throw new Exception("PriorityQueue Khali he Bhai");
		}
		return arr.get(0);
	}
	
	public void remove(){
		swap(0, arr.size()-1);
		arr.remove(arr.size()-1);
		downHeapify(0);
	}

	private void downHeapify(int pi) {
		// TODO Auto-generated method stub
		
		if(pi>= arr.size()) {
			return;
		}
		int lci= leftChildIndex(pi);
		int rci= rightChildIndex(pi);
		int minIndex= pi;
		// lci present he
		if(lci< arr.size()
		 && arr.get(lci) < arr.get(minIndex)) {
		   minIndex=lci;	
		}
		if(rci<arr.size() &&
		arr.get(rci) < arr.get(minIndex)) {
			minIndex=rci;
		} 
		if(pi ==minIndex) {
			return;
		}
		swap(pi, minIndex);
		 downHeapify(minIndex);
	}
	
	
}

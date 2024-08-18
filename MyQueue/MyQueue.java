package MyQueue;

public class MyQueue {

	
	int [] arr;
	int front; // Index of First Element
	int rear; // Index of Last Element
	
	MyQueue(){
		arr= new int[5];
		front=-1;
		rear=-1;
	}
	
	//
	public boolean isEmpty() {
		
		if(front==-1 && rear==-1) {
			return true;
		}
		
		return false;
	}
	public boolean isFull() {
		
//		if(rear== arr.length-1) {
//			return true;
//		}else {
//			return false;
//		}
		
		if((rear+1 )%arr.length== front) {
			return true;
		}else {
			return false;
		}
	}
	// add 
	public void enqueue(int val) throws Exception {
		
		if(isFull()) {
			throw new Exception("Queue bhar chukka he");
		}
		if(isEmpty()) {
			front++;
			front= front%arr.length;
		}	
		rear++;
		rear= rear%arr.length;
		arr[rear]=val;
	}
	
	public void dequeue() throws Exception {
		
		if(isEmpty()) {
			// throw Exception
			throw new Exception("Queue Khali ho chukka he");
		}
		
		if(front==rear) { // Queue ke ander ak hi element he
			
			front=-1;
			rear=-1;
			return;
		}
		front++;
		front= front%arr.length;
	}
	public int front() throws Exception{
		
		  if(isEmpty()) {
			  throw new Exception("Bhai me Khali Hu ");
		  }
		
		  return arr[front];
	}
}

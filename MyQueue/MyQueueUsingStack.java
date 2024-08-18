package MyQueue;

import java.util.Stack;

public class MyQueueUsingStack {

	Stack<Integer> st;

	MyQueueUsingStack() {

		st = new Stack();
	}

	public boolean isEmpty() {

		return st.isEmpty();
	}

	public void enqueue(int val) {

		st.push(val);
	}

	public void Dequeue() {

		Stack<Integer> dummy = new Stack();
		while (st.size() > 0) {
			dummy.push(st.pop());
		}
		dummy.pop();
		while (dummy.size() > 0) {
			st.push(dummy.pop());
		}

	}
	
	public int front() {
		
		Stack<Integer> dummy = new Stack();
		while (st.size() > 0) {
			dummy.push(st.pop());
		}
		int  frontElement= dummy.peek();
		while (dummy.size() > 0) {
			st.push(dummy.pop());
		}
		return frontElement;
	}

}

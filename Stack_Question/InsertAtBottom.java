package Stack_Question;

import java.util.*;

public class InsertAtBottom {

	public static void insertAtBottom(Stack<Integer> st,
			int val) {
		
		Stack<Integer> newSt= new Stack();
		
		while(st.size()>0) {
			newSt.push(st.pop());
		}
		
		st.push(val); // Insert AtBottom
		
		while(newSt.size()>0) {
			st.push(newSt.pop());
		}
		
		
	}
	
	public static void InsertAtBottom2(Stack<Integer> st,
			int val){
		
		if(st.size()==0) {
			st.push(val);
			return;
		}
		
		 int topElement=st.pop();
		 InsertAtBottom2(st,val);
		 st.push(topElement);
	}
	
	public static void reverse(Stack<Integer> st) {
		
		if(st.size()==0) {
			return;
		}
		int topElement= st.pop();
		reverse(st);
		insertAtBottom(st,topElement);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Stack<Integer> st= new Stack();
		
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		System.out.println(st);
//		insertAtBottom(st, 100);
		reverse(st);
		System.out.println(st);
	}

}

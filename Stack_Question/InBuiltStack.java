package Stack_Question;

import java.util.Stack;

public class InBuiltStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Stack<Integer> st= new Stack();
		
		st.push(12);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		
		System.out.println(st.size());
	}

}

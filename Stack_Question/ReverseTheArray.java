package Stack_Question;

import java.util.Stack;

public class ReverseTheArray {

	public static void reverse(int [] arr) {
		
		Stack<Integer> st= new Stack();
		
		for(int val : arr) {
			st.push(val);
		}
		
		int index=0;
		while(st.size()>0) {
			
			int topElement= st.pop();
			arr[index]=topElement;
			index++;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  int [] arr= {1,2,3,4,5,6,7};
	   reverse(arr);
	   
	   for( int val : arr) {
		   System.out.print(val+" ");
	   }
	   
	}

}

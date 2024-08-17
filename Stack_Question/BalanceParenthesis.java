package Stack_Question;

import java.util.Stack;

public class BalanceParenthesis {

	public static boolean checkBalance(String str) {
		
		Stack<Character> st= new Stack();
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(ch=='(') {
				st.push('(');
			}else {
			     
				if(st.size()==0) {
					return false;
				}
				st.pop();
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str="())()()";
		
	   System.out.println(checkBalance(str));
		
	}

}

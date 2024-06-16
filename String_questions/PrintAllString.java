package String_questions;

public class PrintAllString {
    
	public static boolean isPalidromic(String str) {
		
		int i=0;
		int j= str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i)== str.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
		
	}
	public static void Print(String str) {
		
		for(int s=0; s<str.length(); s++) {
			for(int e=s ; e<str.length();e++) {
				//System.out.println("cut is from "+ s+ " , "+e);
				//System.out.println(str.substring(s,e+1));
				if(isPalidromic(str.substring(s,e+1))) {
					System.out.println(str.substring(s,e+1));
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Print("Nitin");
      
	}

}

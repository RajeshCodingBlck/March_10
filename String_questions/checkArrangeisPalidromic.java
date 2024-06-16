package String_questions;

public class checkArrangeisPalidromic {
    
	public static boolean check(String str) {
		
		int []fre=new int[256];
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			int ascii=ch;
			fre[ascii]=fre[ascii]+1;
		}
		int count=0;
		// Kitne character odd fre vale he.
		for(int i=0;i<256;i++) {
			
			if(fre[i]%2==1) {
				count++;
			}
		}
		
		if(count==0 || count==1) {
			return true;
		}else {
			return false;
		}
		
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
